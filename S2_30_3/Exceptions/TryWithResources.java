package S2_30_3.Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResources  {

	public static void main(String[] args)throws Exception {
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
	{
		String str="";
		str=br.readLine();
		
	}
	}
}

