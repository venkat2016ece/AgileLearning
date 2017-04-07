package S2_31_3.Anotations.GeneralPurposeAnotations.Override;

public class DB_Driver {
	public void getDriver(){
		System.out.println("Type-1 driver");
	}

}
class New_DB_Driver extends DB_Driver{
	@Override
	public void getDriver()
	{
		System.out.println("Type-4 driver");
	}
}
