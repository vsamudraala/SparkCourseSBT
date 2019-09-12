package RDDBasics

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.udf

object SparkUDFExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Sample UDF Converting to LowerCase")
      .master("local[*]")
      .getOrCreate()
    //val stocks = spark.read.options(Map("header" -> "true", "inferSchema" -> "true"))

    //.csv("Input_Dir/sampleCSV.csv")

    val stocks = spark.read.options(Map("header" -> "true", "inferSchema" -> "true"))
      .csv("datasets/nse-stocks/nse-stocks-data.csv")

    //2. Convert the function into UDF
    val toLowerUDF = udf[String, String](toLower)

    //3. Use UDF with Spark DataFrame/Dataset
    stocks.select(toLowerUDF(stocks("SYMBOL"))).show()
  }

  //1.Define a function
  def toLower(s: String): String = s.toLowerCase()

}