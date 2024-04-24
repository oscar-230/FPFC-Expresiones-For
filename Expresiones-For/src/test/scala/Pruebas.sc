/**
 * Taller #4 Las canicas y los frascos
 * Pruebas.sc
 * Oscar David Cuaical Lopez (202270657)
 * Jose Miguel Fuertes Benavides (202224623)
 */
import Canicas._

/*
Aclaracion:
Se presentan los casos de prueba para las funciones solicitadas,
sin embargo, algunos casos de prueba fallan por falta de memoria,
estos resultados quedan comentados,aun así, en la argumentacion
del informe se demuestra que los casos son correctos si se tiene
suficiente memoria.
Cuando se espera el tiempo suficiente se presenta este mensaje:
java.lang.OutOfMemoryError: GC overhead limit exceeded
 */

//Pruebas para canicasPosiblesFrasco

canicasPosiblesFrasco(1, 0) //List((1,0))
canicasPosiblesFrasco(0, 0) //List((0,0))
canicasPosiblesFrasco(4, 0) //List((4,0))
canicasPosiblesFrasco(6, 2) //List((6,0), (6,1), (6,2))
canicasPosiblesFrasco(2, 3) //List((2,0), (2,1), (2,2), (2,3))
canicasPosiblesFrasco(3, 3) //List((3,0), (3,1), (3,2), (3,3))
canicasPosiblesFrasco(5, 4) //List((5,0), (5,1), (5,2), (5,3), (5,4))
canicasPosiblesFrasco(2, 5) //List((2,0), (2,1), (2,2), (2,3), (2,4), (2,5))
canicasPosiblesFrasco(4, 5) //List((4,0), (4,1), (4,2), (4,3), (4,4), (4,5))
canicasPosiblesFrasco(10, 6) //List((10,0), (10,1), (10,2), (10,3), (10,4), (10,5), (10,6))
canicasPosiblesFrasco(4, 10) //List((4,0), (4,1), (4,2), (4,3), (4,4), (4,5), (4,6), (4,7), (4,8), (4,9), (4,10))
canicasPosiblesFrasco(1, 10) //List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10))
canicasPosiblesFrasco(1, 20) //List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), ... , (1,20))

//Pruebas para canicasPorFrasco

canicasPorFrasco(0,5) //List()
canicasPorFrasco(1,0) //List(List((1,0)))
canicasPorFrasco(1,1) //List(List((1,0), (1,1)))
canicasPorFrasco(1,2) //List(List((1,0), (1,1), (1,2)))
canicasPorFrasco(2,3) //List(List((1,0), (1,1), (1,2), (1,3)), List((2,0), (2,1), (2,2), (2,3)))
canicasPorFrasco(2,4) //List(List((1,0), (1,1), (1,2), (1,3), (1,4)), List((2,0), (2,1), (2,2), (2,3), (2,4)))
canicasPorFrasco(3,5) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5)), List((2,0), (2,1), (2,2), (2,3), (2,4),..., (3,5)))
canicasPorFrasco(8,4) //List(List((1,0), (1,1), (1,2), (1,3), (1,4)), List((2,0), (2,1), (2,2), (2,3), (2,4)), ..., (8,3), (8,4)))
canicasPorFrasco(10,4) //List(List((1,0), (1,1), (1,2), (1,3), (1,4)), List((2,0), (2,1), (2,2), (2,3), (2,4)), ..., (10,3), (10,4)))
canicasPorFrasco(9,15) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12),..., List((7,0), (7,1)...(9,15)
canicasPorFrasco(100,50) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12), ... , (2,43), (2,44), ..., (100,50)
canicasPorFrasco(500,100) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12), ..., (1,93), (1,94), (1,95)...(500,100  )
canicasPorFrasco(1,100) //List(List((1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12), ..., (1,93), (1,94), (1,95)..., (1,100)

//Pruebas para mezclarCanicas

mezclarLCanicas(canicasPorFrasco(0,5)) // List(List())
mezclarLCanicas(canicasPorFrasco(0,0)) //List(List())
mezclarLCanicas(canicasPorFrasco(1,1)) //List(List((1,0)), List((1,1)))
mezclarLCanicas(canicasPorFrasco(1,2)) //List(List((1,0)), List((1,1)), List((1,2)))
mezclarLCanicas(canicasPorFrasco(2,2)) //List(List((1,0), (2,0)), List((1,0), (2,1)), ..., List((1,2), (2,2)))
mezclarLCanicas(canicasPorFrasco(2,3)) //List(List((1,0), (2,0)), List((1,0), (2,1)), ..., List((1,3), (2,3)))
mezclarLCanicas(canicasPorFrasco(2,4)) //List(List((1,0), (2,0)), List((1,0), (2,1)), ..., List((1,4), (2,4)))
mezclarLCanicas(canicasPorFrasco(3,5)) //List(List((1,0), (2,0), (3,0)), List((1,0), (2,0), (3,1)), List((1,0),...
mezclarLCanicas(canicasPorFrasco(8,4)) //List(List((1,0), (2,0), (3,0), (4,0), (5,0), (6,0), (7,0), (8,0)), ... (8,1)), List((1,0), ...
mezclarLCanicas(canicasPorFrasco(10,2)) //List(List((1,0), (2,0), (3,0), (4,0), (5,0), (6,0), (7,0), (8,0), ... (9,1), (10,1)), ...,(7,0), (8,1), (9,0)...
mezclarLCanicas(canicasPorFrasco(10,3)) //List(List((1,0), (2,0), (3,0), (4,0), (5,0), (6,0), (7,0), (8,0), ....,(10,3)), List((1,0), (2,0), (3,0), ...(7,0), (8,0), (9,2)...
//mezclarLCanicas(canicasPorFrasco(10,4))

//Pruebas para distribucion

distribucion(2,0,2) //List()
distribucion(4,1,3) //List()
distribucion(3,1,3) //List(List((1,3)))
distribucion(4,2,2) //List(List((1,2), (2,2)))
distribucion(40,2,20) //List(List((1,20), (2,20)))
distribucion(50,5,10) //List(List((1,10), (2,10), (3,10), (4,10), (5,10)))
distribucion(4,2,3) //List(List((1,1), (2,3)), List((1,2), (2,2)), List((1,3), (2,1)))
distribucion(5,3,2) //List(List((1,1), (2,2), (3,2)), List((1,2), (2,1), (3,2)), List((1,2), (2,2), (3,1)))
distribucion(10,3,5) //List(List((1,0), (2,5), (3,5)), List((1,1), (2,4), (3,5)), List((1,1), (2,5), (3,4)), List((1,2), (2,3), (3,5)), List((1,2), (2,4), (3,4)), ...
distribucion(11,4,5) //List(List((1,0), (2,1), (3,5), (4,5)), List((1,0), (2,2), (3,4), (4,5)), List((1,0), (2,2), (3,5), (4,4)), List((1,0), (2,3), (3,3), (4,5)), ...
distribucion(20,5,10) //List(List((1,0), (2,0), (3,0), (4,10), (5,10)), List((1,0), (2,0), (3,1), (4,9), (5,10)), List((1,0), (2,0), (3,1), (4,10), (5,9)), ...
distribucion(8,4,6) //List(List((1,0), (2,0), (3,2), (4,6)), List((1,0), (2,0), (3,3), (4,5)), List((1,0), (2,0), (3,4), (4,4)), List((1,0), (2,0), (3,5), (4,3)), ...

//Preubas para agrupaciones

agrupaciones(0) //List(List())
agrupaciones(1) //List(List(1))
agrupaciones(2) //List(List(2))
agrupaciones(3) //List(List(1, 2), List(3))
agrupaciones(4) //List(List(1, 3), List(4))
agrupaciones(5) //List(List(1, 4), List(2, 3), List(5))
agrupaciones(6) //List(List(1, 2, 3), List(1, 5), List(2, 4), List(6))
agrupaciones(7) //List(List(1, 2, 4), List(1, 6), List(2, 5), List(3, 4), List(7))
//agrupaciones(8)
//agrupaciones(9)
//agrupaciones(10)

