name := "wavefront-scala"

version := "0.2"

scalaVersion := "3.3.0"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,
  "org.scalatest"  %% "scalatest"       % "3.2.16" % Test,
  "org.scalacheck" %% "scalacheck"      % "1.17.0" % Test
)
