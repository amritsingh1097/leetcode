class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        
        int i = 0;
        while (i < asteroids.length && asteroids[i] < 0) s.push(asteroids[i++]);
        if (i == asteroids.length) return asteroids;

        while (i < asteroids.length) {
            if (asteroids[i] > 0) s.push(asteroids[i]);
            else {
                int asteroid = asteroids[i];
                while (!s.isEmpty() && s.peek() > 0 && asteroid < 0){
                    int popped = s.pop();
                    if (popped > -asteroid) asteroid = popped;
                    else if (popped == -asteroid) asteroid = 0;
                }

                if (asteroid != 0) s.push(asteroid);
            }

            ++i;
        }

        int[] remaining = new int[s.size()];
        i = s.size();
        while (!s.isEmpty()) remaining[--i] = s.pop();

        return remaining;
    }
}
