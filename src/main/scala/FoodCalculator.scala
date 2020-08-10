object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20

  println(s"We got ${args.length} arguments")
  println(s"The first argument is ${args(0)}")
  println(s"The second argument is ${args(1)}")
  println(s"The third argument is ${args(2)}")
  val costs = args(0).toFloat * args(1).toInt
  println(s"It will cost $costs to buy ${args(1)} kilos of ${args(2)}")

}
