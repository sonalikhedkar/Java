package javacodingQuestions;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		//System.out.println(Integer.parseInt("101", 8));
		String age="P21Y10M1D";
		Period p = Period.parse(age);//converting string into period
	       System.out.println("the age is: ");
	       System.out.println(p.getYears() + " Years\n"
	                          + p.getMonths() + " Months\n"
	                          + p.getDays() + " Days\n");
	}

}
