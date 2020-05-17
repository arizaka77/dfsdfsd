class Person(val name: String, val age: Int){//первичный конструктор
    fun sayHello(){
        println("Hello")
    }
    fun getInfo() : String{
        return "Name: $name  Age: $age"
    }
}

fun main(args: Array<String>) {
    val bob: Person = Person("Bob", 23) //создание объекта
    bob.sayHello()          // Hello
    println(bob.getInfo())  // Name: Bob  Age: 23
    //внёс изменения
    val alice: Person = Person("Alice", 32)
    //нужно сделать commit
    //commit -- сохранить изменения(пока локально!!!) ГО СДЕЛАЕМ
    //----------------
    //Создаем новую ветку(branch) checkout - переключение (между ветками)
    //Создал ветку
}