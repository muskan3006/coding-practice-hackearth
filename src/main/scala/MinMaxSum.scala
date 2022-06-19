//import scala.io._
//
//object Result {
//
//    /*
//     * Complete the 'miniMaxSum' function below.
//     *
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    def miniMaxSum(arr: Array[Int]) {
//        // Write your code here
//        val sortedArray = arr.sorted.map(_.toLong)
//        println(s"${sortedArray.sum - sortedArray.last} ${sortedArray.sum - sortedArray.head}")
//
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//
//        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
//
//        Result.miniMaxSum(arr)
//    }
//}
