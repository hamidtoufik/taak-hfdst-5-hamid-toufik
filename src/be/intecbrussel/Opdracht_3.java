package be.intecbrussel;

public class Opdracht_3 {

    public static void main(String[] args) {
        var aboolean = false;
        var charachter = 'd';
        byte abyte = 126;
        short ashortint = 115;
        var integer = 1234567;
        var alongint = 45631341L;
        var adecimalnumber = 1256.32F;
        var abigdecimalnumber = 12.365987451236;

        //antwoord -------------------------------------------------------------------------
        abyte = (byte)ashortint;
        charachter = (char)ashortint;
        charachter = (char)integer;



        //--------------------------------------------------------------------------------------

        System.out.println(aboolean);
        System.out.println(charachter);
        System.out.println(abyte);
        System.out.println(ashortint);
        System.out.println(alongint);
        System.out.println(adecimalnumber);
        System.out.println(abigdecimalnumber);


    }
}
