package chain_of_responsibility;

class CurrencyProcessor implements Processor { //we can make this abstract class and create separate class for each type of dispenser
	private int denomination;					//This makes the logic easy to change for each type of dispenser
	private CurrencyProcessor nextProcessor;
	
	public CurrencyProcessor(int denomination, CurrencyProcessor nextProcessor) {
		this.denomination = denomination;
		this.nextProcessor = nextProcessor;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}

	public CurrencyProcessor setNextProcessor(CurrencyProcessor nextProcessor) {
		this.nextProcessor = nextProcessor;
		return this.nextProcessor;
	}

	public StringBuilder processAmount(StringBuilder currentDenomination, int amount) {
		int notes = amount/denomination;
		int remainingAmount = amount%denomination;
		if(notes>0) {
			currentDenomination.append(notes+" x "+denomination+"\n");
		}
		if(remainingAmount==0) {
			return currentDenomination;
		}
		if(this.nextProcessor==null) {
			currentDenomination.append("Remaining Amount = "+remainingAmount);
			return currentDenomination;
		}
		
		return this.nextProcessor.processAmount(currentDenomination, remainingAmount);

	}

}
