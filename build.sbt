name := "spark-kafka-scala"

version := "0.1"

scalaVersion := "2.12.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.0" % "provided"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.0"