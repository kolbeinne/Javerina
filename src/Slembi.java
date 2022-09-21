public class Slembi {
    public static void main(String[] args) {
        StdRandom.setSeed(28);
        double a=0;
        while(a < 0.8) {
            a = StdRandom.uniform(0.0,1.0);
            if(a < 0.8) {
                System.out.println(a);
            }
        }
    }
}
