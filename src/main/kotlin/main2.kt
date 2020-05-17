class Person(val name: String, val age: Int){//первичный конструктор
    fun sayHello(){
        println("Hello")
    }
    fun getInfo() : String{
        return "Name: $name  Age: $age"
    }
}
// Skrill1945 исправил комменты (добавил пробельчики)))
fun main(args: Array<String>) {
    val alice: Person = Person("Bob", 23) // создание объекта
    alice.sayHello()          // Hello
    println(alice.getInfo())  // Name: Bob  Age: 23
    // внёс изменения
    val bob: Person = Person("Alice", 32)
    println(bob.getInfo())
    println("Hi")
    // нужно сделать commit
    // commit -- сохранить изменения(пока локально!!!) ГО СДЕЛАЕМ
    //----------------
    // Создаем новую ветку(branch) checkout - переключение (между ветками)
    // Создал ветку
    // ---В новой ветке внес изменения
}