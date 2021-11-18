import java.util.*;

public class validate_subsequence {
    
    public static void main(String[] args){
        List<Integer> Array = new ArrayList<Integer>();
        Array.addAll(Arrays.asList(1, 22, 25, 6, -1, 8, 10));
        List<Integer> Sequence = new ArrayList<Integer>();
        Sequence.addAll(Arrays.asList(1, 6, -1, 10));
        boolean Result = isValidSubsequence(Array, Sequence);
        System.out.println(Boolean.toString(Result));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
            int arrayIndex = 0;
            int sequenceIndex = 0;
            while (arrayIndex < array.size() && sequenceIndex < sequence.size()){
                if(array.get(arrayIndex).equals(sequence.get(sequenceIndex))){
                    sequenceIndex++;
                }
                arrayIndex++;
            }
        return sequenceIndex == sequence.size();
    }


}
