package br.com.joaocarloslima.tamagotchi.model;

public class Gato extends Animal{

    public Gato(){
        super(10,50,30);
    }

    @Override
    public void brincar(){
        this.felicidade += 10;
        this.energia -= 5;
        this.fome += 5;
        this.valida();
    }

    @Override
    public void comer() {
        this.fome -= 15;
        this.energia += 10;
        this.valida();
    }

    @Override
    public void dormir() {
        this.energia += 20;
        this.fome += 5;
        this.valida();
    }

    @Override
    public void turno() {
        this.energia -= 5;
        this.fome += 5;
        this.felicidade -= 3;
        this.valida();
    }

}
