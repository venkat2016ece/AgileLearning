package com.JunitExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransformationService {
	String TransformData(final Object[] data,final String pattren){
		Date date=(Date)data[0];
		int percentage=(Integer)data[1];
		StringBuilder resultLine=new  StringBuilder("['");
		resultLine.append(new SimpleDateFormat(pattren).format(date));
		resultLine.append("',");
		resultLine.append(percentage);
		resultLine.append("%]");
		return resultLine.toString();
	}

}
