/**
 * 
 */
package S1_24_3.Methods.MethodOverloading;

/**
 * @author welcome
 *
 */
public class MethodOverloading {

	/**
	 * @param args
	 */
	
	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp( int num)  
    {
         System.out.println(num);
    }
    public void disp(float f)
    {
         System.out.println(f);
    }
    public void disp(double d)
    {
         System.out.println(d);
    }
    public void disp(boolean b)
    {
         System.out.println(b);
    }
    public void disp(long l)
    {
         System.out.println(l);
    }
    public void disp(String s)
    {
         System.out.println(s);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    public void disp(char c, int num, double d,String s)  
    {
         System.out.println(c + " "+num+""+d+""+s);
    }
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.disp('a');
		obj.disp(4);
		obj.disp(10.0f);
		obj.disp(10.0);
		obj.disp(true);
		obj.disp(10L);
		obj.disp("venkat");
		obj.disp('a', 456);
		obj.disp('s', 4, 100.0,"VENKAT");
 

	}

}
