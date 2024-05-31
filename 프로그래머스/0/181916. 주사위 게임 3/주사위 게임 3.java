import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int a, int b, int c, int d) {
        List<Integer> dice = Arrays.asList(a, b, c, d);
        Map<Integer, Long> frequencyMap = dice.stream()
                                              .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // 조건 1: 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
        if (frequencyMap.size() == 1) {
            int p = dice.get(0);
            return 1111 * p;
        }

        // 조건 2: 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
        if (frequencyMap.containsValue(3L)) {
            int p = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 3).findFirst().get().getKey();
            int q = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();
            return (int) Math.pow((10 * p + q), 2);
        }

        // 조건 3: 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
        if (frequencyMap.size() == 2 && frequencyMap.containsValue(2L)) {
            List<Integer> keys = new ArrayList<>(frequencyMap.keySet());
            int p = keys.get(0);
            int q = keys.get(1);
            return (p + q) * Math.abs(p - q);
        }

        // 조건 4: 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
        if (frequencyMap.size() == 3) {
            int q = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()).get(0);
            int r = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()).get(1);
            return q * r;
        }

        // 조건 5: 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
        if (frequencyMap.size() == 4) {
            return Collections.min(dice);
        }

        return 0; // 기본 값, 절대 도달하지 않음
    }
}