package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.musicshop;
import java.util.*;
public class MusicShop {

    private static Map<String, Integer> stock = new HashMap<String, Integer>();
    private static List<Instrument> instruments = new ArrayList<Instrument>();
    private Instrument instrumentBuffer;
    Integer stockInstr;
    Integer needInstr;

    public void viewInstrumnentList() {
        for (Instrument i : instruments) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> set = stock.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ":  ");
            System.out.println(me.getValue());
        }
    }

    public void addToStock(Instrument instrument, Integer number) {
        stock.put(instrument.getDescription(), number);

        int count = 0;
            while (count < number) {
                instruments.add(instrument);
                count++;
            }
    }

    List<Instrument> basket;
    Map<String, Integer> stockBackup;
    List<Instrument> instrumentsReturn;

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {

        stockBackup = new HashMap<String, Integer>();
        instrumentsReturn = new ArrayList<Instrument>();

        stockBackup.putAll(stock);
        instrumentsReturn.addAll(instruments);

        basket = new ArrayList<Instrument>();
        Set<Map.Entry<String, Integer>> set = order.entrySet();

        for (Map.Entry<String, Integer> me : set) {

            String currentKey = me.getKey();
            stockInstr = stock.get(currentKey);
            needInstr = me.getValue();
            int counter = needInstr;

            try {
                    if ( !(stock.containsKey(currentKey)) ) {
                        throw new InstrumentNameException(me.getKey());
                    }
                }
            catch(InstrumentNameException ine) {
                    continue;
                }
            if(needInstr <= 0) {
                    System.out.println("not selected any " + me.getKey());
                    continue;
                }
            else if (stockInstr - needInstr >= 0) {
               while(counter > 0) {
                    for (Instrument choice : instruments) {
                        if (choice.getDescription().equals(currentKey)) {
                            basket.add(choice);
                            instruments.remove(choice);
                            break;
                        }
                    }
                    counter--;
                }
                stock.put(currentKey, stockInstr - needInstr);
            }
            else if (stockInstr - needInstr < 0) {
                try {
                    throw new IllegalArgumentException();
                }
                catch(IllegalArgumentException iae) {
                    System.out.println("no " + me.getValue() + " " + currentKey + " in shop");
                    breakTransaction();
                    break;
                }
            }
        }
        return basket;
    }

    private void breakTransaction() {
        basket.clear();
        stock.clear();
        instruments.clear();
        stock.putAll(stockBackup);
        instruments.addAll(instrumentsReturn);
    }
}

