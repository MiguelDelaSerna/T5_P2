package parcial2;

public class Pato extends Animal implements AnimalQueNada, AnimalQueVuela, AnimalQueCamina{

    public String toString(){
        return ("Pato");
    }

    @Override
    public void nadar() {

    }

    @Override
    public void caminar() {

    }

    @Override
    public void volar() {

    }
}
