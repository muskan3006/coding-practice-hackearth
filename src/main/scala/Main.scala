object Main extends App {
    def generateParenthesiss(n: Int): List[String] = {
        generate(n * 2, "", 0)
    }

    def generate(n: Int, prefix: String, computed: Int): List[String] = {
        if (prefix.length == n) {
            if (computed == 0) prefix :: Nil else Nil
        } else if (computed < 0 || Math.abs(computed) > (n - prefix.length)) {
            Nil
        } else {
            generate(n, s"$prefix(", computed + 1) ++ generate(n, s"$prefix)", computed - 1)
        }
    }

    def generateParenthesis(n: Int): List[String] = {
        if (n < 1 || n > 8)
            List.empty[String]
        else {
            generateParens(n)
        }
    }

    def generateParens(n: Int): List[String] = {
        val openParens = "(" * n mkString ("")
        val closeParens = ")" * n mkString ("")
        val combined = openParens.concat(closeParens)
        val allList = combined.permutations.toList
        allList filter (x => isBalanced(x, n))
    }

    def isBalanced(str: String, n: Int): Boolean = {
        val oclIdx = str.lastIndexOf("(") < str.lastIndexOf(")")
        val ocfIdx = str.indexOf("(") < str.indexOf(")")
        val atLeastOnePair = str contains "()"
        val notFirst = str.charAt(0) != ')'
        val notLast = str.last != '('
        val removalList = Stream.iterate(str)(str => str.replace("()", "")).take(n + 1).toList
        val isEmptyHead = "".equals(removalList.reverse.head)
        oclIdx && ocfIdx && atLeastOnePair && notFirst && notLast && isEmptyHead
    }

    val r = generateParenthesis(3)
    println(r)
}
