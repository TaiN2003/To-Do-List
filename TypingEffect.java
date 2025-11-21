public class TypingEffect {
    public static void typing(String message, int delay)  {
        for (char letter : message.toCharArray()) {
            System.out.print(letter);
            try {
                Thread.sleep(delay);
            } 
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
