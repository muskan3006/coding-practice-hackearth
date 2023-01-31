package leetcodeTopInterviewQuestions.array

import scala.annotation.tailrec

object RotateArray extends App{
  val nums = Array(1, 2, 3, 4, 5,6, 7)
  def rotate(nums: Array[Int], k: Int): Unit = {
    def helper: Unit ={
      val temp = nums(0)
      nums(0) = nums(nums.length - 1)
      moveElements(temp, 1)
    }
    @tailrec
    def moveElements(element : Int, index : Int): Unit ={
      if(index < nums.length){
        val temp = nums(index)
      nums(index) = element
      moveElements(temp, index + 1)}
    }
    (0 until k).map(_ => helper)
  }
  rotate(nums, 3)
  println(nums.toList)
}
