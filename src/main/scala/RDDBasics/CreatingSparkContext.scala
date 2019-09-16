package RDDBasics

import org.apache.spark
import org.apache.spark.{SparkConf, SparkContext}

// OBJECT is the main entry point like the static in Java

object CreatingSparkContext {

  def main(args: Array[String]):Unit = {
    val sparkConf = new SparkConf()
 //METHOD USED TO CREATE SPARK JOB NAME
    sparkConf.setAppName("FirstSparkApplication")

    sparkConf.setMaster("local")


    //CREATING SPARK COMTEXT
    val sc = new SparkContext(sparkConf)

    val array= Array(1,2,34,5,6,7,8,9,10,11,12)
    val arrayRDD =sc.parallelize(array)


  println("Number of Elements in RDD: ", arrayRDD.count())
  arrayRDD.foreach(println)

  }
}