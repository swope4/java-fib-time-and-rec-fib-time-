
public class fibclass {

	private int first;
	private int second;
	private int third;
	private int count;

	fibclass(int First, int Second, int Third, int Count) {
		this.first = First;
		this.second = Second;
		this.third = Third;
		this.count = Count;

	}

	public int fibseq() {
		Long start = System.nanoTime();
		while (count < 20) {
			third = first + second;
			first = second;
			second = third;
			count = count + 1;
			System.out.print(second+ " ");

		}
		Long stop = System.nanoTime();
		System.out.print("nano seconds is ");
		System.out.println(stop - start);
		return second;

	}

	public int recfib(int y) {

		if (y == 0) {
			return 0;
		}
		if (y == 1 || y == 2) {
			return 1;
		}
		return recfib(y - 2) + recfib(y - 1);
	}
}
