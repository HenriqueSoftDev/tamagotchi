package br.com.joaocarloslima.tamagotchi.model;

public abstract class Animal {
    protected int energia;
    protected int fome;
    protected int felicidade;

    public Animal(int energia, int fome, int felicidade) {
        this.energia = energia;
        this.fome = fome;
        this.felicidade = felicidade;
    }

    public abstract void brincar();

    public abstract void comer();

    public abstract void dormir();

    public abstract void turno();

    protected void valida(){
        if (energia < 0){
            energia = 0;
        }
        if (fome < 0){
            fome = 0;
        }
        if (felicidade < 0){
            felicidade = 0;
        }
        if (energia > 100){
            energia = 100;
        }
        if (fome > 100){
            fome = 100;
        }
        if(felicidade > 100){
            felicidade = 100;
        }
    }

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getFelicidade() {
        return felicidade;
    }
}
