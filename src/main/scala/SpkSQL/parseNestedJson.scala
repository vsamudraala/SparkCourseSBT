package SpkSQL

import org.apache.spark.sql.SparkSession

object parseNestedJson {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .master("local")
      .appName("IMPOSING OWN/ CUSTOM SCHEMA ON ANY DATAFRAME")
      .getOrCreate()
    val df = spark.read.json("Input_Dir/test1.json")
    df.createOrReplaceTempView("test")

    spark.sql("select * from test").printSchema()
  }
}
