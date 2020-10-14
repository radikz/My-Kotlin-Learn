fun main() {

    var result = findArea(2, 3)
    print(result)
}

fun findArea(length: Int = 10, width: Int = 5): Int {

    return length * width
}