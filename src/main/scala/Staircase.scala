//import scala.io._
//
//object Result {
//
//    /*
//     * Complete the 'staircase' function below.
//     *
//     * The function accepts INTEGER n as parameter.
//     */
//
//    def staircase(n: Int): Unit = {
//        for(line <- 0 until n)
//        {
//            for(element <- 0 until n)
//            {
//                if(element >= n - line - 1) print("#") else print(" ")
//            }
//            println("\n")
//        }
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val n = StdIn.readLine.trim.toInt
//
//        Result.staircase(n)
//    }
//}
