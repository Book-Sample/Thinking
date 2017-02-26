package four;

public class Chair {
	static boolean gcrun=false;//垃圾收集器是否在运行
	static boolean f=false;//是否收集完成
	static int created=0;//创建的对象数
	static int finalized=0;//销毁的对象数
	int i;
	Chair(){
		i=++created;
		if(created==47)
			System.out.println("Created 47");
	}
	
	@Override
	protected void finalize(){
		if(!gcrun){
			gcrun=true;
			System.out.println("begin to finalize after "+created+" Chairs have been created");
			int i=0;
		}
	}
}
