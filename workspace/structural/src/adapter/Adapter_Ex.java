package adapter;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Adapter_Ex {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		double BMI;
//		Scanner scanner = new Scanner(System.in);
//		int heightInInch= 70;          //scanner.nextInt(); 
//		int weightInLbs=  150;         //scanner.nextInt();
//		BMI_Adapter_Ft_Lbs calculateBMI = new BMI_Adapter_Ft_Lbs();
//		BMI = calculateBMI.calculateBMI(heightInInch, weightInLbs);
//		System.out.println("BMI : "+BMI);
//		System.out.println("Status : "+calculateBMI.getHealthStatus(BMI));
//		scanner.close();
		String input_date="01/08/2012";
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		Date dt1=format1.parse(input_date);
		DateFormat format2=new SimpleDateFormat("EEEE"); 
		String finalDay=format2.format(dt1);
		System.out.println(finalDay);
	}

}
