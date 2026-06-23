public class Strings {
    static void main(String[] args) {

        String text1 = new String("hallo");
        String text2 = new String("hallo");

        if (text1 == text2) {
            System.out.println("Beide Strings sind gleich");
        } else {
            System.out.println("Die Strings sind nicht gleich");
        }

        if (text1.equals(text2)) {
            System.out.println("Beide Werte sind gleich");
        } else {
            System.out.println("Die Werte sind nicht gleich");
        }

    }
}
