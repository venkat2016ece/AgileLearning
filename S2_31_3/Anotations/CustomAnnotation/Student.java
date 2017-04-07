package S2_31_3.Anotations.CustomAnnotation;
@Course(cid="c-333",cname="JAVA",ccos=4000)
public class Student {
	String sid;
	String sname;
	String saddr;
	public Student(String sid,String sname,String saddr){
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
	}
	//@Course(cid="c-333",cname="JAVA",ccos=4000)
	public void getStudentDetails(){
		System.out.println("Student Details");
		System.out.println("----------------");
		System.out.println("Student Id"+sid);
		System.out.println("StudentName"+sname);
		System.out.println("StudentAddr"+saddr);
	}
}
