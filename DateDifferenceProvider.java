package DataDifferenceProvider;

public class DateDifferenceProvider {
	static final int JAN=31;
	static final int FEB=31;
	static final int MAR=31;
	static final int APR=31;
	static final int MAY=31;
	static final int JUN=31;
	static final int JUL=31;
	static final int AUG=31;
	static final int SEPT=31;
	static final int OCT=31;
	static final int NOV=31;
	static final int DEC=31;
int [] MONTHS={JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC};
  public int getDateDifferenceProvider(MyDate startdate,MyDate enddate)
  {
	if(sameDate(startdate,enddate) && sameMonth(startdate,enddate) && sameYear(startdate,enddate))
	{	return 0; }
	else if(sameMonth(startdate,enddate) && sameYear(startdate,enddate))
	{
	return enddate.getdD()-startdate.getdD();}
	else if(sameYear(startdate,enddate))
	{
		return remainingDaysofMonth(startdate) +daysinIntervingMonth(startdate,enddate) + enddate.getdD();
	}
	else
	{
		return remainingDaysofMonth(startdate) +daysinIntervingYear(startdate,enddate)+daysinIntervingMonth(startdate,enddate)+leadingYear();
	}
  }
 

private static boolean sameDate(MyDate startdate,MyDate enddate){
	  return enddate.getdD()==startdate.getdD();
  }
  private static boolean sameMonth(MyDate startdate,MyDate enddate)
  {
	  return enddate.getmm()==startdate.getmm();
  }
  private static boolean sameYear(MyDate startdate,MyDate enddate)
  {
	  return enddate.getyyyy()==startdate.getyyyy();
  }
  private int remainingDaysofMonth(MyDate date)
  {
	  return MONTHS[date.getmm()-1]-date.getdD();
  }
private int daysinIntervingMonth(MyDate startdate,MyDate enddate)
{
	int total=0;
	for(int i=startdate.getmm()+1;i<enddate.getmm();i++)
	{
		total+=MONTHS[i-1];
	}
	return total;
}
private int daysinIntervingYear(MyDate startdate, MyDate enddate) {
	
	
}

}
