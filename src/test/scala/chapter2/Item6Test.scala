package chapter2

import org.scalatest.{FunSuite, Matchers}

class Item6Test extends FunSuite with Matchers {
  val add1: Int => Int = i => i + 1
  val multi2: Int => Int = i => i * 2

  test("Function andThen Test") {
    // When
    val chain = add1 andThen multi2

    // Then
    chain(1) should equal(4)
  }

  test("Function compose Test") {
    // When
    val composed = add1 compose multi2

    // Then
    composed(10) should equal(21)
  }
}
