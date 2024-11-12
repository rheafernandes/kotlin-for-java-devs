package org.example

data class Evaluate(val rightPositions: Int, val wrongPositions: Int)

fun evaluateGuess(secret: String, guess: String): Evaluate {

    val rightPositions = secret.zip(guess).count { it.first == it.second }

    val commonLetters = "ABCDEF".sumOf { ch -> Math.min(secret.count { it == ch }, guess.count { it == ch }) }

    return Evaluate(rightPositions, commonLetters - rightPositions)
}

fun main() {
    val expected = Evaluate(1, 1)
    println("${evaluateGuess("AEEA", "AAEE").wrongPositions} ${evaluateGuess("AEEA", "AAEE").rightPositions}")
    println("${evaluateGuess("AFAB", "ADEF").wrongPositions} ${evaluateGuess("ABAB", "ADEK").rightPositions}")
}