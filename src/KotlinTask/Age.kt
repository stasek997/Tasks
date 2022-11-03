package KotlinTask

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var num: Int = reader.nextInt()

    if (num > 200 || num<=0) {
        println("Неправильный возраст")
    }
    else {
        if (num == 1) {
            println("$num год")
        }
        if (num in 2..4) {
            println("$num года")
        }
        if (num in 5..200) {
            println("$num лет")
        }
    }
}