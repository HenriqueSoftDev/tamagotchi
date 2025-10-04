package br.com.joaocarloslima.tamagotchi.model;

public class Cachorro extends Animal{

    public Cachorro(){
        super(80,20,60);
    }

    @Override
    public void brincar(){
        this.felicidade += 15;
        this.energia -= 10;
        this.fome += 10;
        this.valida();
    }

    @Override
    public void comer() {
        this.fome -= 20;
        this.energia += 15;
        this.valida();
    }

    @Override
    public void dormir() {
        this.energia += 15;
        this.fome += 10;
        this.valida();
    }

    @Override
    public void turno() {
        this.energia -= 10;
        this.fome += 10;
        this.felicidade -= 5;
        this.valida();
    }
}
