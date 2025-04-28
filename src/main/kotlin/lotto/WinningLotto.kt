package lotto

import camp.nextstep.edu.missionutils.Randoms

class WinningLotto {
    private var winningNumbers: ArrayList<Int> = arrayListOf()
        get() = winningNumbers
    private var bonusNumber: Int
        get() = bonusNumber

    init {
        val randNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 7)
        var idx = winningNumbers.size - 1
        for (i in 0 until idx) {
            winningNumbers.add(randNumbers[i])
        }
        bonusNumber = randNumbers[idx]
    }

    private fun validateWinningNumbers(winningNumbers: List<Int>) {
        require(winningNumbers.size == 6) { "[ERROR] Lotto must contains exactly 6 numbers." }
        winningNumbers.forEach {
            require(it in 1..45) { TODO() }
        }
    }
}