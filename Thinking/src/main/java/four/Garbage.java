package four;

public class Garbage {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Garbage before or java garbage after");
			return;
		}
		//循环创造对象
		while (!Chair.f) {
			new Chair();
			new String("To take up space");
		}
		System.out.println("After all chair have been created: " + "total created=" + Chair.created
				+ ", total finalized=" + Chair.finalized);
		if (args[0].equals("before")) {
			
			System.out.println("gc():");
			System.gc();
			System.out.println("runFinalization():");
			System.runFinalization();
			
		}
		System.out.println("bye!");
		if(args[0].equals("after")){
			System.runFinalizersOnExit(true);
		}
	}

}
