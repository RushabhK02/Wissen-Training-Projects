package concurrency;

class PrintNum {
	private static SyncCounter obj=new SyncCounter();
	private int numCount;
	
	public PrintNum(int numCount) {
	
		this.numCount=numCount;
	}
	
	public int printOdd() {
			System.out.println(numCount);
			numCount+=2;

		return numCount;
	}
	
	public int printEven() {

			System.out.println(numCount);
			numCount+=2;

		return numCount;
	}
	
}
