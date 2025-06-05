package com.mycompany.app;

public class Main {

    public static void main(String[] args) {

        Roata r1 = new Roata(1);
        Roata r2 = new Roata(2);
        Roata r3 = new Roata(3);
        Roata r4 = new Roata(4);

        Masina m = new Masina("Hyundai");

        try {

            m.adaugaRoata(r1);
            m.adaugaRoata(r2);
            m.adaugaRoata(r3);
            m.adaugaRoata(r4);

        } catch (PreaMulteRoti e) {

            System.out.println("Eroare: " + e.getMessage());

        }

        System.out.println("Nr ariilor rotilor: " + m.calculeazaArieTotala());

    }

}
