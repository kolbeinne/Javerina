public class Runa {
    public static void main(String[] args){
        int tala = Integer.parseInt(args[0]);
        int summa = 0;

        if(tala < 1){
            System.out.println("Input needs to be  >= 1, thank you.");
            return;
        }
        for(int i=1; i<=tala; i++) {
            if(tala%i == 0) {
                System.out.print('1');
                summa++;
            } else {
                System.out.print('0');
            }
        }
        System.out.println("\n"+summa);

    }
}
