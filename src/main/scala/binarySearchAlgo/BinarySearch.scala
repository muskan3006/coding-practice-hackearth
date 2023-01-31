package binarySearchAlgo

import scala.annotation.tailrec
import scala.util.control.Breaks.{break, breakable}

object BinarySearch {
    def recursivesearch(nums: Array[Int], target: Int): Int = {
        val lowerBound = 0
        val upperBound = nums.length -1

        @tailrec
        def binarysearh(lowerBound : Int, upperBound : Int, middleIndex : Int, nums: Array[Int], target: Int) : Int ={
            if(nums(middleIndex) == target){
                middleIndex
            } else if(nums(middleIndex) > target){
                binarysearh(lowerBound, middleIndex -1, (lowerBound + middleIndex-1)/2, nums, target)
            } else {
                binarysearh(middleIndex + 1, upperBound, (middleIndex + 1 + upperBound)/2, nums, target)
            }
        }

        binarysearh(lowerBound, upperBound, (lowerBound + upperBound)/2, nums, target)
    }

    def binarySearch(nums : Array[Int], target : Int): Int ={
        def calculateMiddle(lower : Int , upper : Int): Int ={
            (lower + upper)/2
        }
        var lowerBound = 0
        var upperBound = nums.length - 1
        var middle = calculateMiddle(lowerBound, upperBound)
        var resIndex = -1
        breakable((0 to nums.length/2).map(_ =>{
            if(nums(middle) == target) {
                resIndex = middle
                break
            }
            else if((lowerBound>=middle || upperBound<= middle) && nums(middle) != target){
                break
            } else if(nums(middle) > target){
                upperBound = middle
                middle = calculateMiddle(lowerBound, upperBound)

            } else{
                lowerBound = middle
                middle = calculateMiddle(lowerBound, upperBound)
            }
        }))

        resIndex

    }
}