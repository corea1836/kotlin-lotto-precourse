package lotto

class LottoEngine(
    private val winningNumbers: List<Int>,
    private val bonusNumber: Int,
    private val purchasedAmount: Int,
    private val statisticResults: Map<WinningStatistic, Int> = mapOf()
) {
    init {
        validateWinningNumbers(winningNumbers)
        require(bonusNumber in 1..45) { TODO() }
        require(purchasedAmount >= 1000) { TODO() }
    }

    private fun validateWinningNumbers(winningNumbers: List<Int>) {
        require(winningNumbers.size == 6) { "[ERROR] Lotto must contains exactly 6 numbers." }
        winningNumbers.forEach {
            require(it in 1..45) { TODO() }
        }
    }

}