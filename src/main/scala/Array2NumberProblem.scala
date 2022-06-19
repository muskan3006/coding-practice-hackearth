object Array2NumberProblem extends App {

    def find2NumberWithSumInGivenRange(array: Array[Int], lowerBound : Int, upperBound : Int): (Set[Int], Array[(Int, Int)]) ={
        var i = 0
        var j = array.length -1
        val sortedArray = array.sorted
        println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 sortedArray ${sortedArray.toList}")
        var resultantSet = Set.empty[Int]
        var resultantArray = Array.empty[(Int, Int)]
        while(i < j){
            if(sortedArray(i) + sortedArray(j) < lowerBound){
                println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 lowerbount $i $j")
                i+=1
            } else if(sortedArray(i) + sortedArray(j) > upperBound){
                println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 upper $i $j")
                j-=1
            } else {
                resultantSet = resultantSet + (sortedArray(i), sortedArray(j))
                resultantArray = resultantArray.++(Array((sortedArray(i), sortedArray(j))))
                println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 result $i $j")
                println((sortedArray(i+1) >= upperBound - (sortedArray(i) + sortedArray(j))))
                println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 ${sortedArray(i+1)} ${upperBound - (sortedArray(i) + sortedArray(j))}")
                if(sortedArray(i) + sortedArray(j) == upperBound || (sortedArray(i+1) >= upperBound - (sortedArray(i) + sortedArray(j)))){
                    j-=1
                    println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 j $j")
                } else {
                    i+=1
                    println(s">>>>>>>>>>>>>>>>>>>>>>>> Step 1 i $i")
                }
            }
        }
        (resultantSet, resultantArray)
    }

    val res = find2NumberWithSumInGivenRange(Array(1,6 ,7, 2, 9, 8), 7, 8)
    println(res._1)
    res._2.foreach(println(_))
}
