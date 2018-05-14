package chapter2

import chapter2.Item4._
import org.scalatest.{FunSuite, Matchers}

class Item4Test extends FunSuite with Matchers {

  test("factorial") {
    // When
    val result = factorial(5)

    // Then
    assert(result == 120)
  }

  test("2.1. fibonacci problem") {
    // When
    val result = fib(5)

    // When
    result should equal(5)
  }
}
