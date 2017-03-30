package S_29_3.NormalInnerClass.NestingInnerClass;

import S_29_3.NormalInnerClass.NestingInnerClass.A.B;

class Test{
	public static void main(String[] args)
	{
		A a=new A(){
			A.B b=a.new B();
			A.B.C c=b.new C();
			c.m1();
	};
}
}