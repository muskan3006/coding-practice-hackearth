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
//     * Complete the 'plusMinus' function below.
//     *
//     * The function accepts INTEGER_ARRAY arr as parameter.
//     */
//
//    def plusMinus(arr: Array[Int]) {
//        var positive = 0.0
//        var negative = 0.0
//        var zero = 0.0
//        val length = arr.length
//        arr.map(x => {
//            if(x>0) positive+=1 else if(x<0) negative+=1 else zero+=1
//        })
//        println(f"${positive/length}%1.6f")
//        println(f"${negative/length}%1.6f")
//        println(f"${zero/length}%1.6f")
//
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val n = StdIn.readLine.trim.toInt
//
//        val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
//
//        Result.plusMinus(arr)
//    }
//}
