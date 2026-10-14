import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>(); 
        for (int astro : asteroids) {
            // Agar stack khaali hai ya koi collision nahi ho raha:
            // (Collision tabhi hoga jab st.peek() > 0 aur astro < 0 ho)
            if (st.isEmpty() || astro > 0 || st.peek() < 0) {
                st.push(astro);
                continue;
            }

            // Ab aayi pop ki baari (st.peek() > 0 && astro < 0)
            int absAstro = Math.abs(astro);

            // Pehle saare chhote positive asteroids ko destroy karo
            while (!st.isEmpty() && st.peek() > 0 && st.peek() < absAstro) {
                st.pop();
            }

            // Agar barabar size ka positive asteroid mile, toh dono destroy honge
            if (!st.isEmpty() && st.peek() == absAstro) {
                st.pop();
            } 
            // Agar stack khaali ho gaya ya top pe negative asteroid hai, toh push karna hai
            else if (st.isEmpty() || st.peek() < 0) {
                st.push(astro);
            }
        }

        // insert stact into array in reverse order
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}