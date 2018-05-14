import chapter2.Item4
// 주석 1
/* 주석 2 */
/**
  * 문서화 주석
  */
object MyModule { // 단일 객체, 인스턴스를 생성함, static 클래스는 아니고 익명 singleton 이라고 생각하면 쉽다.
  def abs(n: Int): Int =
    if (n < 0) -n
    else n // scala 는 리턴 구문이 없어도 마지막에 반환 타입과 같은 일을 하는 구문을 반환한다.

  private def formatAbs(x: Int) = {
    // 값이나 레퍼런스 초기화 타입은 두가지가 있는데 var(variable), val(value) 이다.
    // - var(variable) 이름 그대로 변경이 가능하다
    // - val(value) 또한 이름 그래도 변경이 불가능하다. VO Pattern 를 알고 있다면 이해하기 쉬울 것이다. 일종의 final 변수라고 생각하면 된다.
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d."
    msg.format(n, Item4.factorial(n))
  }

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  // 외부 계층에 출력하기 위한 메서드가 사용되므로 impure 함수에 해당한다.
  // 사실 Unit 은 생략할 수 있으며 일반적인 언어의 void 와 동일한 기능을 한다.
  // 반환 타입이 Unit 인 함수는 대부분 부수효과를 내포하고 있다는 뜻으로 암시된다. ( 순수 함수가 x->y 이지만 x->Unit 이에 해당하지 않는다.)
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7));
  }
}
