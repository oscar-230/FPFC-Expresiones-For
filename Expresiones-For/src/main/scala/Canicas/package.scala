package object Canicas {

  type Frasco = (Int, Int)
  type Distr = List[Frasco]

  def canicasPosiblesFrasco(f: Int, c: Int): List[Frasco] = {
    (0 to c).toList.map(canicas => (f, canicas))
  }

  def canicasPorFrasco(n: Int, c: Int): List[Distr] = {
    (1 to n).toList.map(f => canicasPosiblesFrasco(f, c))
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

  def distribucion(m: Int, n: Int, c: Int): List[Distr] = {
    val canicas = canicasPorFrasco(n, c)
    val combinaciones = mezclarLCanicas(canicas)
    combinaciones.filter(_.map(_._2).sum == m)
  }

  def agrupaciones(m: Int): List[List[Int]] = {
    def combinar(n: Int, lista: List[Int]): List[List[Int]] = {
      if (n == 0) List(Nil)
      else {
        for {
          i <- lista
          j <- combinar(n - i, lista.filter(_ > i))
        } yield i :: j
      }
    }

    val listaElementos = (1 to m).toList
    combinar(m, listaElementos)
  }
}
