package Exercicio9;

import java.util.List;

public class Conjunto {
    public String adicionar(String e, List<String> list) {
        if (verificar(e, list)) {

        } else {
            list.add(e);
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

    public void print(List<String> conjunto) {
        for (int i = 0; i < conjunto.size(); i++) {
            System.out.println(conjunto.get(i));
        }
    }

    public String uniao(List<String> conjunto, List<String> list, List<String> list2) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                adicionar(list.get(i), conjunto);
                adicionar(list2.get(j), conjunto);
            }
        }
        return null;
    }

    public String inter(List<String> conjunto, List<String> list, List<String> list2) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i) == list2.get(j)) {
                    adicionar(list.get(i), conjunto);
                }
            }
        }
        return null;
    }

    public String menos(List<String> conjunto, List<String> list, List<String> list2) {
        for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).equals(list2.get(i))) {
                    adicionar(list.get(i) , conjunto);

                }
            }

        return null;
    }
}

