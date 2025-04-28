package lotto

import lotto.Convertor.convertStringToLottoNumbers

class WinningNumbers(
    val numbers: List<Int>,
    val bonusNumber: Int
) {
    init {
        val uniqueNumbers = numbers.toSet()
        require(uniqueNumbers.size == 6) { TODO() }
        require(uniqueNumbers.filter { it in 1..45 }.size == 6) { TODO() }
        require(uniqueNumbers.first{ it == bonusNumber } != null) { TODO() }
        require(bonusNumber !in 1..45) { TODO() }
    }
}