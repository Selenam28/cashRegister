public class Kassa {

    /*
    * Zodat de kassa correct werkt heb moet ik het aantal producten kunnen bijhouden : aantalProducten ( Er moeten minimaal 3 producten
    * worden toegevoegd om korting op het totaal bedrag te krijgen ) en het totaal die op 0 geinitisialiseerd wordt ( minimaal 100 euro
    * besteden om korting te krijgen op het totaal) . 10% korting wordt alleen toegepast indien beide eisen voldaan zijn.
     */

    private int aantalProducten;
    private double totaal;

    /*
    * Er wordt een lege kassa aangemaakt.
     */

    public Kassa(){
        aantalProducten = 0;
        totaal = 0.0;
    }

    /*
    * Het aantal producten die zijn toegevoegd worden teruggegeven.
     */

    public int getAantalProducten(){
        return aantalProducten;
    }

    /*
    * Het totaal van de bestelling inclusief korting wordt teruggegeven.
    * Korting wordt alleen toegepast al er 3 of meer items zijn toegevoegd en de totaalprijs van de producten hoger dan 100 euro is.
     */

    public double getTotaalMetKorting(){
        if(aantalProducten >= 3 && totaal>= 100.0){
            return (totaal-(totaal*0.1));
        }
        else{
            return totaal;
        }
    }

    /*
    * Er moet een product met een prijs aan de kassa worden toegevoegd.
     */

    public void voegProductToe(double prijs){
        totaal = totaal+prijs;
        aantalProducten = aantalProducten+1;
    }

    /*
    * De aantal Producten wordt op 0 gereset
    * De totaal Prijs wordt op 0 gereset
     */

    public void resetKassa(){
        totaal = 0;
        aantalProducten =0;

    }




}





