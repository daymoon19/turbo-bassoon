import java.util.*

fun main() {
    println("Welcome to the Casino!")
    println("You have 1000 coins. You can bet as many as you want. Type 'exit' to leave the Casino.")

    var coins = 1000
    val scanner = Scanner(System.`in`)

    while (coins > 0) {
        print("Enter your bet: ")
        val input = scanner.nextLine()
        
        if (input.lowercase() == "exit") {
            println("You are leaving the Casino with $coins coins. Goodbye!")
            break
        }
        
        val bet = input.toInt()
        if (bet <= coins && bet > 0) {
            val random = Random().nextInt(2)
            if (random == 0) {
                coins += bet
                println("You won! Now you have $coins coins.")
            } else {
                coins -= bet
                println("You lost. Now you have $coins coins.")
            }
        } else {
            println("Invalid bet. Please bet a valid amount.")
        }
    }
}