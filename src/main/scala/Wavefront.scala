package edu.luc.etl.scala.wavefront

object Main:

  def main(args: Array[String]) =
    if args.length < 1 then
      Console.err.println("usage: Main n")
      System.exit(1)
    val n = args(0).toInt
    val w = wavefront(n)
    for i <- 0 until n do
      for j <- 0 until n do
        print(w(i)(j))
        print(" ")
      println()

  def wavefront(n: Int) =
    lazy val a: LazyList[LazyList[Int]] = LazyList.tabulate(n, n)((i, j) =>
      if i == 0 then
        j
      else if j == 0 then
        i
      else
        a(i)(j - 1) + a(i - 1)(j - 1) + a(i - 1)(j))
    a

end Main
