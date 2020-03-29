
object Main extends App {
  val days: List[String] = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela", "Coś")
  println("1: " + days.map(day => checkDay(day)))
  val bankAccount1 = new BankAccount()
  val bankAccount2 = new BankAccount(123.0)
  println("2a: " + bankAccount1.balance)
  println("2b: " + bankAccount2.balance)
  bankAccount2.withdraw(100.0)
  println("2c: " + bankAccount2.balance)
  bankAccount2.deposit(50.0)
  println("2d: " + bankAccount2.balance)
  val person1 = Person("Dave", "Reaves")
  val person2 = Person("Kamila", "Kowalski")
  val person3 = Person("Paul", "Sparrow")
  val person4 = Person("Henry", "Zigi")
  println("3a: " + greet(person1))
  println("3b: " + greet(person2))
  println("3c: " + greet(person3))
  println("3d: " + greet(person4))
  println("4: " + doThreeTimes(1, element => element + 1))

  val person5 = new Person2("name1", "surname1", 121.0)
  val person6 = new Person2("name2", "surname2", 122.0) with Student
  val person7 = new Person2("name3", "surname3", 123.0) with Teacher {
    var _salary = 2000
  }
  val person8 = new Person2("name4", "surname4", 124.0) with Worker {
    var _salary = 4000
  }

  println("5a: " + person5.tax)
  println("5b: " + person6.tax)
  println("5c: " + person7.tax)
  println("5d: " + person8.tax)

  val person9 = new Person2("name5", "surname5", 125.0) with Teacher with Worker {
    var _salary = 2000
  }
  val person10 = new Person2("name6", "surname6", 126.0) with Worker with Teacher {
    var _salary = 4000
  }

  println("5e: " + person9.tax)
  println("5f: " + person10.tax)

  def checkDay(day: String): String = day match {
    case "Poniedziałek" | "Wtorek" | "Środa" | "Czwartek" | "Piątek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }

  def greet(person: Person): String = person match {
    case Person("Dave", _) => "Oh, it's just Dave."
    case Person(_, "Kowalski") => "Hi! "
    case Person("Paul", "Sparrow") => "Hello! "
    case Person(_, _) => "I don't know you!"
  }

  def doThreeTimes(value: Int, function: Int => Int): Int = function(function(function(value)))

}
