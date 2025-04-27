# kotlin-lotto-precourse

## LotteryTicektIssueEngine
- The Engine must receive costs more than 1,000 KRW.
- The Engine must issue tickets the amount is divided by 1,000 KRW.
- The criteria and prize rules
    - 1st : Match 6 numbers / 2,000,000,000 KRW
    - 2nd : Match 5 numbers + bonus number / 30,000,000 KRW
    - 3rd : Match 5 numbers / 1,500,000 KRW
    - 4th : Match 4 numbers / 50,000 KRW
    - 5th : Match 3 numbers / 5,000 KRW
- The Engine compares prints the result(with winnings and profit fate)
- The Engine must thorws an Exception(only IllegalArgumentException or IllegalStateException) and re-prompt input from that step, if the user inputs invalid data.


## Lotto
- The Lotto must consitst of unique numbers in the range from 1 to 45.
- The Lotto must contain bonus number is a single, separate number.
