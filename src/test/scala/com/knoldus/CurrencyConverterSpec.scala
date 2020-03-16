package com.knoldus

import org.scalatest._

class CurrencyConverterSpec extends FlatSpec with BeforeAndAfterAll {
  var conversion: CurrencyConverter = _

  override def beforeAll(): Unit = {

    conversion = new CurrencyConverter()
  }

  override def afterAll(): Unit = {
    if (conversion != null) {
      conversion = null
    }
  }

  "Convert Method" should "return euro value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "euro")
    val expectedResult = 53.544110147883735
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "canadianDollar")
    val expectedResult = 77.67708525984834
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "swissFranc")
    val expectedResult = 57.40841990158557
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "cubanPeso")
    val expectedResult = 58.98876404494382
    assert(expectedResult == actualResult)
  }

  it should "return inr value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "inr")
    val expectedResult = 4200.0
    assert(expectedResult == actualResult)
  }

  it should "return dirham value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "dirham")
    val expectedResult = 210.0
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "afghani")
    val expectedResult = 4516.129032258064
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "yuan")
    val expectedResult = 409.3567251461988
    assert(expectedResult == actualResult)
  }

  it should "return yen value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "yen")
    val expectedResult = 6461.538461538461
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if Dollar is given" in {
    val actualResult = conversion.convert(60, "dollar", "dollar")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }


  // euro is given


  it should "return euro value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "euro")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "canadianDollar")
    val expectedResult = 87.04272239689291
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "swissFranc")
    val expectedResult = 64.33023510114816
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "cubanPeso")
    val expectedResult = 66.10112359550561
    assert(expectedResult == actualResult)
  }

  it should "return inr value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "inr")
    val expectedResult = 4706.4
    assert(expectedResult == actualResult)
  }

  it should "return INR value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "dirham")
    val expectedResult = 235.32
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "afghani")
    val expectedResult = 5060.645161290322
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "yuan")
    val expectedResult = 458.7134502923976
    assert(expectedResult == actualResult)
  }

  it should "return yen value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "yen")
    val expectedResult = 7240.615384615384
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if euro is given" in {
    val actualResult = conversion.convert(60, "euro", "dollar")
    val expectedResult = 67.2342857142857
    assert(expectedResult == actualResult)
  }
  // canadianDollar is given

  it should "return euro value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "euro")
    val expectedResult = 41.359000509943904
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "canadianDollar")
    val expectedResult = 59.99999999999999
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "swissFranc")
    val expectedResult = 44.343903772553304
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "cubanPeso")
    val expectedResult = 45.56460674157303
    assert(expectedResult == actualResult)
  }

  it should "return inr value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "inr")
    val expectedResult = 3244.2
    assert(expectedResult == actualResult)
  }

  it should "return dirham value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "dirham")
    val expectedResult = 162.20999999999998
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "afghani")
    val expectedResult = 3488.387096774193
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "yuan")
    val expectedResult = 316.19883040935673
    assert(expectedResult == actualResult)
  }

  it should "return yen value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "yen")
    val expectedResult = 4991.076923076923
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if canadianDollar is given" in {
    val actualResult = conversion.convert(60, "canadianDollar", "dollar")
    val expectedResult = 46.34571428571428
    assert(expectedResult == actualResult)
  }

  // swissFranc

  it should "return euro value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "euro")
    val expectedResult = 55.96124426313105
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "canadianDollar")
    val expectedResult = 81.1836508230072
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "swissFranc")
    val expectedResult = 59.99999999999999
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "cubanPeso")
    val expectedResult = 61.65168539325842
    assert(expectedResult == actualResult)
  }

  it should "return inr value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "inr")
    val expectedResult = 4389.599999999999
    assert(expectedResult == actualResult)
  }

  it should "return INR value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "dirham")
    val expectedResult = 219.47999999999996
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "afghani")
    val expectedResult = 4719.999999999999
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "yuan")
    val expectedResult = 427.83625730994146
    assert(expectedResult == actualResult)
  }

  it should "return yen value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "yen")
    val expectedResult = 6753.230769230769
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if swissFranc is given" in {
    val actualResult = conversion.convert(60, "swissFranc", "dollar")
    val expectedResult = 62.70857142857142
    assert(expectedResult == actualResult)
  }
  // cubanPeso is given

  it should "return euro value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "euro")
    val expectedResult = 54.462009178990314
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "canadianDollar")
    val expectedResult = 79.00869243573146
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "swissFranc")
    val expectedResult = 58.392564242755604
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "cubanPeso")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }

  it should "return inr value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "inr")
    val expectedResult = 4272.0
    assert(expectedResult == actualResult)
  }

  it should "return INR value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "dirham")
    val expectedResult = 213.6
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "afghani")
    val expectedResult = 4593.548387096774
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "yuan")
    val expectedResult = 416.37426900584796
    assert(expectedResult == actualResult)
  }

  it should "return yen value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "yen")
    val expectedResult = 6572.307692307692
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if cubanPeso is given" in {
    val actualResult = conversion.convert(60, "cubanPeso", "dollar")
    val expectedResult = 61.02857142857143
    assert(expectedResult == actualResult)
  }

  //inr is given

  it should "return euro value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "euro")
    val expectedResult = 0.7649158592554819
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "canadianDollar")
    val expectedResult = 1.1096726465692621
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "swissFranc")
    val expectedResult = 0.8201202843083653
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "cubanPeso")
    val expectedResult = 0.8426966292134831
    assert(expectedResult == actualResult)
  }

  it should "return inr value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "inr")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }

  it should "return INR value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "dirham")
    val expectedResult = 3.0
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "afghani")
    val expectedResult = 64.51612903225806
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "yuan")
    val expectedResult = 5.847953216374269
    assert(expectedResult == actualResult)
  }

  it should "return yen value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "yen")
    val expectedResult = 92.3076923076923
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if inr is given" in {
    val actualResult = conversion.convert(60, "inr", "dollar")
    val expectedResult = 0.8571428571428571
    assert(expectedResult == actualResult)
  }

  // dirham is given

  it should "return euro value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "euro")
    val expectedResult = 15.298317185109639
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "canadianDollar")
    val expectedResult = 22.19345293138524
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "swissFranc")
    val expectedResult = 16.402405686167306
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "cubanPeso")
    val expectedResult = 16.85393258426966
    assert(expectedResult == actualResult)
  }

  it should "return inr value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "inr")
    val expectedResult = 1200.0
    assert(expectedResult == actualResult)
  }

  it should "return INR value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "dirham")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "afghani")
    val expectedResult = 1290.3225806451612
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "yuan")
    val expectedResult = 116.95906432748538
    assert(expectedResult == actualResult)
  }

  it should "return yen value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "yen")
    val expectedResult = 1846.1538461538462
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if dirham is given" in {
    val actualResult = conversion.convert(60, "dirham", "dollar")
    val expectedResult = 17.142857142857142
    assert(expectedResult == actualResult)
  }

  // afghani is given


  it should "return euro value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "euro")
    val expectedResult = 0.7113717491075983
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "canadianDollar")
    val expectedResult = 1.0319955613094138
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "swissFranc")
    val expectedResult = 0.7627118644067797
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "cubanPeso")
    val expectedResult = 0.7837078651685394
    assert(expectedResult == actualResult)
  }

  it should "return inr value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "inr")
    val expectedResult = 55.800000000000004
    assert(expectedResult == actualResult)
  }

  it should "return INR value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "dirham")
    val expectedResult = 2.79
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "afghani")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "yuan")
    val expectedResult = 5.438596491228071
    assert(expectedResult == actualResult)
  }

  it should "return yen value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "yen")
    val expectedResult = 85.84615384615385
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if afghani is given" in {
    val actualResult = conversion.convert(60, "afghani", "dollar")
    val expectedResult = 0.7971428571428572
    assert(expectedResult == actualResult)
  }

  //yuan is given
  it should "return euro value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "euro")
    val expectedResult = 7.8480367159612445
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "canadianDollar")
    val expectedResult = 11.385241353800629
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "swissFranc")
    val expectedResult = 8.414434117003829
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "cubanPeso")
    val expectedResult = 8.646067415730338
    assert(expectedResult == actualResult)
  }

  it should "return inr value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "inr")
    val expectedResult = 615.6
    assert(expectedResult == actualResult)
  }

  it should "return INR value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "dirham")
    val expectedResult = 30.78

    assert(expectedResult == actualResult)
  }

  it should "return afghani value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "afghani")
    val expectedResult = 661.9354838709677
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "yuan")
    val expectedResult = 60.0

    assert(expectedResult == actualResult)
  }

  it should "return yen value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "yen")
    val expectedResult = 947.0769230769231
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if yuan is given" in {
    val actualResult = conversion.convert(60, "yuan", "dollar")
    val expectedResult = 8.794285714285715
    assert(expectedResult == actualResult)
  }

  //yen is given
  it should "return euro value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "euro")
    val expectedResult = 0.49719530851606325
    assert(expectedResult == actualResult)
  }

  it should "return canadianDollar value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "canadianDollar")
    val expectedResult = 0.7212872202700203
    assert(expectedResult == actualResult)
  }

  it should "return swissFranc value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "swissFranc")
    val expectedResult = 0.5330781848004374
    assert(expectedResult == actualResult)
  }

  it should "return cubanPeso value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "cubanPeso")
    val expectedResult = 0.547752808988764
    assert(expectedResult == actualResult)
  }

  it should "return inr value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "inr")
    val expectedResult = 39.0
    assert(expectedResult == actualResult)
  }

  it should "return INR value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "dirham")
    val expectedResult = 1.95
    assert(expectedResult == actualResult)
  }

  it should "return afghani value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "afghani")
    val expectedResult = 41.93548387096774
    assert(expectedResult == actualResult)
  }

  it should "return yuan value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "yuan")
    val expectedResult = 3.801169590643275
    assert(expectedResult == actualResult)
  }

  it should "return yen value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "yen")
    val expectedResult = 60.0
    assert(expectedResult == actualResult)
  }

  it should "return dollar value if yen is given" in {
    val actualResult = conversion.convert(60, "yen", "dollar")
    val expectedResult = 0.5571428571428572
    assert(expectedResult == actualResult)
  }

  it should "throw exception" in {
    try {
      conversion.convert(12, "eee", "ter")
    }
    catch {
      case e: Exception => assert(e.getMessage == "invalid currency")
    }
  }
  it should "throw negative exception" in {
    try {
      conversion.convert(-5, "inr", "usd")
    }
    catch {
      case f: Exception => assert(f.getMessage == "invalid value")
    }
  }


}