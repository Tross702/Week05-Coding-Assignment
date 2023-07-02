
//Pint error message for the SpacedLogger 
public class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        StringBuilder spacedOutMessage = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            spacedOutMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedOutMessage);
    }
    @Override
    public void error(String message) {
        StringBuilder spacedOutMessage = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            spacedOutMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println("ERROR: " + spacedOutMessage);
    }
}