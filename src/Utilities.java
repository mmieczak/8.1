import java.util.Scanner;

public class Utilities {
    public static final int TABLE_SIZE = 3;

    public void runAddLoop(Knife[] knives) {
        int i = 1;
        knives[0] = addItemFromKeybord(0);
        do {
            Knife knifeToCheck = addItemFromKeybord(i);
            if (isNewKnife(knifeToCheck, knives)) {
                knives[i] = knifeToCheck;
                i++;
            }
        } while (i != TABLE_SIZE);
    }

    public void ShowTable(Knife[] knives) {
        for (Knife knife : knives) {
            System.out.println(knife);
        }
    }

    private Knife addItemFromKeybord(int itemNumber) {

        System.out.println("Add Knife " + ++itemNumber);
        Scanner scanner = new Scanner(System.in);
        String producer = scanner.nextLine();
        int length = scanner.nextInt();
        int hardness = scanner.nextInt();
        return new Knife(producer, length, hardness);
    }

    private boolean isNewKnife(Knife knifeToCheck, Knife[] knives) {
        for (Knife knife : knives) {
            if (knife != null && knife.equals(knifeToCheck)) {
                System.out.println("Duplicate found. Try again!");
                return false;
            }
        }
        return true;
    }


}
