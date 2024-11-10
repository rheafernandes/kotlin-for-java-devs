package org.example

/*
    Given a string s, reverse only all the vowels in the string and return it.

    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



    Example 1:

    Input: s = "IceCreAm"

    Output: "AceCreIm"

    Explanation:

    The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

    Example 2:

    Input: s = "leetcode"

    Output: "leotcede"



    Constraints:

    1 <= s.length <= 3 * 105
    s consist of printable ASCII characters.
 */

fun reverseStringVowels(str: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    var i = 0
    var j = str.length-1
    val strArray = str.toCharArray();
    while (i < j) {
        if (strArray[i] !in vowels) {
            i++
        } else if(strArray[j] !in vowels) {
            j--;
        } else {
            val temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++
            j--
        }
    }
    return strArray.joinToString("");
}