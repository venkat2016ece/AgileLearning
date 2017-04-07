package S2_1_4.Generics;

class Gen<T> {
	T ob;
	Gen(T ob){
		this.ob=ob;
	}
	public void show(){
		System.out.println("the type of ob: "+ob.getClass().getName());
	}
	public T getob(){
		return ob;
	}
}
