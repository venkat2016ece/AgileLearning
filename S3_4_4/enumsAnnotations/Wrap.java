package S3_4_4.enumsAnnotations;

public class Wrap {
	static int m(Integer v){
        return v;
    }

    public static void main(String args[])
    {
        Integer iOb = m(100);

        System.out.println(iOb);
    }
}

