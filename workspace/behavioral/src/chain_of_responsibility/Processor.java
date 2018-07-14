package chain_of_responsibility;

interface Processor {
	void setDenomination(int denomination);
	CurrencyProcessor setNextProcessor(CurrencyProcessor nextProcessor);
	StringBuilder processAmount(StringBuilder currentDenomination, int amount);
}
