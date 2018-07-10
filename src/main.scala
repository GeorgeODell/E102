import scala.math.pow

class triangle(v1: Array[Int], v2: Array[Int], v3: Array[Int]) {
  val vertices = Array.ofDim[Int](3, 2)
  vertices(0) = v1
  vertices(1) = v2
  vertices(2) = v3
}

object main {

  def distanceBetween(vertex1: Array[Int], vertex2: Array[Int]): Double = {
    val squaresOfSums = pow(vertex1(0) + vertex2(0), 2) + pow(vertex1(1) + vertex2(1), 2)
    pow(squaresOfSums, 0.5)
  }

  def perimeter

  var vertices = Array.ofDim[Int](3, 2)

  vertices(0)(0) = -340
  vertices(0)(1) = 495
  vertices(1)(0) = -153
  vertices(1)(1) = -910
  vertices(2)(0) = 835
  vertices(2)(1) = -947


}
