package SpkSQL

import org.apache.spark.sql.{SaveMode, SparkSession}

object jt2 {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder()
      .appName("jSoN tEsTiNg")
      .master("local[2]")
      .getOrCreate()


    val jsonDF = spark.read.option("multiline", true).json("C:\\Users\\venka\\IdeaProjects\\SparkCourseSBT\\Input_Dir\\test1.json")
    //    jsonDF.printSchema()
    //    jsonDF.show(4)
    jsonDF.createOrReplaceTempView("tmpTbl")

    //val SelectedCols= spark.sql("select dailyRequests from tmpTbl")
    //    val SelectedCols= spark.sql("select * from tmpTbl")
    //    val SelectedCols = spark.sql("select appId, dailyRequests[0].elements[0] from tmpTbl")
    //    val SelectedCols = spark.sql("select appId, correlationId, explode(dailyRequests) from tmpTbl")
    //SAFE POINT:  val SelectedCols = spark.sql("select correlationId, appId, reqDate, reqType, explode(dailyRequests.uniqueDownloadId),dailyRequests[0].elements[0], dailyRequests.startDate, dailyRequests.endDate from tmpTbl")
    //  SAFE POINT 2:  val SelectedCols = spark.sql("select correlationId, appId, reqDate, reqType, explode(dailyRequests.uniqueDownloadId),explode(dailyRequests.accountIdentifiers[0]),dailyRequests[0].elements[0], dailyRequests[0].elements[1],dailyRequests[0].elements[2],dailyRequests[0].elements[3],dailyRequests[0].elements[4],dailyRequests[0].elements[5],dailyRequests[0].elements[6], dailyRequests.startDate, dailyRequests.endDate from tmpTbl")
    val SelectedCols = spark.sql("select correlationId, appId, reqDate, reqType, explode(dailyRequests.uniqueDownloadId),explode(dailyRequests.accountIdentifiers[0]),dailyRequests[0].elements[0], dailyRequests[0].elements[1],dailyRequests[0].elements[2],dailyRequests[0].elements[3],dailyRequests[0].elements[4],dailyRequests[0].elements[5],dailyRequests[0].elements[6], dailyRequests.startDate, dailyRequests.endDate from tmpTbl")
    // val SelectedCols = spark.sql("select explode(dailyRequests.accountIdentifiers[0]) from tmpTbl")

    //  SelectedCols.printSchema()
    print("SPARK VERSION IS : " + spark.version + "\n")
    SelectedCols.show(false)
  }

}
