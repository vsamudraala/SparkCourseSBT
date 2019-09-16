package RDDBasics

import org.apache.spark.sql
import org.apache.spark.sql.SparkSession

object Functions {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Functions Practise")
      .master("local[2]")
      .getOrCreate()

    // println("map\nfilter\nflatMap\nmapPartitions\nmapPartitionsWithIndex\ngroupBy\nsortBy\nsample\nrandomSplitMath \nunion\nintersection\nsubtract\ndistinct\ncartesian\nzip\ntakeOrderedData \nsaveAsTextFile\nsaveAsSequenceFile\nsaveAsObjectFile\nkeyBy\nzipWithIndex\nzipWithUniqueID\nzipPartitions\ncoalesce\nrepartition\nrepartitionAndSortWithinPartitions\npipe\ncount\ntakeSample\nmax\nmin\nsum\nhistogram\nmean\nvariance\nstdev\nsampleVariance\ncountApprox\nountApproxDistinct\nreduce\ncollect\naggregate\nfold\nfirst\ntake\nforEach\ntop\ntreeAggregate\ntreeReduce\nforEachPartition\ncollectAsMap\nsampleByKeyMath keys\nvalues\npartitionBy\ncountByKey\ncountByValue\ncountByValueApprox\ncountApproxDistinctByKey\ncountApproxDistinctByKey\ncountByKeyApprox\nsampleByKeyExact\ncogroup(=groupWith)\njoin\nsubtractByKey\nfullOuterJoin\nleftOuterJoin\nrightOuterJoin\nflatMapValues\ngroupByKey\nreduceByKey\nreduceByKeyLocally\nfoldByKey\naggregateByKey\nsortByKey\ncombineByKey")

    val babynamesDF = spark.read.format("csv").option("header", "true").load("C:/Users/venka/OneDrive/Desktop/hemanth/NationalNames.csv").toDF()
    val saveasTestFile = babynamesDF.show(4)

    //println("Baby names count: " + babynamesDF.count())
    //println("First Baby Name using First Function : "+)
    //val f = babynamesDF.take(4)
    //babynamesDF.printSchema()
    //    babynamesDF.withColumnRenamed("Id","ID")
    //      .printSchema()



  }


}

