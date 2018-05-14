package chapter2

import org.scalatest.{FunSuite, Matchers}

class Item5Test extends FunSuite with Matchers {
  test("sample 2.3 findFirst") {
    // Given
    val strings = Array("A", "B", "C", "D")

    // When
    val index = Item5.findFirst(strings, "C")

    // Then
    index should equal(2)
  }

  test("sample 2.4 findFirst with HOF") {
    // Given
    val strings = Array("A", "B", "C", "D")

    // When
    val index = Item5.findFirst(strings, (x: String) => x == "A")

    // Then
    index should equal(0)
  }

  test("problem 2.2") {
    // Given
    val numbers = Array(1, 2, 3, 4, 5)

    // When
    val result = Item5.isSorted(numbers, (a: Int, b: Int) => a < b)

    result should equal(true)
  }

  test("problem 2.2 fail case") {
    // Given
    val numbers = Array(1, 3, 2, 4, 5)

    // When
    val result = Item5.isSorted(numbers, (a: Int, b: Int) => a < b)

    // Then
    result should equal(false)
  }
}
