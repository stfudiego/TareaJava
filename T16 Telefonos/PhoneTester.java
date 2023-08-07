public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Claro", "Ring ring ringgg");
        IPhone X = new IPhone("X", 90, "Movistar", "Zing");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        X.displayInfo();
        System.out.println(X.ring());
        System.out.println(X.unlock());
        
    }
}
