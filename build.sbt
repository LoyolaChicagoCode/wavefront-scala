name := "wavefront-scala"

version := "0.2"

scalaVersion := "3.0.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,
  "org.scalatest"  %% "scalatest"       % "3.2.9"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.15.4" % Test
)
