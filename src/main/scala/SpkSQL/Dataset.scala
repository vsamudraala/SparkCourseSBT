package SpkSQL

import org.apache.spark.sql.SparkSession

object Dataset {
  /*Datasets are similar to RDD's  but are strongly typed  that are mapped to relational schema.
  Datasets use Encoders for Serialization and Deserialization for processing the data over the network
  Using Dataset, memory utilization for data is upto 2X smaller, which reduces the network transfer costs
  DATASET FEATURES:
  1. Optimized query execution : By using Catalyst and Tungsten
  2. Analysis at Complie time: Syntax can be checked at  compile time
  3. inter-convertible nature: we can convert dataset to untyed dataframe
  4. Less memory consumption:
  5. PROVIDES STATIC TYPING AND RUN TIME TYPE SAFETY\\

  */
case class Ratings(Price: Double )
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("DATASET OPERATIONS ")
      .master("local")
      .getOrCreate()

    import spark.implicits._

    val RatingDF = spark.read.option("inferSchmea", "true")
      .option("header", "true")
      .csv("Input_Dir/sampleCSV.csv")
      .as[Ratings]
    RatingDF.show()

  }
}
