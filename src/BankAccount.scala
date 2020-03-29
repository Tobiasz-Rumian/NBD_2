class BankAccount(initialBalance: Double = 0.0) {
  private var _balance = initialBalance

  def balance: Double = _balance

  def deposit(amount: Double): Unit = {
    if (amount > 0) _balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (0 < amount && amount <= _balance) _balance -= amount
  }

}
