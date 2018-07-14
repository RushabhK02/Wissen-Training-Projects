package adapter;

class LegacyBMI {
	static double calculateBMI(double heightInMetres, double weightInKg) {
		return weightInKg/heightInMetres;
	}
}
