package leetcodeTopInterviewQuestions.array

object ContainsDuplicate {
  def containsDuplicate1(nums: Array[Int]): Boolean = {
    !(nums.length == nums.distinct.length)
  }

  def containsDuplicate(nums: Array[Int]): Boolean = {
    val sortedArray = nums.sorted
    def herper(first: Int, second: Int) : Boolean ={
      if(second < nums.length){
        if(sortedArray(first) == sortedArray(second)){
          true
        } else {
          herper(first+1, second+1)
        }
      } else {
        false
      }
    }
    herper(0, 1)
  }
}
