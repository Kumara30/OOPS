package Collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

//enum day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};

public class enum1 
{
	enum day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
	enum month{JUNUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER};

	public static void main(String[] args) {
		//Set<day> days = EnumSet.of(day.MONDAY,day.TUESDAY);
		Set<day> alldays = EnumSet.allOf(day.class);
		//Set<month> months = EnumSet.of(month.APRIL,month.AUGUST,month.DECEMBER,month.JULY);
		Set<month> allmonths = EnumSet.allOf(month.class);
		
		Iterator<month> day1 = allmonths.iterator();
		
		Iterator<day> day2 = alldays.iterator();
		
		
		while(day1.hasNext())
		{
			System.out.println(day1.next());
		}
	}

}
