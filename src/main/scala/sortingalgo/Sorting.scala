package sortingalgo

import scala.util.control.Breaks.{break, breakable}

object Sorting extends App {

    val arr = Array(3, 2, 8, 5, 0)
    //select min value index and swap it with first unsorted value, this way after swap yu will
    //have a sorted subarray

    println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 SELECTION SORT")

    def selectionsort(arr: Array[Int]) = {
        (0 until arr.length - 1).foreach(i => {
            var minindex = i
            (i + 1 until arr.length).foreach(j => {
                if (arr(minindex) > arr(j))
                    minindex = j
            })
            val temp = arr(i)
            arr(i) = arr(minindex)
            arr(minindex) = temp
        })
        arr
    }

    selectionsort(arr).foreach(println(_))

    /* bubblesort compares adjacent elements starting from first two and swap until the iteration completes
    At the end of iteration the largest elem is at end so now you don't need to iterate that element
     */
    println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 BUBBLE SORT")

    def bubblesort(arr: Array[Int]): Array[Int] = {
        breakable {
            (arr.indices).foreach(j => {
                var swapped = false
                (0 until arr.length - j - 1).foreach(i => {
                    if (arr(i) > arr(i + 1)) {
                        val temp = arr(i)
                        arr(i) = arr(i + 1)
                        arr(i + 1) = temp
                        swapped = true
                    }
                })
                if (swapped == false) break
            })
            arr
        }
        arr
    }

    bubblesort(arr).foreach(println(_))
}
