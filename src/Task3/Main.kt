package Task3
fun main (){
    var a = Number(5.95)
    var b = Number(84.77)
    a.allNumberToInt0()
    println("-----------------------------")
    a.allNumberToInt1()
    println("-----------------------------")
    b.allNumberToInt0()
    println("-----------------------------")
    b.allNumberToInt1()
}

class Number {
    var value : Double = 0.0

    constructor(value: Double) {
        this.value = value
    }
    //Первый вариант задачи с простым изменением типа переменной
    fun allNumberToInt0 () {
        println(value.toInt())
    }
    //Второй вариант с округлением переменной
    fun allNumberToInt1 () {
        var b = value.toInt()
        var c = value - b
        if (c >= 0.5){
            println(b + 1)
        } else{
            println(b)
        }
    }
}