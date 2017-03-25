/**
 * 
 */
package S1_25_3.Classes.ImmutableClass;

import java.util.Date;

import javax.xml.crypto.Data;

/**
 * @author welcome
 *
 */
//make java class as final.
 
public final class ImmutableClass {
	
	//make instance variable as a final
	//Integer class is immutable 
	//therefore we we provide the getter methods 
	//it does not have a setter method
	private final Integer immutableField1;
	///here string class is also is an immutable class 
	//therefore we we provide the getter methods 
	private final String immutableFeild2;
	
	//problem comes when instance variable is mutable class
	//we have to take special care
	//lets take date class as a instance variable
	//Date is a mutable class
	private final Date mutableFeild;
	public ImmutableClass(Integer immutableField1, String immutableFeild2,Date mutableFeild) {
		super();
		this.immutableField1 = immutableField1;
		this.immutableFeild2 = immutableFeild2;
		Date date = null;
		this.mutableFeild=new Date(date.getTime());
		
    //No setter methods for instance variable.(only getter)
	}
	public long getMutableFeild() {
		return new Date().getTime();
	}
	public Integer getImmutableField1() {
		return immutableField1;
	}
	public String getImmutableFeild2() {
		return immutableFeild2;
	}

}
