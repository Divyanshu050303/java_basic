import java.util.*;

class setdemo
{
	void func()
	{
		Set st=new HashSet();

		st.add("Coke");
		st.add("Pepsi");
		st.add(15);
		st.add(5.6);
		st.add("Coke");
	
		System.out.println(st);
		System.out.println("No of items: "+st.size());
	}
	public static void main(String args[])
	{
		setdemo obj=new setdemo();
		obj.func();
	}
}