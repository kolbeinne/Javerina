public class TestComment {
    public static void main(String[] args){
        int aTala, bil;

        aTala=Integer.parseInt(args[0]);
        bil = Integer.parseInt(args[1]);

        char a = (char) aTala;
        char b = (char) (aTala+bil);
        char c = (char) (aTala + (2 * bil));

        // Version 1, sem mér finst mest elegant :-), notar samskonar
        // formatting-string og printf gerir í forritunarmálinu C.
        // ´%c´ þýðir að þar á að koma char út því sem prentast út,
        // ´\n´ þýðir newline,  það eru fleiri svona filterar og hægt að stjórna því
        // hvernig outputið lítur út með þeim...t.d. hversu margir
        // aukastafir prentast á tölum etc. Svo setur maður breyturnar á
        // eftir formatting strengnum með kommum á milli:

        System.out.printf("%c%c%c%c%c\n",a,b,c,b,a);

        //  Version 2 notar println í Java.  Með því að setja "" á
        //  milli chars er hægt að forca Java í að prenta characterinn
        //  en ekki int value og prenta þá alla í einu.
        //  Smellti einum newline character aftan á til að fá nýja línu í restina:

        System.out.println(a+""+b+""+c+""+b+""+a+"\n");

    }
}
