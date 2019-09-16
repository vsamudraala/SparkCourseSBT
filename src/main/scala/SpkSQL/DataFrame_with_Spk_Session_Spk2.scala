package SpkSQL

import org.apache.spark.sql.types.{IntegerType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object DataFrame_with_Spk_Session_Spk2 {

  def main(args: Array[String]): Unit = {

    var spark = SparkSession.builder()
      .appName("creating Dataframe using Spark session: Spark 2 way")
      .master("local")
      .getOrCreate()


    val rdd = spark.sparkContext.parallelize(Array(1, 2, 3, 4, 5, 6), 2)

    //CREATING SCHEMA: We use struct type to create a schema, and to create columns you have to use StructField

    val schema = StructType(
      StructField("Integers as String", IntegerType, true) :: Nil
    )
    //           Col Name             Col type           After Schema, you have to end with "Nil"- which represents the end of Struct type

    val rowRDD = rdd.map(element => Row(element)) //Convert RDD to Row type RDD/ row type object



    val df = spark.createDataFrame(rowRDD, schema)
    df.printSchema()
    df.show(4)
  }
}
