package RDDBasics

import org.apache.spark.sql.SparkSession

object GapAssessment {

  def main(args:Array[String]): Unit = {
    val sc = SparkSession.builder().appName("Test").master("local")getOrCreate()

    val d1 = sc.read.format("csv").option("header",true).option("inferSchema",true).load(args(0))
    val d2 = sc.read.format("csv").option("header",true).option("inferSchema",true).load(args(1))
    val d3 = sc.read.format("csv").option("header",true).option("inferSchema",true).load(args(2))

    val joinedDf = d1.join(d2,d1.col("uniprdid") === d3.col("uniprdid"),"inner").join(d3,d1.col("loc") === d2.col("loc"),"inner")

    joinedDf.write.partitionBy("market","channel","brand").format("csv").save(args(3))
  }
}
