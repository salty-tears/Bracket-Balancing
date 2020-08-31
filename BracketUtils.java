package utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Lazy-loaded Singleton class for utils for Bracket Balancing
 */
public class BracketUtils {
    private final Map<Character, Character> bracketMap;

    private BracketUtils() {
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('<', '>');
        map.put('(', ')');
        map.put('[', ']');
        bracketMap = Collections.unmodifiableMap(map);
    }

    private static class BracketUtilsHolder {
        private static final BracketUtils INSTANCE = new BracketUtils();
    }

    public static BracketUtils getInstance() {
        return BracketUtilsHolder.INSTANCE;
    }

    public boolean isBalanced(String input) {
        if (input == null || input.trim().length() == 0)
            return true;

        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if (bracketMap.containsKey(c))
                stack.push(c);
            else if (bracketMap.containsValue(c))
                if (c.equals(bracketMap.get(stack.peek())))
                    stack.pop();
                else
                    return false;
        }
        return stack.isEmpty();
    }
}
