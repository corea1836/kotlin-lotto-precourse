package lotto

object Convertor {
    fun convertStringToLottoNumbers(numbers: String): List<Int> {
        return numbers.split(",").map { it.toInt() }
    }
}