package leetcodeTopInterviewQuestions.array

object BestTimeToBuyAndSellStock {
    def maxProfit(prices: Array[Int]): Int = {

      def helper(first: Int, second: Int, profit: Int = 0): Int = {
        if (second < prices.length) {
          if (prices(first) < prices(second)) {
            helper(first + 1, second + 1, profit + (prices(second) - prices(first)))
          } else {
            helper(first + 1, second + 1, profit)
          }
        } else profit
      }


        helper(0, 1, 0)
    }

  }
