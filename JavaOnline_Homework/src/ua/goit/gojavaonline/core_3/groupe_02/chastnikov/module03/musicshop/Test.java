package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.musicshop;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        MusicShop ms = new MusicShop();

        ms.addToStock(new Guitar("guitar"), 16);
        ms.addToStock(new Piano("piano"), 2);
        ms.addToStock(new Trumpet("trumpet"), 7);
        System.out.print("on start:    ");
        ms.viewInstrumnentList();

        System.out.print(">>>in basket:   ");
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("guitar", 7);
        order.put("trumpet", 2);
        order.put("piano", 0);
        System.out.println(ms.prepareInstruments(order));
        System.out.print("after order:   ");
        ms.viewInstrumnentList();

        System.out.print(">>>in basket:   ");
        Map<String, Integer> order1 = new HashMap<String, Integer>();
        order1.put("piano", 1);
        order1.put("accordion", 6);
        System.out.println(ms.prepareInstruments(order1));
        System.out.print("after order:   ");
        ms.viewInstrumnentList();

        System.out.print(">>>in basket:   ");
        Map<String, Integer> order2 = new HashMap<String, Integer>();
        order2.put("piano", 1);
        order2.put("guitar", 8);
        order2.put("trumpet", 6);
        System.out.println(ms.prepareInstruments(order2));
        System.out.print("after order:   ");
        ms.viewInstrumnentList();


    }
}
