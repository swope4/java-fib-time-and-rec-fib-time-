
public class fibbonachiseq {

	public static void main(String[] args) {

		System.out.println("Iterive\n");
		
		fibclass fib = new fibclass(0,1,0,0);
			fib.fibseq();
			Long start = System.nanoTime();

			System.out.println("\nrecursive\n");
			for(int i = 0; i < 20; i++){
				System.out.print(fib.recfib(i) +" ");}
				Long stop = System.nanoTime();
				System.out.print( "nano seconds is ");
				System.out.print(stop - start);

			//fib.recfib();
		
//		int x=0,y=0,z=0, q=1;
//		int a=0,b=1,c,d=0;
//		for (int i = 0; i < 22; i++) {
//
//			c = a + b;
//		       a = b;
//		       b = c;
//		       i = i +1;
			//d = z+c;
			
		
			
			
//			c= a/b;
//			d= d-c;
			
			//System.out.println( b+" \t \t" );
			
	
		
	

	}
}


