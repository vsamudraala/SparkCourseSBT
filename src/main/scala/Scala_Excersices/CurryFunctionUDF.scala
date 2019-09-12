package Scala_Excersices

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.udf

object CurryFunctionUDF {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Functions Currying")
       //.master("local[*]") //Commented for the pgm that will be deployed in GCP Data proc cluster
      .getOrCreate()

    val data = spark.read
      .option("InferSchema", "true")
      .option("header", "true")
      .csv(args(0))

    data.show()
    val DiffData = data.withColumn("DIFF CLOSE", diffCalculation()(data("CLOSE"), data("PREVCLOSE")))
    DiffData.show()
  }
  def diffCalculation(): UserDefinedFunction = udf ((close: Double, prevClose: Double) => {
    close-prevClose
  })
}