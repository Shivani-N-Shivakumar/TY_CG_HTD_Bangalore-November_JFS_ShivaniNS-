
public interface Bottle {
void open();
void drink();
default void juice() {
	System.out.println("juice name is");
}
static void close() {
	System.out.println("bottle closed");
}
}
