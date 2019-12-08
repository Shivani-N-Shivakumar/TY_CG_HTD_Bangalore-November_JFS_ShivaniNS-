package customunchecked;

public class ATMSimulator {
void withDraw(double amount) {
	if(amount>40000)
{
throw new DayLimitException("user exceeds the withdrawal of day limit")	;	
}
}
	
}
