package com.mycompany.atividadegrafo;

import java.util.Iterator;
import java.util.LinkedList;

public class grafoVelho {

    int altura = 0;
    LinkedList<Integer> grafoVelho[];

    public grafoVelho(int v) {
        grafoVelho = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            grafoVelho[i] = new LinkedList();
        }

    }

    public void adcVertices(int v, int w) {

        grafoVelho[v].add(w);
        altura++;
    }
    public void mostrarGrafo() {
        int i = 0;
        for (i = 0; i < grafoVelho.length; i++) {
            Iterator<Integer> j = grafoVelho[i].listIterator();
            System.out.print(i);
            while (j.hasNext()) {
                System.out.print("->" + j.next());
            }
            System.out.println();
        }
        System.out.println(altura);
    }
}

