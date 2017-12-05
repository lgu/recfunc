package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  /**
   * Exercise 2
   */
    def balance_with_count(chars:List[Char], count: Int): Boolean = {
      if (chars.isEmpty) true else{
        if (chars.head == ')') {if (count == 0) false else balance_with_count(chars.tail, count - 1)} else{
          if (chars.head == '(') balance_with_count(chars.tail, count + 1) else{
            balance_with_count(chars.tail, count)
          }
        }
      }
    }

    def balance(chars: List[Char]): Boolean = {
      balance_with_count(chars, 0)
    }
  
  /**
   * Exercise 3
   */

    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1 else {
        if (coins.isEmpty) 0 else{
          if (money < 0) 0 else {
            countChange(money - coins.head, coins) + countChange(money, coins.tail)
          }
        }
      }
    }
  }
