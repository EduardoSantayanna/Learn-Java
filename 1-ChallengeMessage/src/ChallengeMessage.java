public class ChallengeMessage {
    public static String getMessage(Object message) {
        if (message instanceof String) {
            return (String) message;
        } else {
            return "Somente String! Hello world!";
        }
    }
}