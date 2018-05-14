package chapter2

object Item5 {
  def findFirst[A](ss: Array[A], key: A): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }
    loop(0)
  }

  def findFirst[A](ss: Array[A], f: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (f(ss(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) loop(n + 1)
      else false
    }
    loop(0)
  }
}
