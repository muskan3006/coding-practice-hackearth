//import scala.util.{Failure, Success, Try}
//
//object Solution {
//    def reorderLogFiles(logs: Array[String]): Array[String] = {
//        val (letterLogs , digitsLog) = seperateLetterAndDigitLogs(logs)
//        (letterLogs.sorted ::: digitsLog.sorted).toArray
//    }
//
//
//    def isDigitLog(log : String) : Boolean = {
//        val array = log.split(" ").toList
//        array match {
//            case _ :: second :: _ => {
//                Try(second.toInt) match {
//                    case Failure(_) => false
//                    case Success(_) => true
//                }
//            }
//            case _ => false
//        }
//    }
//
//    def seperateLetterAndDigitLogs(logs: Array[String]) ={
//        logs.foldLeft((List.empty[String], List.empty[String]))((res, elem ) => {
//            if(isDigitLog(elem)){
//                (res._1, elem :: res._2)
//            } else {
//                (elem :: res._1, res._2)
//            }
//        })
//    }
//}