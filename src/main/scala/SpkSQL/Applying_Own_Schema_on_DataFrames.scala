package SpkSQL

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringType
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DoubleType, IntegerType, StructField, StructType}

object Applying_Own_Schema_on_DataFrames {
  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .master("local")
      .appName("IMPOSING OWN/ CUSTOM SCHEMA ON ANY DATAFRAME")
      .getOrCreate()


    val namesDF = spark.read
      .options(Map("header" -> "true", "inferschema" -> "true"))
      .csv("Input_Dir/datapoint1.txt")

    namesDF.printSchema()
    println(" ABOVE IS THE SCHeMA INFERRED BY SPARK ")
    val OwnSchema = StructType(
      //      StructField(" Column 1", dataType , true) ::
      StructField(" Column 2", IntegerType, true) ::
        //      StructField(" Column 3", StringType, true) ::
        StructField(" Column 4", DoubleType, true) :: Nil)

    val NameswithOwnSchema = spark.read
      .option("header", "true")
      .schema(OwnSchema)
      .csv("Input_Dir/datapoint1.txt")

    NameswithOwnSchema.printSchema()
    println("ABOVE IS THE CUSTOM SCHEMA IMPOSED ON DATA")
    NameswithOwnSchema.show()
  }
}
