import java.util.*;
//import java.util.Array;
public class RunnerUp{
	private static ArrayList<Integer> TempList = new ArrayList<Integer>();
	private static int[] Scores = new int[]{2,3,6,6,5};

	public static void main(String args[]){
		System.out.print("The original scores are: ");
		for(int i=0;i<Scores.length;i++){
			System.out.print(Scores[i]+" ");
		}
		System.out.println();
		Arrays.sort(Scores);
		System.out.print("The sorted scores are: ");
		for(int i=0;i<Scores.length;i++){
			System.out.print(Scores[i]+" ");
		}
		System.out.println();
		System.out.print("The values in 'TempList' are: ");
		for(int i=0;i<Scores.length;i++){
			if(Scores[i] < Scores[Scores.length-1]){
				System.out.print(Scores[i]+" ");
				TempList.add(Scores[i]);
			}
		}
		System.out.println();
		System.out.println("The second highest score is: "+TempList.get(TempList.size()-1));
	}
}
