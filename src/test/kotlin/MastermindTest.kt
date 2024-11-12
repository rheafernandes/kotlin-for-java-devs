import org.example.evaluateGuess
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MastermindTest {

    // Test when both the secret and guess are identical.
    @Test
    fun testIdenticalStrings() {
        val secret = "ABCD"
        val guess = "ABCD"
        val result = evaluateGuess(secret, guess)

        assertEquals(4, result.rightPositions, "Expected 4 correct positions")
        assertEquals(0, result.wrongPositions, "Expected 0 wrong positions")
    }

    // Test when no characters are common between secret and guess.
    @Test
    fun testNoCommonCharacters() {
        val secret = "ABCD"
        val guess = "WXYZ"
        val result = evaluateGuess(secret, guess)

        assertEquals(0, result.rightPositions, "Expected 0 correct positions")
        assertEquals(0, result.wrongPositions, "Expected 0 wrong positions")
    }

    // Test when some characters are in the correct position.
    @Test
    fun testSomeCorrectPositions() {
        val secret = "ABCD"
        val guess = "ABXY"
        val result = evaluateGuess(secret, guess)

        assertEquals(2, result.rightPositions, "Expected 2 correct positions")
        assertEquals(0, result.wrongPositions, "Expected 0 wrong positions")
    }

    // Test when there are common letters but not in the correct positions.
    @Test
    fun testCommonCharactersDifferentPositions() {
        val secret = "ABCD"
        val guess = "ACBD"
        val result = evaluateGuess(secret, guess)

        assertEquals(2, result.rightPositions, "Expected 2 correct positions")
        assertEquals(2, result.wrongPositions, "Expected 2 wrong positions")
    }

    // Test with repeated characters in both secret and guess.
    @Test
    fun testRepeatedCharacters() {
        val secret = "AABC"
        val guess = "ABAC"
        val result = evaluateGuess(secret, guess)

        assertEquals(2, result.rightPositions, "Expected 2 correct positions")
        assertEquals(2, result.wrongPositions, "Expected 2 wrong positions")
    }
}