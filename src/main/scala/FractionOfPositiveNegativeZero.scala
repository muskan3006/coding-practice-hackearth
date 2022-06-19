//import scala.io.StdIn
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
//
//        def countPositiveNegativeZero(list: List[Int], positiveCount : Double, negativeCount : Double, zeroCount : Double) : (Double, Double, Double) =
//        {
//            list match {
//                case Nil => (positiveCount, negativeCount, zeroCount)
//                case element :: rest if (element > 0) => countPositiveNegativeZero(rest, positiveCount + 1, negativeCount, zeroCount)
//                case element :: rest if (element < 0) => countPositiveNegativeZero(rest, positiveCount, negativeCount + 1, zeroCount)
//                case element :: rest if (element == 0) => countPositiveNegativeZero(rest, positiveCount, negativeCount, zeroCount +1)
//            }
//        }
//
//        val counts = countPositiveNegativeZero(arr.toList, 0, 0, 0)
//        println(counts)
//        println(f"${counts._1/arr.length}%1.6f")
//        println(f"${counts._2/arr.length}%1.6f")
//        println(f"${counts._3/arr.length}%1.6f")
//    }
//
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
