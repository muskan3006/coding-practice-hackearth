//import java.io._
//import scala.annotation.tailrec
//import scala.io._
//
//
//
//object Result extends App {
//
//    /*
//     * Complete the 'findSubstring' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. STRING s
//     *  2. INTEGER k
//     */
//
//    def findSubstring(s: String, k: Int): String = {
//        @tailrec
//        def findSubstringWithMaxVowel(substrings : List[String], substringWithMaxVowel : String, vowelCount : Int): String = {
//            substrings match {
//                case Nil => substringWithMaxVowel
//                case ::(head, tl) =>
//                    val vowelCountHead =  head.foldLeft(0)((sum, elem) => {
//                        if(elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u')
//                        {
//                            sum + 1
//                        } else sum
//                    })
//
//                    if(vowelCountHead > 0)
//                    {
//                        if(vowelCountHead > vowelCount){
//                            findSubstringWithMaxVowel(tl, head, vowelCountHead)
//                        }  else {
//                            findSubstringWithMaxVowel(tl, substringWithMaxVowel, vowelCount)
//                        }
//                    }
//                    else
//                    {
//                        findSubstringWithMaxVowel(tl, substringWithMaxVowel, vowelCount)
//                    }
//            }
//
//        }
//
//        val substrings = for{
//            index <- 0 to s.length - k
//            subString = s.substring(index, index + k)
//        } yield subString
//
//        val result = findSubstringWithMaxVowel(substrings.toList, "", 0)
//        if(result.isEmpty) "Not found!" else result
//    }
//
//    val s = "abcdef"
//    println(findSubstrings(s, 5))
//
//    def findSubstrings(string : String, size : Int) : String = {
//        var vowelCount = 0
//        var substring = ""
//
//        (0 to string.length - size).foreach{ counter =>
//            val headIndex = counter
//            val tailIndex = counter + size - 1
//            if (vowelCount == 0)
//            {
//                vowelCount = vowelcount(string, size)
//                substring = string.substring(headIndex, tailIndex + 1)
//            }
//            else
//            {
//                if(isVowelAdded(string, headIndex, tailIndex))
//                {
//                    vowelCount += 1
//                    substring = string.substring(headIndex, tailIndex + 1)
//                }
//            }
//        }
//
//        substring
//    }
//
//    def vowelcount(string: String, size : Int) ={string.substring(size).foldLeft(0)((sum, elem) => {
//        if(elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u')
//        {
//            sum + 1
//        } else sum
//    })}
//
//    def isVowelAdded(string: String, headIndex : Int, tailIndex : Int) = {
//        !isVowel(string(headIndex-1)) && isVowel(string(tailIndex))
//    }
//
//    def isVowel(elem : Char) = {
//        elem == 'a' || elem == 'e' || elem == 'i' || elem == 'o' || elem == 'u'
//    }
//}
//
//object Solution {
//    def main(args: Array[String]) {
//        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
//
//        val s = StdIn.readLine
//
//        val k = StdIn.readLine.trim.toInt
//
//        val result = Result.findSubstring(s, k)
//
//        printWriter.println(result)
//
//        printWriter.close()
//    }
//}
