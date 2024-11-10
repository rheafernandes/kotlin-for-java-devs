import org.example.removeStarsUsingSB
import org.example.removeStarsUsingStack
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveStars {
    @Test
    fun testSimple1() {
        assertEquals("lecoe", removeStarsUsingSB("leet**cod*e"))
        assertEquals("lecoe", removeStarsUsingStack("leet**cod*e"))
    }

    @Test
    fun testSimple2() {
        assertEquals("", removeStarsUsingSB("erase*****"))
        assertEquals("", removeStarsUsingStack("erase*****"))
    }

    @Test
    fun testSimpleCase() {
        assertEquals("acef", removeStarsUsingStack("ab*cd*ef")) // Expected: "acdf" (removes "b" and "e")
        assertEquals("acef", removeStarsUsingSB("ab*cd*ef")) // Expected: "acdf" (removes "b" and "e")
    }

    @Test
    fun testOnlyStars() {
        assertEquals("", removeStarsUsingStack("a*b*c*")) // Expected: "" (all characters removed)
        assertEquals("", removeStarsUsingSB("a*b*c*")) // Expected: "" (all characters removed)
    }

    @Test
    fun testNoStars() {
        assertEquals("abcdef", removeStarsUsingStack("abcdef")) // Expected: "abcdef" (no stars to remove)
        assertEquals("abcdef", removeStarsUsingSB("abcdef")) // Expected: "abcdef" (no stars to remove)
    }

    @Test
    fun testAdjacentStars() {
        assertEquals("ef", removeStarsUsingStack("ab**cd**ef")) // Expected: "abef" (removes characters as per stars)
        assertEquals("ef", removeStarsUsingSB("ab**cd**ef")) // Expected: "abef" (removes characters as per stars)
    }

    @Test
    fun testStarsAtBeginning() {
        assertEquals("abdef", removeStarsUsingStack("z*abc*def")) // Expected: "def" (removes "a", "b", and "c")
        assertEquals("abdef", removeStarsUsingSB("z*abc*def")) // Expected: "def" (removes "a", "b", and "c")
    }

    @Test
    fun testStarsAtEnd() {
        assertEquals("abd", removeStarsUsingStack("abc*de*")) // Expected: "abc" (removes "d" and "e")
        assertEquals("abd", removeStarsUsingSB("abc*de*")) // Expected: "abc" (removes "d" and "e")
    }

    @Test
    fun testEmptyString() {
        assertEquals("", removeStarsUsingStack("")) // Expected: "" (empty input should return empty)
        assertEquals("", removeStarsUsingSB("")) // Expected: "" (empty input should return empty)
    }

}