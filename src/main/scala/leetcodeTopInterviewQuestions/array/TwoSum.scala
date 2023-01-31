package leetcodeTopInterviewQuestions.array

import scala.annotation.tailrec
import scala.collection.mutable

object TwoSum extends App{
    def twoSumblabla(nums: Array[Int], target: Int): Array[Int] = {
        val a = for{
            first <- 0 to nums.length -2
            second <- first + 1 to nums.length -1
            if nums(first) + nums(second) == target

        } yield Array(first, second)
        a.toArray.flatten
    }

    def twoSumOptimized(nums: Array[Int], target: Int) ={
        val set = nums.toSet

        def helper(index : Int, resultantArray: Array[Int]) : Array[Int] ={
            if(index < nums.length){
                if(set.contains(target - nums(index)) && index != nums.indexOf(target - nums(index))){
                    Array(index, nums.indexOf(target - nums(index)))
                } else {
                    helper(index + 1, resultantArray)
                }
            } else resultantArray
        }
        helper(0, Array.emptyIntArray)
    }

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        @tailrec
        def helper(index: Int, map: mutable.HashMap[Int, Int]): Array[Int] ={
            if(index < nums.length){
                val need = target - nums(index)
            map.get(need) match {
                case Some(value) => Array(value, index)
                case None => helper(index + 1, map ++ Map(nums(index) -> index))
            }
        } else {
                Array.emptyIntArray
            }
        }

        helper(0, mutable.HashMap())
    }

    println(twoSumOptimized(Array(1, 2,3 ,5), 11))
}