class ABC implements Runnable  
{  
public void run()  
{  
try  
{  
Thread.sleep(100);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());  
try  
{  
Thread.sleep(200);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}     
}  
}  
public class ThreadState implements Runnable  
{  
public static Thread t1;  
public static ThreadState obj;  
public static void main(String argvs[])  
{  
obj = new ThreadState();  
t1 = new Thread(obj);    
System.out.println("The state of thread t1 after spawning it - " + t1.getState());     
t1.start();  
System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());  
}    
public void run()  
{  
ABC myObj = new ABC();  
Thread t2 = new Thread(myObj);  
System.out.println("The state of thread t2 after spawning it - "+ t2.getState());  
t2.start();   
System.out.println("the state of thread t2 after calling the method start() on it - " + t2.getState());    
try  
{  
Thread.sleep(200);  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
  
System.out.println("The state of thread t2 after invoking the method sleep() on it - "+ t2.getState() );    
try  
{  
t2.join();  
}  
catch (InterruptedException ie)  
{  
ie.printStackTrace();  
}  
System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());  
}  
  
}  
