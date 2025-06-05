package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class TestMasina {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMasinaRoataSize() {
        try {
            Roata r1 = new Roata(3);
            Roata r2 = new Roata(3);
            
            Masina m = new Masina("Toyota");

            m.adaugaRoata(r1);
            m.adaugaRoata(r2);
            assertTrue(28.26 < r.calculeazaArie(), "Output did not match");
    

        } catch (PreaMulteRoti e) {

            System.out.println("Eroare: " + e.getMessage());

        }

        assertTrue(56.52 < m.calculeazaArieTotala(), "Output did not match");
    }
}