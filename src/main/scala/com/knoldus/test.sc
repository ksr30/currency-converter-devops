

class CurrencyConverter {


  def convert(currentValue: Double, currentState: String, futureState: String):Double= {
    val tempInrValue = currencyHandler (currentValue, currentState, "from")
    val finalStateValue = currencyHandler (tempInrValue, futureState, "to")
    finalStateValue
  }

