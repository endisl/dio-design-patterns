import java.util.*;

public class DioGFT4TabuleiroRefact {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int operation;
        int rowOrColumn;
        int value;
        Map<Integer, Integer> frequencies;
        Collection<Integer> candidates;

        int N = input.nextInt();
        int Q = input.nextInt();
        var M = new int[N][N];

        for (int i = 0; i < Q; i++) {
            operation = input.nextInt();
            if (operation == 1 || operation == 2) {
                rowOrColumn = input.nextInt() -1;
                value = input.nextInt();
                if (operation == 1) {
                    for (int j = 0; j < N; j++)
                        M[rowOrColumn][j] = value;
                }
                else {
                    for (int j = 0; j < N; j++)
                        M[j][rowOrColumn] = value;
                }
            }
            else if(operation == 3 || operation == 4) {
                rowOrColumn = input.nextInt() - 1;
                if (operation == 3) {
                    frequencies = getFrequencies(operation, N, M, rowOrColumn);
                    candidates = getCandidates(frequencies);
                    var result = Collections.max(candidates);
                    System.out.println(result);
                }
                else {
                    frequencies = getFrequencies(operation, N, M, rowOrColumn);
                    candidates = getCandidates(frequencies);
                    var result = Collections.max(candidates);
                    System.out.println(result);
                }
            }
        }
    }

    private static Map<Integer, Integer> getFrequencies(int operation, int N, int[][] M, int rowOrColumn) {
        int k, v;
        Map<Integer, Integer> map = new HashMap<>();
        if (operation == 3) {
            for (int j = 0; j < N; j++) {
                k = M[rowOrColumn][j];
                v = map.getOrDefault(k, 0);
                map.put(k, v+1);
            }
        } else {
            for (int j = 0; j < N; j++) {
                k = M[j][rowOrColumn];
                v = map.getOrDefault(k, 0);
                map.put(k, v+1);
            }
        }
        return map;
    }

    private static Collection<Integer> getCandidates(Map<Integer, Integer> map) {
        Collection<Integer> frequencies = map.values();
        var maxFrequency = Collections.max(frequencies);
        Collection<Integer> candidates = new ArrayList<>();
        for (var key : map.keySet()) {
            if (map.get(key) == maxFrequency)
                candidates.add(key);
        }
        return candidates;
    }
}
