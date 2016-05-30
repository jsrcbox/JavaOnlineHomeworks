package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.musicshop;

public class Test {
    public static void main(String[] args) {
        MusicShop ms = new MusicShop();
        ms.addInstrument(new Guitar());
        ms.addInstrument(new Trumpet());
        ms.addInstrument(new Piano());
        ms.viewInstrumnentList();
        Instrument instr = ms.sellInstrument(2);
        System.out.println(instr);
        ms.viewInstrumnentList();
    }
}
