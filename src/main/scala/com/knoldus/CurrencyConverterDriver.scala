package com.knoldus

object CurrencyConverterDriver extends App {

  val currencyConverter = new CurrencyConverter

  val a: Double = currencyConverter.convert(500,"yen","afghani")
println(a)
}
