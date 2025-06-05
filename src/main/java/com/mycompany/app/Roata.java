package com.mycompany.app;

class Roata {

    public int razaRotii;

    public Roata(int r) {
        this.razaRotii = r;
    }

    public float calculeazaArie() {
        return (float)(3.14 * (float)this.razaRotii * (float)this.razaRotii);
    }

}