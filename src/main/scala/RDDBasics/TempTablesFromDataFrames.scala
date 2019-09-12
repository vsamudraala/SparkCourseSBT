package RDDBasics

import org.apache.spark.sql.SparkSession

object TempTablesFromDataFrames {

  def main(args: Array[String]): Unit ={
    val spark = SparkSession.builder()
      .appName("Creating temp tables from Dataframes")
      .master("local")
      .getOrCreate()


    val exampleDF = spark.read.option("inferSchmea", "true").option("header", "true").csv("Input_Dir/sampleCSV.csv")

    exampleDF.show()

    exampleDF.createTempView("Temp_table")
    val limitedDF = spark.sql("select N,Venkatesh, Shiva, Dagadu, Sudheer, Rohit from Temp_table limit 4")
    limitedDF.show()

    println("    exampleDF.createTempView() //To create a temp table\n    " +
      "exampleDF.createOrReplaceTempView()  //If a temp table already exists with the same name , It will replace, else it will create a new temp table\n    " +
      "exampleDF.createGlobalTempView()  //Create a global temp table \n " +
      "exampleDF.createOrReplaceGlobalTempView()")
  }
}
