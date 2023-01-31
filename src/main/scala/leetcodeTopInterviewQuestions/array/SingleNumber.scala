package leetcodeTopInterviewQuestions.array

object SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    val sortedArray = nums.sorted
    def helper(first: Int, second: Int) : Int ={
      if(second < nums.length){
        if(sortedArray(first) == sortedArray(second)){
          helper(first+2, second + 2)
        } else {sortedArray(first)}
      } else {sortedArray.last}
    }
    helper(0, 1)
  }

}
