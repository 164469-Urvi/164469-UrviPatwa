package DataDifferenceProvider;

public class DateDifferenceProvider {
	static final int JAN = 31;
	static final int FEB = 28;
	static final int MAR = 31;
	static final int APR = 30;
	static final int MAY = 31;
	static final int JUN = 30;
	static final int JUL = 31;
	static final int AUG = 31;
	static final int SEPT = 30;
	static final int OCT = 31;
	static final int NOV = 30;
	static final int DEC = 31;
	int[] MONTHS = { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NOV,
			DEC };

	public int getDateDifferenceProvider(MyDate startdate, MyDate enddate) {
		if (sameDate(startdate, enddate) && sameMonth(startdate, enddate)
				&& sameYear(startdate, enddate)) {
			return 0;
		} else if (sameMonth(startdate, enddate)
				&& sameYear(startdate, enddate)) {
			return enddate.getdD() - startdate.getdD();
		} else if (sameYear(startdate, enddate)) {
			return remainingDaysofMonth(startdate)
					+ daysinIntervingMonth(startdate, enddate)
					+ enddate.getdD();
		} else {
			return daysinRemainingYear(startdate, enddate)
					+ daysinIntervingYear(startdate, enddate)
					+ remainingDaysofMonth(startdate)
					+ leadingyear(startdate, enddate);
		}
	}

	private int daysinIntervingYear(MyDate startdate, MyDate enddate) {
		int index, remainingdays = 0;
		
		for (index = startdate.getyyyy() + 1; index < enddate.getyyyy(); index++) {
			if(index%4==0 && index%100!=0){
			remainingdays = remainingdays + 366;}
			else if(index%4==0 && index%400==0)
			{
				remainingdays=remainingdays+366;
			}
			else
			{
				remainingdays=remainingdays+365;
			}
		}
				
		return remainingdays;
	}

	private static boolean sameDate(MyDate startdate, MyDate enddate) {
		return enddate.getdD() == startdate.getdD();
	}

	private static boolean sameMonth(MyDate startdate, MyDate enddate) {
		return enddate.getmm() == startdate.getmm();
	}

	private static boolean sameYear(MyDate startdate, MyDate enddate) {
		return enddate.getyyyy() == startdate.getyyyy();
	}

	private int remainingDaysofMonth(MyDate startdate) {
		int date = MONTHS[startdate.getmm() - 1] - startdate.getdD();

		return date;
	}

	private int daysinIntervingMonth(MyDate startdate, MyDate enddate) {
		int total = 0;
	
		for (int i = startdate.getmm() +1; i<enddate.getmm(); i++) {
					total+=MONTHS[i-1];
			}
		
		return total;
	}

	private int daysinRemainingYear(MyDate startdate, MyDate enddate) {
		int remainingdays = 0;
		for (int index = startdate.getmm() + 1; index <= 12; index++) {
			remainingdays += MONTHS[index - 1];
		}
		return remainingdays;
	}

	private int leadingyear(MyDate startdate, MyDate enddate) {
		int remainingdays = 0;
		for (int index = 1; index < enddate.getmm(); index++) {
			
				remainingdays += MONTHS[index - 1] ;}
				remainingdays += enddate.getdD();
			
		
	
		return remainingdays;

}
}