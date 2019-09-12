package RDDBasics

import org.apache.spark.sql.SparkSession

object SparkContext_with_SparkSession_in_Spark2_Way {
  // You don't have to create a spark configuration and no need to initialize spark context explicitly

  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession.builder()
      .appName("CREATING SPARK CONTEXT WITH SPARK SESSION")
      .master("local")
      .getOrCreate()
/*
    val array = Array(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    val arrayRDD = sparkSession.sparkContext.parallelize(array, 4)

    //prints RDD Content

    arrayRDD.foreach(println)
*/
    val file = "C:\\Users\\venka\\OneDrive\\Desktop\\Diana Continued.txt"
    val fileRDD =sparkSession.sparkContext.textFile(file)

    print("Number of Records: " + fileRDD.count())
    fileRDD.take(10).foreach(println)
  }

}
