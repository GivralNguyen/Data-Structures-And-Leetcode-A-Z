import java.util.*;

class Program{
    public static void main(String[] args) {
        int[] Array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int [] Result = twoNumberSum(Array,targetSum);
        System.out.println(Arrays.toString(Result)); 
    }
	public static int[] twoNumberSum(int[] array, int targetSum){
		Set<Integer> hashTable = new HashSet<>();
		for(int num:array){
			int remainder = targetSum - num;
			if (hashTable.contains(remainder)){
				return new int[]{remainder,num};
			}
			else{
				hashTable.add(num);
			}
		}
		return new int[0];
	}
}
