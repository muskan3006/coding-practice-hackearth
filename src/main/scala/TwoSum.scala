object TwoSum {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        val a = for{
            first <- 0 to nums.length -2
            second <- first + 1 to nums.length -1
            if nums(first) + nums(second) == target

        } yield Array(first, second)
        a.toArray.flatten
    }
}