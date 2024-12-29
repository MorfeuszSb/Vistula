//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            NullPointerGenerator.generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Wystąpił błąd: NullPointerException");
            e.printStackTrace();
            System.out.println("Szczegóły wyjątku: " + e.toString());
        }
    }
}
