package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
    ArrayList<String> list;
    ArrayList<String> list2;
    Conjunto instancia = new Conjunto();
    List<String> uniao = new ArrayList<>();

    public String adicionar(String e, List<String> list) {
        if (verificar(e, list)) {
            System.out.println("O elemento já existe na lista.");

        } else {
            list.add(e);
            System.out.println("Elemento adicionado com sucesso.");

        }
        return e;
    }

    public boolean verificar(String e, List<String> list) {
        for (int i = 0; i < list.size(); i++) {

            for (String v : list) {
                if (v == e) {
                    return true;
                }
            }
        }
        return false;
    }


    public String uniao() {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    instancia.adicionar(list.get(i), uniao);

                }

            }
        }
        return null;
    }
}
