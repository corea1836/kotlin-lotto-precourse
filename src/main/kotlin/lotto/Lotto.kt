package lotto

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] Lotto must contain exactly 6 numbers." }
    }

    fun countMatchNumbers(winningNumbers: List<Int>): Int {
        return winningNumbers.intersect(numbers).size
    }

    fun isMatchBonusNumber(bonusNumber: Int): Boolean {
        return numbers.contains(bonusNumber)
    }
}
