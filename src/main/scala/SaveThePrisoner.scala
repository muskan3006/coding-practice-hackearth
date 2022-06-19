//import scala.io._
//
//object Result1 extends App {
//
//    /*
//     * Complete the 'saveThePrisoner' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. INTEGER m
//     *  3. INTEGER s
//     */
//
//    def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
//        // Write your code here
//        val diff = s - 1
//        val rawindex = m % n
//        val xyz = (rawindex + diff) % n
//        if (xyz == 0) n
//        else {
//
//            xyz
//        }
//    }
//
//    println(saveThePrisoner(7 ,19 ,2))
//}
//
//object Solution {
//    def main(args: Array[String]) {
//
//        val t = StdIn.readLine.trim.toInt
//
//        for (tItr <- 1 to t) {
//            val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")
//
//            val n = firstMultipleInput(0).toInt
//
//            val m = firstMultipleInput(1).toInt
//
//            val s = firstMultipleInput(2).toInt
//
//            val result = Result1.saveThePrisoner(n, m, s)
//            println(result)
//        }
//    }
//}
