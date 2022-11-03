package KotlinTask

fun main (){
    println("Введите длину")
    val brick_length =readLine()!!.toInt()
    println("Введите ширину")
    val brick_width =readLine()!!.toInt()
    println("Введите высоту")
    val brick_height =readLine()!!.toInt()
    println("Введите сторону отверстия r")
    val wall_r =readLine()!!.toInt()
    println("Введите сторону отверстия s")
    val wall_s =readLine()!!.toInt()
    println("Размер кирпича $brick_length x $brick_width x $brick_height")
    println("Размер отверстия $wall_r x $wall_s")
    fun brickPasses(brick_length: Int, brick_width: Int, brick_height: Int, wall_r: Int, wall_s: Int): Boolean {
        return (brick_height <= wall_r && brick_width <= wall_r) || (brick_height <= wall_s && brick_width <= wall_s)
    }
    if (brickPasses(brick_length, brick_width, brick_height, wall_r, wall_s))
        println("Проходит")
    else
        println("Не проходит")
}