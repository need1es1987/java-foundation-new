package interfaces.compare;


import java.util.Arrays;

public class WatchPawnshop {

   public static void main(String[] args) throws CloneNotSupportedException {
       Watch gshock = new Watch("G-shock", true, 100.0);
        Watch casio = new Watch("Casio",false, 120.0);
        Watch swatch = new Watch("Swatch", false, 60.0);

        //System.out.println("gshock.compareTo(casio) = " + gshock.compareTo(casio));

        Watch[] watches = {gshock, casio, swatch};
        System.out.println(Arrays.toString(watches));
        Arrays.sort(watches);
        System.out.println(Arrays.toString(watches));

        Watch casio2 = (Watch) casio.clone();
        System.out.println("casio2 = " + casio2);

    }

}

