class Person2(val name: String, val surname: String, private val _tax: Double) {
  def tax: Double = _tax
}

trait Student extends Person2 {
  override def tax: Double = 0.0
}

trait Teacher extends Worker {
  override def tax: Double = _salary * 0.10
}

trait Worker extends Person2 {
  var _salary: Double

  def salary: Double = _salary

  def salary_=(salary: Double): Unit = _salary = salary

  override def tax: Double = _salary * 0.20
}
