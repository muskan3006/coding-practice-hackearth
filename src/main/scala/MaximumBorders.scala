import scala.io.StdIn

object MaximumBorders extends App {
    val testCases = StdIn.readInt()
    for (i <- 1 to testCases) {
        val Array(rows, column) = StdIn.readLine().split(" ").map(_.toInt)
        var count = 0
        var ans = 0
        for (j <- 1 to rows) {
            val data = StdIn.readLine()
            data.foreach(c => {
                if (c == '#') {
                    count += 1
                } else {
                    ans = ans.max(count)
                    count = 0
                }
            })
        }
        println(ans)
    }
}