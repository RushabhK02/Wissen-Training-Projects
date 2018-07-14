package adapter;

public class BMI_Adapter_Ft_Lbs implements BMI_Adapter{
	private static final double INCH_TO_METRE= 0.0254;
	private static final double LBS_TO_KG=0.453592;
	
	public double calculateBMI(int heightInInch, int weightInLbs) {
		double heightInMetre = heightInInch*INCH_TO_METRE;
		double weightInKg = weightInLbs*LBS_TO_KG;
		return LegacyBMI.calculateBMI(heightInMetre, weightInKg);
	}
	
	public String getHealthStatus(double BMI) {
		if(BMI<18.5) {
			return "Underweight";
		}
		else if(BMI<25.0) {
			return "Fit";
		}
		else if(BMI<30) {
			return "Overweight";
		}
		else return "Obese";
	}
}
