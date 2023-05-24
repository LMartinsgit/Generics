package br.com.lmartins;

import java.util.ArrayList;
import java.util.List;

public class CarroLista<L extends Carro> {
    private List<L> carros;

    public CarroLista() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(L carro) {
        carros.add(carro);
    }

    public List<L> obterCarros() {
        return carros;
    }
}


