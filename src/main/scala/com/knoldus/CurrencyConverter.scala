package com.knoldus

/**
 * Class CurrencyConverter includes all functions for class
 */
class CurrencyConverter {

  val FROM = "from"
  val TO = "to"
  /**
   * To control the function
   *
   * @param currentValue Current Value
   * @param currentState Current State
   * @param futureState  Future State
   * @return tmepInr value
   */
  def convert(currentValue: Double, currentState: String, futureState: String): Double = {
    if (currentValue >= 0) {
      val tempInrValue = currencyHandler(currentValue, currentState, FROM)
      val finalStateValue = currencyHandler(tempInrValue, futureState, TO)
      finalStateValue
    }
    else {
      throw new Exception("invalid value")
    }

  }

  /**
   * Currency Handler
   *
   * @param value          value
   * @param state          state
   * @param conversionCase conversionCase
   * @return value
   */
  private def currencyHandler(value: Double, state: String, conversionCase: String): Double = {
    state match {
      case "dollar" | "euro" | "canadianDollar" | "swissFranc" | "cubanPeso" => westernCurrency(value, state, conversionCase)
      case "inr" | "dirham" | "afghani" | "yuan" | "yen" => easternCurrency(value, state, conversionCase)
      case _ => throw new Exception("invalid currency")
    }
  }

  private def westernCurrency(value: Double, state: String, conversionCase: String): Double = {
    state match {
      case "dollar" => dollar(value, conversionCase)
      case "euro" => euro(value, conversionCase)
      case "canadianDollar" => canadianDollar(value, conversionCase)
      case "swissFranc" => swissFranc(value, conversionCase)
      case "cubanPeso" => cubanPeso(value, conversionCase)
    }
  }

  private def easternCurrency(value: Double, state: String, conversionCase: String): Double = {
    state match {
      case "inr" => inr(value, conversionCase)
      case "dirham" => dirham(value, conversionCase)
      case "afghani" => afghani(value, conversionCase)
      case "yuan" => yuan(value, conversionCase)
      case "yen" => yen(value, conversionCase)
    }
  }

  /**
   * doller converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */
  private def dollar(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 70 else value / 70

  /**
   * inr converter
   *
   * @param value          value
   * @param conversionCase conversion case
   * @return value
   */

  private def inr(value: Double, conversionCase: String): Double = if (conversionCase == "from") value else value

  /**
   * dirham converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def dirham(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 20 else value / 20

  /**
   * afghani converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def afghani(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 0.93 else value / 0.93

  /**
   * euro converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def euro(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 78.44 else value / 78.44

  /**
   * yuan converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def yuan(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 10.26 else value / 10.26

  /**
   * canadian doller converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def canadianDollar(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 54.07 else value / 54.07

  /**
   * swiss Franc
   *
   * @param value          value
   * @param conversionCase case
   * @return modifed value
   */

  private def swissFranc(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 73.16 else value / 73.16

  /**
   * cuban Peso converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def cubanPeso(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 71.20 else value / 71.20

  /**
   * yen converter
   *
   * @param value          value
   * @param conversionCase case
   * @return modified value
   */

  private def yen(value: Double, conversionCase: String): Double = if (conversionCase == "from") value * 0.65 else value / 0.65
}















