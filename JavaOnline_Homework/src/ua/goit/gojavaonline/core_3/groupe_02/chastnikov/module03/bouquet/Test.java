package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.bouquet;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Bouquet bouq = new Bouquet();
        Bouquet bouq1 = new Bouquet();
        Random rand = new Random(47);
        Rosebush rbush = new Rosebush();
        for (int i = 0; i < 9; i++) {
            int j = rand.nextInt(4);
            switch (j) {
                case 0:
                    bouq.addComponent(new Tulip());
                    break;
                case 1:
                    bouq.addComponent(rbush.getRose());
                    break;
                case 2:
                    bouq.addComponent(new Chamomile());
                    break;
                case 3:
                    bouq.addComponent(new Aster());
                    break;

            }
        }
        bouq.viewBouquet();
        System.out.println();
        bouq1.addComponent(bouq.getAndRemoveFlower(4));
        bouq1.addComponent(bouq.getAndRemoveFlower(4));
        bouq1.addComponent(bouq.getAndRemoveFlower(4));
        bouq.viewBouquet();
        System.out.println();
        bouq1.viewBouquet();
        System.out.println();
    }
}
