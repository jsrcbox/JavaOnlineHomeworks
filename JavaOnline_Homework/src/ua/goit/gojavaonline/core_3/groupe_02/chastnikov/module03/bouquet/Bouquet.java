package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.bouquet;

import java.util.*;

public class Bouquet {
    private List<Flower> components = new ArrayList<Flower>();
  //  private Flower fl;
   public void addComponent(Flower component) {
        this.components.add(component);
    }
    public void removeComponent(int x) {
        this.components.remove(x);
    }
    public void clearBouquet() {
        this.components.clear();
    }
    public void viewBouquet() {
        for(Flower buoquetItem : components)
            System.out.print(buoquetItem + " ");
    }
    public Flower extractOneFlower(int f) {
        return components.get(f);
    }
    public Flower getAndRemoveFlower(int g) {
        Flower flowerBuffer = components.get(g);
        removeComponent(g);
        return flowerBuffer;
    }
}
