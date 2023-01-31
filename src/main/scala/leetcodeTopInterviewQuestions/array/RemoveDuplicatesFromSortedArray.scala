package leetcodeTopInterviewQuestions.array

object RemoveDuplicatesFromSortedArray {

  def removeDuplicates(nums: Array[Int]): Int = {

    def helper(start : Int, next: Int, count : Int) : Int = {
      if(next == nums.length) count else {
        if(nums(start) == nums(next)){
          helper(start, next + 1, count)
        } else {
          val temp = nums(start+1)
          nums(start+1) = nums(next)
          nums(next) = temp
          helper(start+1, next + 1, count + 1)
        }
      }
    }

    helper(0, 1, 1)
  }
}