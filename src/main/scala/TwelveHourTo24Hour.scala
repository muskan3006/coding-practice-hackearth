//import java.io._
//import scala.io._
//
//object Result1 extends App{
//
//    /*
//     * Complete the 'timeConversion' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING s as parameter.
//     */
//
//    def timeConversion(s: String): String = {
//        // Write your code here
//        if (s.endsWith("AM")) {
//            if (s.startsWith("12")) {
//                s.replace("12", "00").stripSuffix("AM")
//            }
//            else {
//                s.stripSuffix("AM")
//            }
//        }
//        else if (s.endsWith("PM")) {
//            if (s.startsWith("12")) {
//                s.stripSuffix("PM")
//            }
//            else {
//                val hourIn24HourClock = s.substring(0, 2).toInt + 12
//                hourIn24HourClock + s.substring(2).stripSuffix("PM")
//            }
//        }
//        else {
//            "Wrong Input"
//        }
//
//    }
//
//    println(">>>>>>>>>>>>>" + timeConversion("07:05:45PM"))
//
//}
//
////object Solution1 {
////    def main(args: Array[String]) {
////        //        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
////
////        val s = StdIn.readLine
////        println(">>>>>>>>>>")
////        val result = Result1.timeConversion("07:05:45PM")
////        println(result)
////
////        //        printWriter.println(result)
////
////        //        printWriter.close()
////    }
////}
