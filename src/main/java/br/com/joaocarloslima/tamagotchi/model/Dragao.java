package br.com.joaocarloslima.tamagotchi.model;

public class Dragao extends Animal{

    public Dragao(){
        super(50,100,80);
    }

    @Override
    public void brincar(){
        this.felicidade += 12;
        this.energia -= 15;
        this.fome += 15;
        this.valida();
    }

    @Override
    public void comer() {
        this.fome -= 30;
        this.energia += 20;
        this.valida();
    }

    @Override
    public void dormir() {
        this.energia += 10;
        this.fome += 10;
        this.valida();
    }

    @Override
    public void turno() {
        this.energia -= 15;
        this.fome += 10;
        this.felicidade -= 7;
        this.valida();
    }

}
