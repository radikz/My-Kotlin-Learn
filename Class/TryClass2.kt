fun main() {

    var rectangle = Rectangle()
    rectangle.height = 9
    rectangle.width = 4
    rectangle.Area()
}

class Rectangle (){
    
    var width: Int = 0
    var height: Int = 0
   
    fun Area(){
        var area: Int = width * height
        println("The area of rectangle is: $area")
    }
}