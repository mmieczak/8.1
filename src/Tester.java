public class Tester {
    public static void main(String[] args) {
        Utilities utility = new Utilities();

        Knife[] knives = new Knife[Utilities.TABLE_SIZE];

        //Keep adding until table is full of unique elements
        utility.runAddLoop(knives);

        System.out.println("Table has reached its limit of " + knives.length + " elements");

        utility.ShowTable(knives);

    }


}
