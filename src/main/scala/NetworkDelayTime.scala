object NetworkDelayTime {

    def networkDelayTime(times: Array[Array[Int]], n: Int, k: Int): Int = {
        var sum = 0
        val kValues : Array[Int] = Array(k)
        val nodeCoveredArray = Array(Array.emptyIntArray)
        def a(k : Int, array : Array[Array[Int]]) : Int = {
            var remainingArrays = Array(Array.emptyIntArray)
            array.map(nodedetail =>
            {
                if(nodeCoveredArray.size  < times.length)
                {
                    if(nodedetail(0) == k)
                    {
                        sum += nodedetail(2)
                        nodeCoveredArray ++ nodedetail
                    }
                    else
                    {
                        remainingArrays = (remainingArrays :+ nodedetail).distinct
                    }
                }

            })
            if(remainingArrays.length == 0)
            {
                sum
            } else
            {
                val newK = for
                {remainingarray <- remainingArrays
                 nodeCovered <-nodeCoveredArray
                 if(remainingarray(0) == nodeCovered(1))
                 k = remainingarray(0)}
                yield k
                kValues :+ newK
                a(newK.head, remainingArrays)
            }
        }

        a(k, times)
    }
}
