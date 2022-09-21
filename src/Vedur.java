 /*
        _      _                ___
 /\   /(_)_ __| | ____ _ _ __  / _ \
 \ \ / | | '__| |/ / _` | '__| \// /
  \ V /| | |  |   | (_| | |      \/
   \_/ |_|_|  |_|\_\__,_|_|      ()

hello!
sælllirrr!
  */

public class Vedur  {
    public static void main(String[] args) {
        int vindur = Integer.parseInt(args[0]);
        String vedur ;  // Apparently þarf ekki að initializa strenginn hér....amk segir compilerinn að það sé redundant

        if (vindur < 0) {           // ef það er minna en 0 þá er það ólöglegt
            vedur = "Ólöglegt";
        } else if (vindur <= 24) {  // ef það er minna en 24,  en stærra en 0 af því að ef það hefði verið minna en 0 þa værum við ekki hér
            vedur = "Annað";
        } else if (vindur <= 28) {  // ef það er minna en 28, en stærra en 24 af því.....
            vedur = "Rok";
        } else if (vindur <= 31) {  // ef það er minna en 31, en stærra en 28 af því.....
            vedur = "Fárviðri";
        } else  {
            vedur = "Ofsaveður";    // ef það er eitthvað annað þá er það fárviðri og algert rugl.
        }
        System.out.println(vedur);
    }

}


// Virkar Þetta væna mín????
