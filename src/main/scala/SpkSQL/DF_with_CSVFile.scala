package SpkSQL

import org.apache.spark.sql.SparkSession

object DF_with_CSVFile {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("Creating Dataframe using CSV file")
      .master("local")
      .getOrCreate()


    val df = spark.read.options(Map("header" -> "true", "inferSchema" -> "true"))
      .csv("Input_Dir/sampleCSV.csv")

    df.printSchema()
    df.show()


  }
}
