import java.util.Scanner;
import java.util.InputMismatchException;

class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	public MyException(String a)
	{
		super(a);
	}
	public MyException(){};
	
}

public class Arrays {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void CreateArrays(float []x, float []y, int n, int m){
		//filling arrays
		try{
	        System.out.println("Fill the first array:");
	        for(int i = 0; i < n; i++){
	        	float tmp = in.nextFloat();
	        	if(tmp>Float.MAX_VALUE)
	        		throw new MyException("Array element can't be greater than int");
	        	x[i]=tmp;
	        }
	        
	        System.out.println("Fill the second array:");
	        for(int i = 0; i < m; i++){
	        	float tmp = in.nextFloat();
	        	if(tmp>Float.MAX_VALUE)
	        		throw new MyException("Array element can't be greater than int");
	        	y[i]=in.nextFloat();
	        }
		}
		catch(InputMismatchException e){
			System.out.print( "Please, input correct format!\n"+e+"\n");
		}
		catch(MyException ex){
			System.out.print( "\n"+ex+"\n");
		}
	}
	
	public static void SortArrays(float []x, float []y, int n, int m){
		//sorting the first array
        for (int i = n - 1; i >= 0; i--)
        {
          for (int j = 0; j < i; j++)
          {
            if (x[j] >= x[j+1])
            {
              float tmp = x[j];
              x[j] = x[j + 1];
              x[j + 1] = tmp;
            }
          }
        }
        
        //sorting the second array
        for (int i = m - 1; i >= 0; i--)
        {
          for (int j = 0; j < i; j++)
          {
            if (y[j] >= y[j+1])
            {
              float tmp = y[j];
              y[j] = y[j + 1];
              y[j + 1] = tmp;
            }
          }
        }
	}
	
	public static void OutputArrays(float []x, float []y, float []res, int n, int m, int l){
		//outputing
        System.out.println("First array:");
        for(int i = 0; i < n; i++){
        	System.out.println(x[i]);
        }
        
        System.out.println("Second array:");
        for(int i = 0; i < m; i++){
        	System.out.println(y[i]);
        }
        
        System.out.println("Resulting array:");
        for(int i = 0; i < l; i++){
        	System.out.println(res[i]);
        }
	}
	
	public static void main(String[] args) {
		System.out.println("Laba 3 java. Vladyslav Koshyl 631p.");
		int cont = 1;
		while(cont == 1){
			try{
				int n, m = 0;
				System.out.println("Input the first array size:");
		        n = in.nextInt();
				System.out.println("Input the second array size:");
		        m = in.nextInt();
		        
		        if(n<=0 || m<=0)
		        	throw new MyException("Array size can't be less than 0!");
		        if(n>Integer.MAX_VALUE || m>Integer.MAX_VALUE)
					throw new MyException("Array size can't be greater than int");
		        
		        float []x = new float[n];
		        float []y = new float[m];
		        
		        CreateArrays(x, y, n, m);
		        
		        SortArrays(x, y, n, m);
		        
		        //create new array
		        int l = n+m;
		        float []res = new float[l];
		        
		        for(int i = 0; i < n; i++){
		        	res[i]=x[i];
		        }
		        for(int i = n, j = 0; i < l; i++, j++){
		        	res[i]=y[j];
		        }
		        
		        for (int i = l - 1; i >= 0; i--)
		        {
		          for (int j = 0; j < i; j++)
		          {
		            if (res[j] >= res[j+1])
		            {
		              float tmp = res[j];
		              res[j] = res[j + 1];
		              res[j + 1] = tmp;
		            }
		          }
		        }
		        
		        OutputArrays(x, y, res, n, m, l);
			}
			catch(InputMismatchException e){
				System.out.print( "Fatal exception! Incorrect format!\n");
				cont = 0;
			}
			catch(MyException ex){
				System.out.print( "\n"+ex+"\n");
				System.out.print( "Not correct at this time :C Try once more?\n1-yes, 2-no\n");
				cont = in.nextInt();
			}
		}
	}

}
