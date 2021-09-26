package hello;
import java.time.LocalTime;
import java.util.Date;
public class Hello {
	// static int test;		
	public static void main(String[] args) {
		int test = 0;
		Date date = new Date();
		LocalTime datetime1 = LocalTime.now();
		Gender gender = Gender.FEMALE;
		// 0,1,2
		int[] diems = {12, 2 ,3};
		boolean isCorrect = true ;

		System.out.println(diems[0]+ " " + diems[1] + " " + diems[2] );
		System.out.println(diems[1]);
		System.out.println(diems[2]);
		
		System.out.println(date);
		System.out.println(datetime1);		
		System.out.println(gender);
		System.out.println(isCorrect);
		
		
	}
}

