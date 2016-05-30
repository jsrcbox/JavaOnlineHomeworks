package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.musicshop;
import java.util.*;
public class MusicShop {
    private List<Instrument> instruments = new ArrayList<Instrument>();
    private Instrument inst;
    public void viewInstrumnentList() {
        for(Instrument i : instruments) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void addInstrument(Instrument inst) {
        instruments.add(inst);
    }
    public Instrument sellInstrument(int i) {
        inst = instruments.get(i);
        instruments.remove(i);
        return inst;
    }
}
