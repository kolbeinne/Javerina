public class Spil21 {
    public static void main(String[] args) {
        int spil=0;
        int summa=0;
        //int n = Integer.parseInt(args[0]);
        int n = 2;


        while (n>0) {
            spil = StdRandom.uniformInt(1,13);
            summa=summa+spil;
            n--;
        }

        if(summa==21){
            println("Vinningur "+summa);
        } else if (summa < 21) {
            println("Ekki fleiri sénsar "+summa);
        } else {
            println("Sprunginn " + summa);
        }






    }
    public static void println(Object line) {
        System.out.println(line);
    }
}
