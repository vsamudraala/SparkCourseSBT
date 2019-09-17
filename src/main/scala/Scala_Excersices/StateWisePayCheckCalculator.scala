package Scala_Excersices

object StateWisePayCheckCalculator {
  def main(args: Array[String]): Unit = {
    val hrs = args(0).toInt
    val perhour = args(1).toInt
    val StateName = args(2).toString
    val zipcode =args(3).toInt
    val visaStatus = args(4).toInt
    val maritialStatus = args(5).toString
    val GrossIncome = hrs * perhour.toInt
    val NumOfDependents = Option{args(6)}

    println(" Gross Income : " + hrs * perhour)
    println("Gross To Net Income is :" +GrossToNet(GrossIncome, "FL"))

    def GrossToNet(grossIncome: Int, State: String): Double = {

      val StateNameSet = StateName match {
        case "FL" => 0.2
        case "AZ" => 0.4
        case _ => 0.5
      }


      return (GrossIncome -(StateNameSet*GrossIncome))
    }


  }
}
