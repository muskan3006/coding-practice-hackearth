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
//
//
//object Result {
//
//    /*
//     * Complete the 'fizzBuzz' function below.
//     *
//     * The function accepts INTEGER n as parameter.
//     */
//
//    def fizzBuzz(n: Int): Unit = {
//        for(i <- 1 to n)
//        {
//            if(i % 3 == 0 && i % 5 == 0)
//            {
//                println("FizzBuzz")
//            } else if(i%3 == 0)
//            {
//                println("Fizz")
//            } else if(i%5 == 0)
//            {
//                println("Buzz")
//            }
//            else
//            {
//                println(i)
//            }
//        }
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val n = StdIn.readLine.trim.toInt
//
//        Result.fizzBuzz(n)
//    }
//}
