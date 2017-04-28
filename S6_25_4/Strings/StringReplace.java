package S6_25_4.Strings;

public class StringReplace {
	public static void main(String[] args) {
		
	
	String s="This is a test.This is also a test";
	
	String search="is";
	String sub="Was,";
	String result=" ";
	int i;
	
	/*do{
		System.out.println(s);
		i=s.indexOf(search);
		if(i!=-1){
			result=s.substring(0, i);
			result=result+sub;
			result=result+s.substring(i+search.length());
			s=result;
		}
	}while(i!=-1);*/
	
	result =s.replace(search,sub);
	 System.out.println(result.trim().toUpperCase());

}
}