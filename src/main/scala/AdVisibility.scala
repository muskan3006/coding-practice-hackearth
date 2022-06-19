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
//     * Complete the 'viralAdvertising' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER n as parameter.
//     */
//
//    def viralAdvertising(n: Int): Int = {
//        // Write your code here
//        def findViewers(noOfDay : Int, noOfViewersLiked : Int, dayViewers : Int) : Int ={
//            if(noOfDay <= n){
//                findViewers(noOfDay + 1, noOfViewersLiked + floor(dayViewers/2).toInt , floor(dayViewers/2).toInt * 3)
//            } else {
//                noOfViewersLiked
//            }
//        }
//        findViewers(1, 0, 5)
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//        val n = StdIn.readLine.trim.toInt
//
//        val result = Result.viralAdvertising(n)
//
//        printWriter.println(result)
//
//        printWriter.close()
//    }
//}
