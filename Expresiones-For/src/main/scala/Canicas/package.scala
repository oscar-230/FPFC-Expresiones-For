package object Canicas {

  type Frasco = (Int, Int)
  type Distr = List[Frasco]


  def canicasPosiblesFrasco(f: Int, c: Int): List[Frasco] = {
    for {
      canicas <- (0 to c).toList
    } yield (f, canicas)

  }

  /*
  def canicasPorFrasco(n: Int, c: Int): List[Distr] = {

  }

  def mezclarLCanicas(lc:List[Distr]): List[Distr] = {

  }

  def distribucion(m:Int, n:Int, c:Int):List[Distr] = {

  }

  def agrupaciones(m: Int): List[List[Int]] = {

  }
  */
}
