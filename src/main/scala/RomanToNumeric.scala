object RomanToNumeric extends App {
    val mappingRomanToNumeric = Map('M' -> 1000, 'D' -> 500, 'C' -> 100, 'L' -> 50, 'X' -> 10, 'V' -> 5, 'I' -> 1)
    def romanToInt(s: String): Int = {
        val numericCorrespondingToRoman = s.toList.map(mappingRomanToNumeric(_))
        def sumRoman(list: List[Int], sum : Int) : Int = {
            list match {
                case Nil => sum
                case first :: second :: rest if(first < second) => sumRoman(rest, sum + (second - first))
                case first :: rest => sumRoman(rest, sum + first)
            }
        }
        sumRoman(numericCorrespondingToRoman, 0)
    }
}
