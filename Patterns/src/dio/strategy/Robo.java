package dio.strategy;

public class Robo {
    // comportamento é a strategy
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() throws Exception {
        try {
            comportamento.mover();            
        } catch (Exception e) {            
            System.err.println("Comportamento inválido.");                        
        }        
    }

}
