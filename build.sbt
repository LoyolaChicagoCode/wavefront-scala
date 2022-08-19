name := "wavefront-scala"

version := "0.2"

scalaVersion := "3.1.3"

scalacOptions ++= Seq("-unchecked", "-Yexplicit-nulls", "-language:strictEquality", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,
  "org.scalatest"  %% "scalatest"       % "3.2.13"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.16.0" % Test
)

scalacOptions ++= Seq("-rewrite", "-new-syntax")
