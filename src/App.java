
//Instantiate an instance of each of your logger classes that implement the Logger interface.
public class App {
    public static void main(String[] args) {
        Logger logger1 = new AsteriskLogger();
        Logger logger2 = new SpacedLogger();

        logger1.log("Hello");
        logger1.error("Hello");

        logger2.log("Hello");
        logger2.error("Hello");
    }
}