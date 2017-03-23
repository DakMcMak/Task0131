public class Main {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int meters = (centimetre - centimetre % 100) / 100 ;
        return meters;
    }
}

