package lotto

import camp.nextstep.edu.missionutils.Randoms
import lotto.WinningPrize.Companion.matchStatistic

class LottoEngine (
    private val devideFactor: Int,
) {
//    fun matchWinningNumber(issuedTickets: List<Lotto>, winningNumber: WinningNumbers): Map<WinningPrize, Int> {
//        val results = initializeWinningPrizeResults()
//        issuedTickets.map {
//            val matchedNumbers = it.countMatchNumbers(winningNumber.numbers)
//            val isMatchedBonus = it.isMatchBonusNumber(winningNumber.bonusNumber)
//        }
//    }

    fun issueLottoTickets(purchasedAmount: Int): List<Lotto> {
        val issueCounts = calculateIssueCount(purchasedAmount)
        val lottoTickets = arrayListOf<Lotto>()
        repeat(issueCounts) {
            lottoTickets.add(issueLotto())
        }
        return lottoTickets
    }

    private fun calculateIssueCount(purchasedAmount: Int): Int {
        require(purchasedAmount >= devideFactor) { TODO() }
        return purchasedAmount / devideFactor
    }

    private fun issueLotto(): Lotto {
        return Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6))
    }

    private fun initializeWinningPrizeResults(): Map<WinningPrize, Int> {
        return WinningPrize.values().associateBy({ it }, { 0 })
    }
}