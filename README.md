# Simple Bracket Balancing program
A Java based bracket balancing program that returns whether a string passed in is balanced or not.

*File*
      
      BracketUtils.java
      
*Usage*
        
        String input = null;
        assertTrue(bracketUtils.isBalanced(input));

        input = "";
        assertTrue(bracketUtils.isBalanced(input));

        input = "hello world";
        assertTrue(bracketUtils.isBalanced(input));

        input = "{[hello world]}";
        assertTrue(bracketUtils.isBalanced(input));

        input = "<[([{}])]>";
        assertTrue(bracketUtils.isBalanced(input));

        input = "[([{])]";
        assertFalse(bracketUtils.isBalanced(input));

        input = "[([{}])";
        assertFalse(bracketUtils.isBalanced(input));

        input = "[{}])]";
        assertFalse(bracketUtils.isBalanced(input));

        input = ">.<";
        assertFalse(bracketUtils.isBalanced(input));
