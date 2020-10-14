fun main(){
    
    val x = 5

    when (x) {
        1, 2 -> print("x less than 3")
        3 -> print("x == 2")
        in 4..10 -> print("x between 4 and 10")
        else -> print("none of the above")
    }
    
}