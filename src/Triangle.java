public class Triangle {
    public static void main(String[] args)  {
        int numberOfLines = Integer.parseInt(args[0]);
        int numberOfStars = 0;
        while (numberOfStars <= numberOfLines){
            for(int n=0; n < numberOfStars; n++) {
                System.out.print('*');
            }
            System.out.println();
            numberOfStars++;
        }

    }
}
