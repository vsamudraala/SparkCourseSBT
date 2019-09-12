package RDDBasics

import org.apache.spark.sql.SparkSession

object Basic_DF_Operations_PART_1 {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("BASIC DATAFRAME OPERATIONS")
      .master("local[2]")
      .getOrCreate()


    val customDF = spark.read.orc("Input_Dir/users.orc")
    customDF.printSchema()

    customDF.head(4).foreach(println)
    customDF.show(4)



    val csvDf = spark.read.options(Map("inferSchema" -> "true","header" -> "true")).csv("Input_Dir/sampleCSV.csv")
    csvDf.show()

    /*

    //SELECT SPECIFIc COLUMNS FROM THE DATAFRAMES
//    customDF.select("name", "favorite_numbers").show
    val FDF = customDF.select("name", "favorite_numbers").filter(customDF("name") === "Alyssa").show()

*/







    /*
    val colNames = customDF.columns
    println("Column Names List : ")
    println(colNames)
    println(colNames.mkString(" , "))

    val ColDesc=customDF.describe("favorite_numbers")
    ColDesc.show()

*/
  }
}

