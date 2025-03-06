package encomendas;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {
    private int numero;
    private List <Encomenda> encomendas;

    public Apartamento(int numero){
        this.numero = numero;
        this.encomendas = new ArrayList<>();

    }

    public int getNumero() {
        return numero;
    }

    public void adicionarEncomenda(Encomenda encomenda){
        encomendas.add(encomenda);
    }

    public List<Encomenda> getEncomendas() {
        return encomendas;
    }
    public void limparEncomendas(){
        encomendas.clear();
    }
}
