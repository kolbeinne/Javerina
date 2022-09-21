public class Bilastaedi {
    public static void main(String[] args) {
        String bilnumer = args[0];
        int klsInn = Integer.parseInt (args[2]);
        int klsUt = Integer.parseInt (args[3]);

        char gjaldFlokkur = args[1].charAt(0);
        int timi, verd, flokkur = 0;

        switch (gjaldFlokkur) {
            case 'A':
                flokkur = 450;
                break;
            case 'B':
                flokkur = 600;
                break;
            case 'U':
                flokkur = 750;
                break;
            case 'W':
                flokkur = 900;
                break;
        }
        timi = klsUt - klsInn;
        verd = gjaldFlokkur * timi;
        System.out.println(bilnumer + " " + verd);
    }
}
