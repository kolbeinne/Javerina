//import java.util.random.RandomGenerator;

public class SearchPrize {

    public static void  main(String[] args) {
        // Skilgreina breytur

        boolean FOUND = false;          // þessi segir til um hvort a[ hur[in s'e fundin.  Byrjar sem "false".
        int[] doors = { 2,2,2,2,3,4 }; // Leitar röðin.  Hér má breyta að vild. Ég byrja með 6 skipti.
        int pickedDoor ; // placeholder fyrir hurðina sem er valin.
        double x; // Þetta er placeholder fyrir random tölu.
        int walk = 0; // þetta er placholder fyrir hvernig verðlaunin færast.
        int prizeDoor = 1 + (int) (Math.random() * 5);  // Random val á því hvar verðlaunin byrja, hurð 1-5

        // Lets go...reynum jafn oft og það eru elements í doors[]
        for (int tries = 0; tries < doors.length; tries++) {    // tries byrjar í 0 og heldur áfram þangað til jafnt og fjöldi elements í doors[]
            pickedDoor=doors[tries];   // Veljum næstu hurð úr doors[]
            if (pickedDoor == prizeDoor) {  //  var þetta rétt hurð?
                FOUND = true;               // jebbs, fundin setjum FOUND sem true.
            } else if (prizeDoor == 1) {    // ef ekki og verðlaunin eru bakvið hurð 1
                prizeDoor++;                // færum verðlaunin á hurð 2
            } else if (prizeDoor == 5) {    // ef ef ekki, or verðlaunin eru bakvið hurð 5
                prizeDoor--;                // færum verðlaunin á hurð 4
            } else {                        // og ef ekkert af þessu fyrir ofan, þá
                // þetta er hack til þess að fá walk með gildi sem er annað hvort -1 eða 1
                x = 1 + (int) (Math.random() * 2);   // fáum random tölu sem er 1 eða 2
                if (x == 1) {                        // ef hún er 1...
                    walk = -1;                       // þá setjum við walk = -1
                } else {                            // annars þá
                    walk = 1;                       // setjum við walk = 1
                }
                prizeDoor = prizeDoor + walk;   // færum verðlaunin upp eða niður um hurð.
            }

            // prentum línu á skjáinn sem segir hvar við erum stödd.

            System.out.println("Tries is:" + tries +
                                " Prize Door is:"+ prizeDoor +
                                " Guess is:"+pickedDoor +
                                ", and FOUND is "+FOUND +
                                " in " + tries +" tries.");
            if(FOUND) {  // ef FOUND er true þá endum við keyrsluna
                return;  // Hættum í forritnu, return.

            }
        }
    }

}
