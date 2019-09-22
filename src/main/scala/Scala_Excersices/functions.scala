package Scala_Excersices

object functions {
  def main(args: Array[String]): Unit = {
    val hrs = args(0).toInt
    val perhour = args(1).toInt
    val GrossIncome = hrs * perhour.toInt
    val StateName = args(2).toString
    println(" Gross Income : " + hrs * perhour)
    println("Gross To Net Income is :" +GrossToNet(GrossIncome, "FL"))

    def GrossToNet(grossIncome: Int, State: String): Double = {

      val StateNameSet = StateName match {
        case "FL" => 0.0
        case "AZ" => 0.4
        case _ => 0.5
      }
      return (GrossIncome -(StateNameSet*GrossIncome))
    }


  }
}
