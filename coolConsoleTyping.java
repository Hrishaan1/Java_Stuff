public class coolConsoleTyping {
    

    public static void main(String[] args) {
        coolType("Hello there", true);
        coolType("How are you doing?", true);
    }

    public static void coolType(String text, boolean nextLine) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.substring(i, i + 1));
            customSleep(50);
        }
        //if you want it to print and go to the next line
        if (nextLine) System.out.println();
    }

    public static void customSleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
