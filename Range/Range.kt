fun main() {

    val range1 = 1..5 // 1, 2, 3, 4, 5
    
    val range2 = 5..1 // 5, 4, 3, 2, 1
    
    val range3 = 5 downTo 1 // 5, 4, 3, 2, 1

    val range4 = 5 downTo 1 step 2 // This range contains number 5, 3, 1

    val range5 = 'a'..'d' // This range contains the values from "a", "b", "c" . . . "z"

    var range6 = 1.rangeTo(5) // This range contains number 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    
}