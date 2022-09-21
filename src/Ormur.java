public class Ormur {
    public static void main(String[] args) {
        int lengdOrms = Integer.parseInt(args[0]);
        // int lengdOrms =15;
        for(int i=1;i<=lengdOrms;i++){
            for(int n=0; n<i; n++){
                System.out.print('*');
            }
            System.out.print(i);
        }
    }
}

