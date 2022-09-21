public class HalloGeimur {
    private static String[] args;

    public static void main(String[] args){
        HalloGeimur.args = args;

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        System.out.println(excercise131(x,y,z));

        System.out.println( addInts());

    }
    public static String excercise131(int a,int b,int c){
        /* Takes 3 int arguments and compares them
        * If they are equal it returns "equal", if not then returns "not equal"*/
        String result;
        if(a==b && b==c){
            result=("equal");
        } else {
            result=("not equal");
        }
        return result;
    }
    public static int addInts(){
        int sum=0;
        System.out.println("How many numbers?");
        int howmany = StdIn.readInt();

        for(int i=0; i<howmany; i++){
            int value = StdIn.readInt();
            sum += value;

        }

        return sum;
    }



}

