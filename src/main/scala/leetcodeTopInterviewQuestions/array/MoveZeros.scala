package leetcodeTopInterviewQuestions.array

object MoveZeros {
  def moveZeroes(nums: Array[Int]): Unit = {
    def helper(zeroPoint: Int, mover: Int) : Unit ={
      if(zeroPoint < nums.length && mover < nums.length){
      if(nums(zeroPoint) == 0 && nums(mover) != 0){
        swap(zeroPoint, mover)
        helper(zeroPoint + 1, mover + 1)
      } else if(nums(zeroPoint) == 0 && nums(mover) == 0){
        helper(zeroPoint, mover + 1)
      } else {
        helper(zeroPoint + 1, mover + 1)
      }
    }}
    def swap(first : Int, seconnd: Int) ={
      val temp = nums(first)
      nums(first) = nums(seconnd)
      nums(seconnd) = temp
    }
    helper(0, 1)
  }

}
