package SpkSQL

import org.apache.spark.sql.SparkSession

object Basic_DF_Operatioms_PART_2 {

  def main (args: Array[String]): Unit ={

    val spark = SparkSession.builder().appName("Dataframes Part II").master("local[2]").getOrCreate()


    val sampleDF= spark.read.orc("Input_Dir/users.orc")

    val customDF = sampleDF.select("name","favorite_numbers").show(1)
  }
}
