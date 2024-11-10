import org.example.reverseStringVowels
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseStringVowelsTest {

    @Test
    fun testSimpleCase() {
        assertEquals("holle", reverseStringVowels("hello"))
    }

    @Test
    fun testNoVowels() {
        assertEquals("bcdfg", reverseStringVowels("bcdfg"))
    }

    @Test
    fun testOnlyVowels() {
        assertEquals("uoiea", reverseStringVowels("aeiou"))
    }

    @Test
    fun testMixedCase() {
        assertEquals("HoLLe", reverseStringVowels("HeLLo"))
    }

    @Test
    fun testMixedVowelsAndConsonants() {
        assertEquals("LeotCede", reverseStringVowels("LeetCode"))
    }

    @Test
    fun testVowelsAtBothEnds() {
        assertEquals("eppla", reverseStringVowels("apple"))
    }

    @Test
    fun testSameVowelsAtBothEnds() {
        assertEquals("aabbcc", reverseStringVowels("aabbcc"))
    }

    @Test
    fun testEmptyString() {
        assertEquals("", reverseStringVowels(""))
    }

    @Test
    fun testSingleVowel() {
        assertEquals("a", reverseStringVowels("a"))
    }

    @Test
    fun testSingleConsonant() {
        assertEquals("z", reverseStringVowels("z"))
    }

    @Test
    fun testSpecialCharacters() {
        assertEquals("h3ll0 w0rld!", reverseStringVowels("h3ll0 w0rld!"))
    }

    @Test
    fun testPalindromeWithVowels() {
        assertEquals("madam", reverseStringVowels("madam"))
    }
}