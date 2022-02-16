def fizzBuzz(n: Int): String = {
  (n % 3, n % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case (_, _) => s"$n"
  }
}
