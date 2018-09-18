public class Device {

    String kod;
    String producent;
    String typ;
    double cena;

    Device(String kod, String producent, String typ, double cena) {

        this.kod = kod;
        this.producent = producent;
        this.typ = typ;
        this.cena = cena;


    }


    Device(String kod, String producent, String typ) {

        this.kod = kod;
        this.producent = producent;
        this.typ = typ;
    }

    String getInfo() {

        String device="Kod:"+  kod+ "," + " " + "producent:"+ producent + "," +" "  + "typ:" + typ+ ","+" "+"cena:"+cena;

    return device ;


    }


}
