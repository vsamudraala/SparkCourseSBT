package RDDBasics

import org.apache.spark.sql.SparkSession

object RDD_with_CSV_file {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("RDD with CSV FILES")
      .master("local")
      .getOrCreate()


    //    val csvRDD = spark.sparkContext.textFile("C:\\Users\\venka\\OneDrive\\Desktop\\Spark\\sarath\\Spark\\Spark_PPTs_Examples\\others\\SparkSQL\\anatomy_of_spark_dataframe_api-master\\src\\main\\resources\\sales.csv")
    val csvRDD = spark.sparkContext.textFile("Input_Dir/sampleCSV.csv")
    csvRDD.take(10).foreach(println)
    val header = csvRDD.first()
    //VALUES WITHOUT HEADER
    val csvRDD_WithoutHeader = csvRDD.filter(_ != header)
    println("Shortest way for **** csvRDD.filter(line => line != header)**** is **** csv.RDD.filter(_ !=header)*** ")

    csvRDD_WithoutHeader.take(10).foreach(println)

    // val csvArray = csvRDD_WithoutHeader.map(line => line.split(",")(3))

    print("The below function takes and prints the specific columns from the dataset")
    val specificColumns = csvRDD_WithoutHeader.map(line => {
      val ColArray = line.split(",")
      Array(ColArray(0), ColArray(4), ColArray(5)).mkString(" : ")
    })

    specificColumns.take(10).foreach(println)
    specificColumns.saveAsTextFile("\\tmp\\tempRDDwithCSVFileoutput")
  }
}
