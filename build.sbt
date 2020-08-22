name := "wavefront-scala"

version := "0.2"

scalaVersion := "2.13.3"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,
  "org.scalatest"  %% "scalatest"       % "3.2.1"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.14.3" % Test
)
