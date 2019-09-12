name := "SparkCourseSBT"

version := "0.1"

scalaVersion := "2.12.8"

//To create spark project we have to add SBT dependencies for your Project. Add following Dependencies
//1. For Spark CORE
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.2"

//2. Spark SQL
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.2"

//3. For AVRO
// https://mvnrepository.com/artifact/org.apache.spark/spark-avro
libraryDependencies += "org.apache.spark" %% "spark-avro" % "2.4.2"


// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.2" % "provided"



