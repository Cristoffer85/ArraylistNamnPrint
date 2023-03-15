import java.util.ArrayList;
import java.util.Arrays;

public class arrayListLatta {
    public static void main(String[] args) {

        ArrayList<String> namn = new ArrayList<>();
        namn.add("Luke");
        namn.add("Leia");
        namn.add("Han");
        namn.add("Chewbacca");

        ArrayList<Integer> heltal = new ArrayList<>();
        heltal.add(421);
        heltal.add(1977);
        heltal.add(1138);
        heltal.add(2187);

        ArrayList<String> namn2 = new ArrayList<>();
        namn2.add("Pelle");
        namn2.add("Kalle");
        namn2.add("Lisa");
        namn2.add("Beebop");
            System.out.println(namn2+"\n");


        ArrayList<String> namn3 = new ArrayList<>();
        namn3.add("Leonardo");
        namn3.add("Donatello");
        namn3.add("Raphael");
        namn3.add("Michelangelo");

        for (int i = namn3.size() - 1; i >= 0; i--) {
            System.out.println(namn3.get(i));
        }
    }
}
