package chain_of_responsibility;

public class LowerCurrencyFirstAtmSystem implements AtmSystem {
	private CurrencyProcessor currencyProcessor;
	
	public LowerCurrencyFirstAtmSystem() {
		CurrencyProcessor process100 = new CurrencyProcessor(100, null);
		CurrencyProcessor process200 = new CurrencyProcessor(200, process100);		
		CurrencyProcessor process500 = new CurrencyProcessor(500, process200);
		CurrencyProcessor process2000 = new CurrencyProcessor(2000, process500);
		process2000.setNextProcessor(null);
		process500.setNextProcessor(process2000);
		process200.setNextProcessor(process500);
		process100.setNextProcessor(process200);
		currencyProcessor = process100;
	}
	
	public StringBuilder generateChange(int amount) {
		StringBuilder generatedChange = new StringBuilder();
		return currencyProcessor.processAmount(generatedChange, amount);
	}

}
