package interview.apple

/**
 * Given that you have train routes running from one station to another, find out which routes are still missing so that more trains can be scheduled on these routes.

Following are the routes where train is running:

S1 TO S5
S21 TO S23
S10 TO S20
S2 TO S7
S25 TO S30
S3 TO S5

Assume that station numbers S1, S2, S3 are in increasing order.

Here the routes S1 to S5, S2 to S7 and S3 to S5 are either adjacent or overlapping with each other. So we can say the route is available from S1 to S7. In similar way following routes can be considered as existing:

S1 to S7
S10 to S20
S21 to S23
S25 to S30

We will consider S1 as the first station and S30 as the last station. So following routes are missing:

S7 TO S10
S20 TO S21
S23 TO S25.

If we add existing and missing routes, we should be able to travel from S1 to S30.


def yourMethod(routes: Seq[Route]): Seq[Route]



 */
object Stations extends App{
  case class Route(startStation : Int, endStation: Int)
  val r1 = Route(1, 5)
  val r2 = Route(21, 23)

  def yourMethod(routes: Seq[Route]): Seq[Route] ={
    implicit  val ordering = new Ordering[Route] {
      override def compare(x: Route, y: Route): Int = if(x.startStation < y.startStation) -1 else if(x.startStation > y.startStation) 1 else 0
    }
    val sortedRoutes = routes.sorted.toList
    def helper(currentStation: Int, sortedRoutes: List[Route], resultSeq: Seq[Route]): Seq[Route] ={
      sortedRoutes match {
        case Nil => resultSeq
        case ::(head, next) if currentStation >= head.startStation && currentStation <= head.endStation=>
          helper(head.endStation, next, resultSeq)
        case ::(head, next) if head.startStation > currentStation =>
          helper(head.endStation, next, resultSeq ++ Seq(Route(currentStation, head.startStation)))
        case ::(_, next) => helper(currentStation, next, resultSeq)
      }
    }
    helper(1, sortedRoutes, Seq())
  }

  println(yourMethod(Seq(Route(1, 5), Route(21, 23), Route(10, 20), Route(2, 7), Route(25, 30), Route(3, 5))))
}