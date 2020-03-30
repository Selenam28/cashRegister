import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KassaTest {

    @Test
    public void testToevoegenProductenMetKorting(){

        Kassa kassa = new Kassa();
        assertEquals(0.0 , kassa.getTotaalMetKorting(),0.1);
        kassa.voegProductToe(10);
        assertEquals(10.0, kassa.getTotaalMetKorting(),0.1);
        kassa.voegProductToe(20);
        assertEquals(30.0, kassa.getTotaalMetKorting(),0.1);
        kassa.voegProductToe(30);
        assertEquals(60.0, kassa.getTotaalMetKorting(),0.1);
        kassa.voegProductToe(40);
        assertEquals(90.0, kassa.getTotaalMetKorting(),0.1);
        kassa.resetKassa();
        assertEquals(0.0,kassa.getTotaalMetKorting(),0.1);
        assertEquals(0, kassa.getAantalProducten());



    }



}