// scalastyle:off println
package org.apache.spark.examples.streaming

import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

object StreamingDoc {
  def main(args: Array[String]) {

    // Create the context with a 1 second batch size
    val sparkConf = new SparkConf().setAppName("StreamingDoc")
    val ssc = new StreamingContext(sparkConf, Seconds(1))

    val lines = ssc.socketTextStream(args(0), args(1).toInt, StorageLevel.MEMORY_AND_DISK_SER)
  //  val words = lines.flatMap(_.split(" "))
    //val wordCounts = words.map(x => (x, 1)).reduceByKey(_ + _)
    //wordCounts.print()
    ssc.start()
    ssc.awaitTermination()
  }
}