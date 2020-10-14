fun main() {

    var personObj = Person()
    personObj.name = "John"
    

    print("The name of the person is ${personObj.name}")
}

class Person {

    var name: String = ""
}