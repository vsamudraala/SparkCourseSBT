package RDDBasics

//Dataframe is a distributed collection of data organized into named columns, You can consider dataframe as a table in
// RDBMS or like excel sheet in which the data is represented in row. It's similar to Python's pandas Dataframe but
// with richer optimizations under the hood
/*It allows developers to impose structure to distributed data, In RDD you will have just the data distributed across
the cluster, but with Dataframe, you can impose struvture to the data-, you can tell what is the tyoe of data, what
is the column name for the data, and you can extract the names based on the column names, extract only specific columns etc.
-And you can do all kind of SQL operations on the top of your dataframe. It's almost like working with SQL.
It supports wide variety of data formats and storage types: Like Hive, Amazon s3 etc.
It can be crated from wide variety of sources like csv, json, avro, parquet etc.... From hive tables , existing rdd's etc
IT CAN HAVE SCHEMA(column name, column typ, value is nullable or not):

DATA IN DATAFRAME IS REPRESENTED AS COLLECTION OF ROW OBJECTS


*/



object DataFrame {
}