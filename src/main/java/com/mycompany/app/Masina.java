package com.mycompany.app;

import java.util.*;

class Masina {

    public String marcaMasinii;

    public List<Roata> Roti;

    private int rCount = 0;

    public Masina(String m) {

        this.marcaMasinii = m;

        Roti = new ArrayList<>();

    }

    public void adaugaRoata(Roata r) throws PreaMulteRoti {

        if (this.rCount >= 4) {

            throw new PreaMulteRoti("");

        }

        this.rCount += 1;

        this.Roti.add(r);

    }

    public float calculeazaArieTotala() {

        float sumaTotala = 0;

        for (int i = 1; i <= rCount; i++) {

            sumaTotala += this.Roti.get(i).calculeazaArie();

        }

        return sumaTotala;

    }

}