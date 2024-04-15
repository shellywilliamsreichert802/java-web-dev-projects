package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//onlyBracketsReturnsTrue: Asserts that brackets in the correct order, “[]”, return true.
    @Test
    public void bracketsWithinTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
//bracketsWithinTextReturnsTrue: Validates strings with balanced brackets within text, such as “[LaunchCode]”, “Launch[Code]”, and “[]LaunchCode”.
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
//emptyStringReturnsTrue: Ensures that an empty string returns true.
    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }
//multipleBalancedBracketsReturnsTrue: Checks multiple pairs of balanced brackets, like “[][]”, “[Launch][Code]”, and “[[LaunchCode]]”.
    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
//unbalancedBracketsReturnsFalse: Verifies that unbalanced brackets return false, e.g., “[LaunchCode”, “Launch]Code[”, “[”, and “][”.
    @Test
    public void nonBracketCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello, [LaunchCode]!"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("This is a test."));
    }
//nonBracketCharactersReturnsTrue: Confirms that strings with non-bracket characters are still considered balanced, such as “Hello, [LaunchCode]!” and “This is a test.”.
    @Test
    public void nestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch[Code]]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch[Code]]Extra]"));
    }
//nestedBalancedBracketsReturnsTrue: Tests nested balanced brackets, like “[[LaunchCode]]”, “[[Launch[Code]]]”, and “[[Launch[Code]]Extra]”.
    @Test
    public void nestedUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch[Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch[Code]Extra"));
    }
//nestedUnbalancedBracketsReturnsFalse: Checks nested unbalanced brackets, e.g., “[[LaunchCode]”, “[[Launch[Code]”, and “[[Launch[Code]Extra]”.
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}