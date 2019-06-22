package flinker

import org.apache.spark.{SparkConf, SparkContext}


object sparkAlluxio{
  def main(args:Array[String]){
    val conf:SparkConf = new SparkConf().setAppName("Histogram")
    val sc:SparkContext = new SparkContext(conf)
    //val s = sc.textFile("alluxio://alluxio:19998/mini.csv")

    val s = sc.textFile("alluxio://GlusterFS2:19998/2008.csv")

    s.take(10)
    //s.saveAsTextFile("alluxio://alluxio-master:19998/2009.csv")
   /* val sqlcontext = new SQLContext(sc)

    val a = sqlcontext.read.format("csv").option("delimiter",",").option("quote","").option("header","true").option("inferSchema","true").load("/opt/spark/data/2008.csv")
    a.groupBy("UniqueCarrier","FlightNum").count().show()*/
  }
}
