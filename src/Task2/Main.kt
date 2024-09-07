package Task2
fun main (){
    var dog = Animal("Бобик" ,"Собака" ,25 )
    var cat = Animal("Мурка","Кошка", 8 )
    var cow = Animal ("Грация", "Корова", 600)
    var horse = Animal("Гриша", "Конь", 500)
    println("Объект ${horse.type} по имени ${horse.name} и массой ${horse.weitgh} кг вызывает функцию action:")
    println(horse.action())
}

class Animal{
    var type : String = ""
    var name : String = ""
    var weitgh : Int = 0

    constructor(name: String, type: String, weitgh: Int) {
        this.name = name
        this.type = type
        this.weitgh = weitgh
    }
    fun action (){
        when (type){
            "Корова" -> println("$type дает молоко")
            "Лошадь" -> println("$type похищена цыганами")
            "Конь" -> println("$type похищен цыганами")
            "Собака" -> println("$type грызёт кость")
            "Кошка" -> println("$type стоит перед открытой дверью и не заходит")

        }
    }

}