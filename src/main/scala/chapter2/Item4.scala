package chapter2

object Item4 {
  def factorial(n: Int): Int = {

    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def fib(n: Int): Int = {

    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    }

    loop(n, 0, 1)
  }
}
