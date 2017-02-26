package four;

public class Mugs {
	static Mug c0 = new Mug(0);
	static Mug c3;

	static {
		c3 = new Mug(3);
	}

	Mug c1;
	Mug c2;
	Mug c4 = new Mug(4);
	{
		c1 = new Mug(1);
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialized");
	}

	Mugs() {
		System.out.println("Mugs()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Mugs x = new Mugs();
	}

}
