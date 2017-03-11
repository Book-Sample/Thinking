package five;
import four.*;//仅倒入four包访问不了Child
import four.one.*;
public class ChildPackage {

	public static void main(String[] args) {
		Child c=new Child();
		Whatever what=new Whatever();
	}

}
