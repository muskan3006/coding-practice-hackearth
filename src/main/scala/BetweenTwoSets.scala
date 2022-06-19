//import java.io._
//import java.math._
//import java.security._
//import java.text._
//import java.util._
//import java.util.concurrent._
//import java.util.function._
//import java.util.regex._
//import java.util.stream._
//import scala.collection.immutable._
//import scala.collection.mutable._
//import scala.collection.concurrent._
//import scala.concurrent._
//import scala.io._
//import scala.math._
//import scala.sys._
//import scala.util.matching._
//import scala.reflect._
//
//object Result {
//
//    /*
//     * Complete the 'getTotalX' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY a
//     *  2. INTEGER_ARRAY b
//     */
//
//    def getTotalX(a: Array[Int], b: Array[Int]): Int = {
//        // Write your code here
//        val sortedA = a.sorted
//        val sortedB = b.sorted
//
//        if(a.nonEmpty && b.nonEmpty){
//            val element = (sortedA.last to sortedB.head).find(elem => {
//                val isMultiple = !sortedA.map(x => elem % x == 0).exists(value => value == false)
//                val isFactor = !sortedB.map(y => y % elem == 0).exists(value => value == false)
//                isMultiple && isFactor
//            })
//
//            if(element.isDefined) {
//                sortedB.head / element.get
//            } else {
//                0
//            }
//        } else {
//            0
//        }
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//        val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")
//
//        val n = firstMultipleInput(0).toInt
//
//        val m = firstMultipleInput(1).toInt
//
//        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
//
//        val brr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
//
//        val total = Result.getTotalX(arr, brr)
//
//        printWriter.println(total)
//
//        printWriter.close()
//    }
//}
