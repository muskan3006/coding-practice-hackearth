//import java.io._
//import scala.io._
//import scala.util.control.Breaks.{break, breakable}
//
//object Result {
//
//    /*
//     * Complete the 'kangaroo' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER x1
//     *  2. INTEGER v1
//     *  3. INTEGER x2
//     *  4. INTEGER v2
//     */
////
//    def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
//        var kangaroo1Location = x1
//        var kangaroo2Location = x2
//        // Write your code here
//        var exist = false
//        breakable {
//            while (true) {
//                if (kangaroo1Location == kangaroo2Location) {
//                    exist = true
//                    break
//                }
//                if((kangaroo1Location > kangaroo2Location && v1 > v2) || (kangaroo2Location > kangaroo1Location && v2 > v1) || (v2 == v1 && kangaroo2Location != kangaroo1Location)){
//                    exist = false
//                    break
//                }
//                kangaroo1Location += v1
//                kangaroo2Location += v2
//            }
//        }
//
//        if(exist) "YES" else "NO"
//
//    }
//
//    def check(x1: Int, v1: Int, x2: Int, v2: Int, commonPointForKangaroos: Int): String = {
//        if ((commonPointForKangaroos - x1) / v1 == (commonPointForKangaroos - x2) / v2) "YES" else ""
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
//        val x1 = firstMultipleInput(0).toInt
//
//        val v1 = firstMultipleInput(1).toInt
//
//        val x2 = firstMultipleInput(2).toInt
//
//        val v2 = firstMultipleInput(3).toInt
//
//        val result = Result.kangaroo(x1, v1, x2, v2)
//
//        printWriter.println(result)
//
//        printWriter.close()
//    }
//}
