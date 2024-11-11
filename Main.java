import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tura tura = new Tura(0, 0);
        Nebun nebun = new Nebun(2, 0);
        Pion pion = new Pion(1, 1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduceți piesa (Tura, Nebun, Pion) și coordonatele noi (ex: Tura 0 3) sau 'exit' pentru a ieși:");
            String piesa = scanner.next();

            if (piesa.equalsIgnoreCase("stop")) {
                System.out.println("Ieșire din program.");
                break;
            }

            int newX = scanner.nextInt();
            int newY = scanner.nextInt();

            boolean mutareValida = false;

            if (piesa.equalsIgnoreCase("Tura")) {
                mutareValida = tura.mutaPiesa(newX, newY);
            } else if (piesa.equalsIgnoreCase("Nebun")) {
                mutareValida = nebun.mutaPiesa(newX, newY);
            } else if (piesa.equalsIgnoreCase("Pion")) {
                mutareValida = pion.mutaPiesa(newX, newY);
            } else {
                System.out.println("Piesă necunoscută!");
                continue;
            }

            if (mutareValida) {
                System.out.println("Mutare validă! " + piesa + " mutată la (" + newX + ", " + newY + ").");
            } else {
                System.out.println("Mutare invalidă!");
            }
        }

        scanner.close();
    }
}
