package sets;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x=1, y=1, z=0;
		//if(!(x++>1 & y++>1)){
		   //z = x + y;
		//}
		//System.out.println(z);
		System.out.println("======================================");
		int a = 14;
		int b = 5;
		System.out.println(a-=b);
		
		System.out.println("======================================");
		 int no1 = 8; 
	        int no2 = 4; 
	        int res = no1 | no2;
	        System.out.println(res);
	        System.out.println("======================================");
	       /* int x = 10;
	        int y = 1 + (x%2) / 2;
	        x = y + 1;
	        System.out.println(x + y);
	        */
	        /*int x=0, y=0;
	        if(++x>4 && ++y > 2)
	           x++;
	        System.out.println(x);*/
	        System.out.println("======================================");
	        int m=100;
	        while(true){
	           if(m<10)
	              break;
	           m = m - 10;
	        }
	        System.out.print("m is "+m);
	        
	        int x = 6;

	        if(++x>5 || --x < 3){

	           System.out.println(x);

	        }else{

	           System.out.println("x");

	        }
	}

}
