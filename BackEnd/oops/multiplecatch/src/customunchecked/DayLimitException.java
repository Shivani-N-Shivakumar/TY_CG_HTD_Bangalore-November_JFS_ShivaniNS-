package customunchecked;

public class DayLimitException extends RuntimeException {
String msg="exceeds day limit";


public DayLimitException() {
	super();
	
}


public DayLimitException(String msg) {
	super();
	this.msg = msg;
}

@Override
public String getMessage() {
	return this.msg;
}

}
