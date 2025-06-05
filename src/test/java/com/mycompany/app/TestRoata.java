package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class TestRoata {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRoataSize() {
        Roata r = new Roata(3);
        assertTrue(28.26 < r.calculeazaArie(), "Output did not match");
    }
}
