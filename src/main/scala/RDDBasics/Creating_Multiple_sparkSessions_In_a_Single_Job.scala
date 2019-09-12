package RDDBasics

import org.apache.spark.sql.SparkSession

object Creating_Multiple_sparkSessions_In_a_Single_Job {

  def main(args: Array[String]): Unit = {

       val sparkSession1 = SparkSession.builder()
      .appName("CREATING MULTIPLE SPARK SESSIONS IN A SINGLE JOB----SpkSession 1")
      .master("local")
      .getOrCreate()

      val sparkSession2 = SparkSession.builder()
        .appName("CREATING MULTIPLE SPARK SESSIONS IN A SINGLE JOB----SpkSession 2")
        .master("local")
        .getOrCreate()


    val rdd1=sparkSession1.sparkContext.parallelize(Array(1,2,3,4,5,6))
    val rdd2=sparkSession1.sparkContext.parallelize(Array(7,8,9," 10 ",11,12))

    rdd1.collect().foreach(print);
    rdd2.collect().foreach(print);
  }

}
