package test;


public class test implements Runnable{
	private boolean empty;
	private boolean boiled;

//	private static class ChocolateBoiler1
//	{
//		private static final test INSTANCE=new test();
//	}
	public test()
	{
		empty=true;
		boiled=false;
	}
//	public static final test getlnstance(){
//		return ChocolateBoiler1.INSTANCE;
//	}
public synchronized void doit(){
	if(empty==true){
		try{Thread.sleep(1000);}
		catch(InterruptedException ie)
		{ie.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+"����ɿ�����ţ�̣�");empty=false;
	}
	if(empty==false&&boiled==false)
	{
		try{
			Thread.sleep(100);
			}
		catch(InterruptedException ie)
		{ie.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+"��¯����У�");boiled=true;
	}
	if(empty==false&&boiled==true){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){ie.printStackTrace();}
		System.out.println(Thread.currentThread().getName()+"�ų���е��ɿ�����ţ�̣�");
		empty=true;boiled=false;
		}
	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			doit();
		
	}
	public static void main(String[] args)
	{
	test t1=new test();
	new Thread(t1,"A").start();
	new Thread(t1,"B").start();
	new Thread(t1,"C").start();
	new Thread(t1,"D").start();


	}

}