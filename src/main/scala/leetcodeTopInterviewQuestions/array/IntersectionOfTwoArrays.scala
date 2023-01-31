package leetcodeTopInterviewQuestions.array

object IntersectionOfTwoArrays extends App{
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val sortedArray1 = nums1.sorted
    val sortedArray2 = nums2.sorted
    def helper(nums1Pointer: Int, nums2Pointer: Int, resultantArray: Array[Int] = Array.emptyIntArray) : Array[Int] ={
      if(nums1Pointer < nums1.length && nums2Pointer < nums2.length){
        if(sortedArray1(nums1Pointer) == sortedArray2(nums2Pointer)){
          helper(nums1Pointer +1, nums2Pointer+1, resultantArray ++ Array(sortedArray1(nums1Pointer)))
        } else if(sortedArray1(nums1Pointer) < sortedArray2(nums2Pointer)){
          helper(nums1Pointer + 1, nums2Pointer, resultantArray)
        } else {
          helper(nums1Pointer, nums2Pointer + 1, resultantArray)
        }
      } else {
        resultantArray
      }
    }
    helper(0, 0)
  }

  println(intersect(Array(4, 9, 5), Array(9, 4, 9, 8, 4)).toList)
}
