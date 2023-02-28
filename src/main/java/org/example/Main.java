package org.example;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Marrom");
        m.locomover();  // Correndo
        m.alimentar();  // Mamando
        m.emitirSom();  // Som de Mamífero

        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();  // Nadando
        p.alimentar();  // Comendo Substâncias
        p.emitirSom();  // Peixe não faz som
        p.soltarBolha();

        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();  // Voando
        a.alimentar();  // Comendo Frutas
        a.emitirSom();  // Som de Ave
        a.fazerNinho();

        m.setPeso(5.70);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();  // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); //Som de Mamífero

        c.setPeso(55.30);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();  // Saltando
        c.alimentar();  // Mamando
        c.emitirSom();  // Som de Mamífero
        c.usarBolsa();

        k.setPeso(3.94);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();  // Correndo
        k.alimentar();  // Mamando
        k.emitirSom();  // som de Mamífero
        k.abanarRabo();

    }
}