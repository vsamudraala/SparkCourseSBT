package SpkSQL

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession


object basic_SQL {

  def main(args: Array[String]) {

    val spark = SparkSession.builder()
      .appName("Spark SQL basics")
      .master("local[2]")
      .getOrCreate()

    // For implicit conversions like converting RDDs to DataFrames
    import spark.implicits._

    val df = spark.read.option("header", "true").csv("C:/Users/venka/OneDrive/Desktop/hemanth/NationalNames.csv")
    //df.show(5)
    //df.printSchema()
    //df.select($"Name", $"Year").show(2)
    //df.show(4)
    //df.select($"Name", $"Year" + 1).show(2)
    //df.filter($"Id" <4 ).show()

    //df.groupBy("Gender").count().show()
    df.createOrReplaceTempView("BabyNames")
    //    spark.catalog.listTables().show()
    //    spark.sql("show tables").show()
    spark
      .sql("select Id from BabyNames limit 4")
      .show()
    spark
      .sql("select * from BabyNames where Gender = 'F'")
      .show(10)
    spark
      .sql(
        """select *
          |from BabyNames
          |where Name like 'M%'""".stripMargin)
      .show(10)

    spark
      .sql(
        """select *
          |from BabyNames
          |where Name like 's%'
          |or id = 25""".stripMargin)
      .show(10)


  }

}
