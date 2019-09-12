package GCP

import org.apache.hadoop.hdfs.server.common.Storage
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.{SparkConf, SparkContext}

object myfirstStream {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setAppName("Spark Streaming Example....").setMaster("local[*]").set("spark.executor.memory", "1g")
    val ssc = new StreamingContext(sparkConf, Seconds(10))

    val lines = ssc.socketTextStream("localhost", 9999)

    val words = lines.flatMap(_.split(" "))
    val pairs = words.map(word=>(word,1))
    val wordCounts = pairs.reduceByKey(_+_)
    wordCounts.print()
    ssc.start()
    ssc.awaitTermination()
  }
}
