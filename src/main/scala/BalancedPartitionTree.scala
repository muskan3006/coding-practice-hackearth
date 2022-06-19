//import java.io._
//import scala.io._
//
//
//
//object Result {
//
//    case class ChildAndFileSize(child : Int, size : Int)
//    /*
//     * Complete the 'mostBalancedPartition' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY parent
//     *  2. INTEGER_ARRAY files_size
//     */
//
//    def mostBalancedPartition(parent: Array[Int], files_size: Array[Int]): Int = {
//        val parentChildSize = for{
//            index <- 0 until(parent.size)
//        } yield (parent(index), ChildAndFileSize(index, files_size(index)))
//        val allSubdirectoriesOfEachParent = parentChildSize.toMap.groupBy(_._1)
//
//        val subDirectorySumWithParent = allSubdirectoriesOfEachParent.map{
//            case (parent, childAndFileSizeMap) =>
//            {
//                (parent,childAndFileSizeMap.mapValues(_.size).foldLeft(0)((total, elem) => total + elem._2))
//            }
//        }}
//
//    }
//
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//        val parentCount = StdIn.readLine.trim.toInt
//
//        val parent = Array.ofDim[Int](parentCount)
//
//        for (i <- 0 until parentCount) {
//            val parentItem = StdIn.readLine.trim.toInt
//            parent(i) = parentItem
//        }
//
//        val files_sizeCount = StdIn.readLine.trim.toInt
//
//        val files_size = Array.ofDim[Int](files_sizeCount)
//
//        for (i <- 0 until files_sizeCount) {
//            val files_sizeItem = StdIn.readLine.trim.toInt
//            files_size(i) = files_sizeItem
//        }
//
//        val result = Result.mostBalancedPartition(parent, files_size)
//
//        printWriter.println(result)
//
//        printWriter.close()
//    }
//}
