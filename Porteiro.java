package encomendas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Porteiro {
    private Map<Integer, Apartamento> apartamentos;

    public Porteiro() {
        this.apartamentos = new HashMap<>();
        registrarEncomendasFixas(); // Registra encomendas no sistema
    }

    private void registrarEncomendasFixas() {
        registrarEncomenda(101, "Caixa pequena");
        registrarEncomenda(102, "Pacote médio");
        registrarEncomenda(103, "Envelope grande");
        registrarEncomenda(101, "Pacote com livros");
        registrarEncomenda(104, "Caixa de eletrônico");
    }

    private void registrarEncomenda(int numeroApto, String descricao) {
        Apartamento apto = apartamentos.getOrDefault(numeroApto, new Apartamento(numeroApto));
        apto.adicionarEncomenda(new Encomenda(descricao));
        apartamentos.put(numeroApto, apto);
    }

    public List<Encomenda> consultarEncomendas(int numeroApto) {
        return apartamentos.getOrDefault(numeroApto, new Apartamento(numeroApto)).getEncomendas();
    }

    public void entregarEncomendas(int numeroApto) {
        if (apartamentos.containsKey(numeroApto)) {
            apartamentos.get(numeroApto).limparEncomendas();
            System.out.println("Encomendas entregues para o apartamento " + numeroApto);
        } else {
            System.out.println("Nenhuma encomenda para o apartamento " + numeroApto);
        }
    }
}

