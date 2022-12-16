fun main() {
    print(solution(10, 50))
}

fun solution(divisor: Int, bound: Int): Int {
    for (i in bound downTo 0) {
        if (i % divisor == 0)
            return i
    }
    return 0
}