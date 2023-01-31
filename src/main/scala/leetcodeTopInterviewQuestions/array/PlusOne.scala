package leetcodeTopInterviewQuestions.array

object PlusOne extends App{
  def plusOne(digits: Array[Int]): Array[Int] = {
    def helper(index : Int, carry: Int) : Array[Int] = {
      if(index == digits.length -1){
        val sum = digits(index) + 1 + carry
        handleCarry(index, sum)
      } else if(index >= 0){
        val sum = digits(index) + carry
        handleCarry(index, sum)
      } else if(carry != 0){
        digits.+:(carry)
      } else {
        digits
      }
    }

    def handleCarry(index : Int, sum: Int) ={
      val carryValue = sum / 10
      if (carryValue > 0) {
        digits(index) = sum % 10
        helper(index - 1, carryValue)
      } else {
        digits(index) = sum
        digits
      }
    }

    helper(digits.length -1, 0)
  }

  println(plusOne(Array(9, 9)).toList)
}
