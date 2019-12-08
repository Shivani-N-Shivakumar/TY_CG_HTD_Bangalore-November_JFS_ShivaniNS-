package customChecked;

public class AgeLimitException extends Exception {
String msg="not allowed to vote";

public AgeLimitException() {
	super();
}

public AgeLimitException(String msg) {
	super();
	this.msg = msg;
}

@Override
public String getMessage() {

	return this.msg;
}

}
