package RDDBasics

import org.apache.spark.sql.SparkSession

object ORC_JSON_PARQUET_AVRO_FileFormats_In_Dataframes {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("DATAFRAME FILE FORMATS : ORC/JSON/PARQUET")
      .master("local")
      .getOrCreate()


    print("SPARK provides out of the box functions for ORC/JSON and PARQUET ****But doesn't provide out of the box features for AVRO file formAT")
  val jsonDF = spark.read.json("Input_Dir/people.json")
    jsonDF.printSchema()
    jsonDF.show(4)
    println("Count is : " + jsonDF.count)
    jsonDF.write.format("json").save("Output_Dir/Json")


    val orcDF = spark.read.orc("Input_Dir/users.orc")
    orcDF.printSchema()
    orcDF.show()
        orcDF.write.format("orc").save("Output_Dir/Orc")



    val parquetDF = spark.read.parquet("Input_Dir/users.parquet")
    println("PARQUET")
    parquetDF.printSchema()
    parquetDF.show(1)
    parquetDF.write.format("parquet").save("Output_Dir/Parquet")



    val avroDF = spark.read.format("avro")
      .load("Input_Dir/users.avro")
    println("AVRO")

    avroDF.printSchema()
    avroDF.show(1)
    println("Row Count : " +avroDF.count)

    avroDF.write.format("avro").save("Output_Dir/avro")
  }

}
