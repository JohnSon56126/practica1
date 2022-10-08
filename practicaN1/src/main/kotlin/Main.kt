import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt
fun main() {

    // Задание 1
    var exercises: Int = 13
    var exercisesSolved: Int = 2
    var age = 5
    println(age)
    exercisesSolved +=1

    // Задание 2
    var myAge = 18
    println(myAge)
    exercisesSolved +=1

    // Задание 3
    var Age: Double = 18.0
    var averageAge = (18 + 30) / 2
    println(averageAge)
    exercisesSolved +=1

    // Задание 4
    var testNumber = 8
    var evenOdd = testNumber % 2
    println(evenOdd)
    exercisesSolved +=1

    // Задание 5
    var answer: Int = 0
    answer = +1
    answer = +10
    answer *= 10
    answer = answer shr 3
    println(answer)
    exercisesSolved +=1

    // Задание 6
    age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved +=1

    //Задание 7
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = a * 100 + b
    print(answer1)
    val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
    val answer3: Int = (a * 100) + (b / 10)
    print(answer3)
    // Задание 8
    val primer: Int = (5 * 3) - ((4/2) * 2)
    println(primer)
    exercisesSolved += 1

    // 9 задача
    val c: Double = 4.5
    val d : Double = 3.5
    val average: Double =  (c + d) / 2
    println(average)
    exercisesSolved += 1

    // 10 задача
    val fahrenheit: Double = 234.5
    val celcius: Double = (fahrenheit / 1.8) - 32
    println(celcius)
    exercisesSolved += 1

    // 11 задача
    val position: Int = 44
    val row:Int = position / 8
    val column:Int = position % 8
    println(position)
    println(row)
    println(column)
    exercisesSolved += 1

    // 12 задача
    val degrees: Double = 30.0
    val radians: Double = (degrees * PI) / 180.0
    println(radians)
    exercisesSolved += 1

    // 13 задача
    val x1: Double = 5.0
    val y1: Double = 6.0
    val x2: Double = 6.0
    val y2: Double = 4.0
    val distance: Double = sqrt( (x2 - x1).pow(2)) + (y2 - y1).pow(2)
    println(distance)
    exercisesSolved += 1
    println(exercisesSolved)

}

