package easy.validateSubsequence;

public class Solution1 {

    static int[] array = new int[]{1, 1, 1, 1, 1};
    static int[] sequence = new int[]{1, 1, 1};

    static boolean isValid(int[] array, int[] sequence) {

        int sequenceIndex = 0;
        int arrayIndex = 0;

        while (sequenceIndex < sequence.length && arrayIndex < array.length) {
            if (sequence[sequenceIndex] == array[arrayIndex]) {
                sequenceIndex++;
            }
            arrayIndex++;
        }
        return sequenceIndex == sequence.length;
    }

    public static void main(String[] args) {
        System.out.println(Solution1.isValid(array, sequence));
    }

}
