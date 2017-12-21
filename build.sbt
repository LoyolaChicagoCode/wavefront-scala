name := "wavefront-scala"

version := "0.2"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,
  "org.scalatest"  %% "scalatest"       % "3.0.1"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.13.4" % Test
)
