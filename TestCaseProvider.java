package DataDifferenceProvider;
import org.junit.*;
public class TestCaseProvider {

	public static void main(String[] args) {
		DateDifferenceProvider providers=new DateDifferenceProvider();
MyTestRecords[] mytestrecords=new MyTestRecords[13];
mytestrecords[0]= new MyTestRecords(new MyDate(20,11,2018),new MyDate(20,11,2018),0);
mytestrecords[1]=new MyTestRecords(new MyDate(20,11,2018),new MyDate(27,11,2018),7);
mytestrecords[2]=new MyTestRecords(new MyDate(20,11,2018),new MyDate(20,12,2018),30);
mytestrecords[3]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,6,2011),73);
mytestrecords[4]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2011),256);
mytestrecords[5]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2012),621);
mytestrecords[6]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2013),987);
mytestrecords[7]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2113),37511);
mytestrecords[8]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2413),147084);
mytestrecords[9]=new MyTestRecords(new MyDate(6,1,2011),new MyDate(6,3,2011),59);
mytestrecords[10]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2813),293181);
mytestrecords[11]=new MyTestRecords(new MyDate(6,1,2012),new MyDate(6,3,2012),60);
mytestrecords[12]=new MyTestRecords(new MyDate(6,2,2012),new MyDate(6,3,2012),29);

for(int index=0;index<mytestrecords.length;index++)
{
	int calculatediff=providers.getDateDifferenceProvider(mytestrecords[index].getstartdate(), mytestrecords[index].getenddate());
	if(calculatediff==mytestrecords[index].getactualdifference())
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case FAILED");
	System.out.println(calculatediff);
	}
}

	

}
}