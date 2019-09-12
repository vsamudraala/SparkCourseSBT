package RDDBasics

import org.apache.spark.sql.SparkSession

object gitPractice {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Git Demo App")
      .master("local[*]")
      .getOrCreate()
    val customDF = spark.read.orc("Input_Dir/users.orc")
    customDF.printSchema()

    customDF.head(4).foreach(println)
    customDF.show(4)



    val csvDf = spark.read.options(Map("inferSchema" -> "true","header" -> "true")).csv("Input_Dir/sampleCSV.csv")
    csvDf.show()



  }

}
