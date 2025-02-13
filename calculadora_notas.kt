/**
 * Calculadora de notas ejercicio 2
 * programa capas de calcular el promedio basado en 3 notas
 * de cierta cantidad de estudiantes
 */

fun main(){
    //Constantes principales a declarar para el desarrollo
    val Numero_Notas = 3
    val Nota_Aprobacion = 3.0

    //Variables para almacenar cada una de las 3 notas que digite el usuario
    var nota1: Double
    var nota2: Double
    var nota3: Double

    //Ahora pedimos al usuario una entrada desde consola para las notas
    println("Ingrese la primera nota: ")
    nota1 = readLine()!!.toDouble()

    println("Ingrese la segunda nota: ")
    nota2 = readLine()!!.toDouble()

    println("Ingrese la tercera nota: ")
    nota3 = readLine()!!.toDouble()

    //variable para calcular y almacenar el promedio
    val promedio = (nota1 + nota2 + nota3)/Numero_Notas

    //Mostrar el promedio calculado en pantalla
    println("El promedio de las notas $nota1, $nota2, y $nota3 es: $promedio")

}