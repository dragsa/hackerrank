package com.gnat.hacker

import java.io.PrintWriter

import scala.io.StdIn

object WarmUp {

  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }

}

object SimpleArraySum {

  /*
   * Complete the simpleArraySum function below.
   */
  def simpleArraySum(ar: Array[Int]): Int = {
    ar.foldLeft(0) { case (sum: Int, head: Int) => sum + head }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = simpleArraySum(ar)

    printWriter.println(result)

    printWriter.close()
  }

  //  def main(args: Array[String]) {
  //    val stdin = scala.io.StdIn
  //
  //    val arCount = stdin.readLine.trim.toInt
  //
  //    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
  //    val result = simpleArraySum(ar)
  //
  //    println(result)
  //  }
}

object Solution {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    ???
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = compareTriplets(a, b)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
