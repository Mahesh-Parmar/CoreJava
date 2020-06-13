package arrays;

public class Array_2D {

	public static void main(String[] args) {
		
		String [][] arr = 
			{
				{"A","B","C"},
				{"E","F"},
				{"SDG","FG","FG","JH"}
		};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println(arr[0][0]);
		
		arr[2][1] = "aaa";
		System.out.println(arr[2][1]);
		
		for (String[] x : arr) {
			for (String y : x) {
				System.out.println(y);
			}
			System.out.println("============================");
		}
		

	}

}
