//import java.io._
//import scala.io._
//
//object Result {
//
//    /*
//     * Complete the 'birthdayCakeCandles' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts INTEGER_ARRAY candles as parameter.
//     */
//
//    def birthdayCakeCandles(candles: Array[Int]): Int = {
//        // Write your code here
//        var maxHeight = 0
//        var noOfCandle = 0
//        candles.map(candle =>
//        {
//            if(candle > maxHeight)
//            {
//                maxHeight = candle
//                noOfCandle = 1
//            } else if(candle == maxHeight)
//            {
//                noOfCandle += 1
//            } else{}
//        })
//
//        noOfCandle
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//        val candlesCount = StdIn.readLine.trim.toInt
//
//        val candles = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
//
//        val result = Result.birthdayCakeCandles(candles)
//
//        printWriter.println(result)
//
//        printWriter.close()
//    }
//}
