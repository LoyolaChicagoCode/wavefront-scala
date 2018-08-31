name := "wavefront-scala"

version := "0.2"

scalaVersion := "2.12.6"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,
  "org.scalatest"  %% "scalatest"       % "3.0.5"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.14.0" % Test
)
