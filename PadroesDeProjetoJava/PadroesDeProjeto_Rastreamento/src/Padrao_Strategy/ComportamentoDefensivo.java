package Padrao_Strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defenssivamente...");
    }

}
