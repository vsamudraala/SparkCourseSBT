package GCP

import org.apache.spark.sql.SparkSession

object SparkOnGcp {

  def main(args: Array[String]): Unit ={
    val spark = SparkSession.builder()
      .appName("Spark On GCP")
      .getOrCreate()

println("SPARK CONFIGURATIONS")



    val rdd= spark.sparkContext.parallelize(Array(1,2,3,4,5,6))
    rdd.collect().foreach(println)
  }
}
