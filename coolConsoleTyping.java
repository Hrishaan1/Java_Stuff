public class coolConsoleTyping {
    

    public static void main(String[] args) {
        coolType("Hello there");
        coolType("How are you doing?");
    }

    public static void coolType(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.substring(i, i + 1));
            customSleep(100);
        }
        System.out.println();
    }

    public static void customSleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
