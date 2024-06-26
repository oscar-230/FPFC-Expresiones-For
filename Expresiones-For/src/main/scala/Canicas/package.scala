/**
 * Taller #4 Las canicas y los frascos
 * Package.scala
 * Oscar David Cuaical Lopez (202270657)
 * Jose Miguel Fuertes Benavides (202224623)
 */
package object Canicas {

  type Frasco = (Int, Int)
  type Distr = List[Frasco]

  def canicasPosiblesFrasco(f: Int, c: Int): List[Frasco] = {
    for {
      canicas <- (0 to c).toList
    } yield (f, canicas)
  }

  def canicasPorFrasco(n: Int, c: Int): List[Distr] = {
    for {
      f <- (1 to n).toList
    } yield canicasPosiblesFrasco(f, c)
  }

  def mezclarLCanicas(lc: List[Distr]): List[Distr] = {
    lc match {
      case Nil => List(Nil)
      case x :: xs => for {
        i <- x
        j <- mezclarLCanicas(xs)
      } yield i :: j
    }
  }

  def distribucion(m:Int, n:Int, c:Int): List[Distr] = {
   for {
     combinacion <- mezclarLCanicas(canicasPorFrasco(n, c))
     if combinacion.map(_._2).sum ==m
   } yield combinacion
  }

  def agrupaciones(m: Int): List[List[Int]] = {
    val frascos = distribucion(m, m, m).flatMap(_.map(_._1))
    def combinar(n: Int, lista: List[Int]): List[List[Int]] = {
      if (n == 0) List(Nil)
      else {
        for {
          i <- lista
          j <- combinar(n - i, lista.filter(_ > i))
        } yield i :: j
      }
    }
    combinar(m, frascos.distinct.sorted)
  }
}
