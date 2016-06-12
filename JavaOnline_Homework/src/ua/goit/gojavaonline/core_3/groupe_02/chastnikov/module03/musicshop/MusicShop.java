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

    public void addToStock(String name, Integer number) {
        stock.put(name, number);

        int count = 0;
        if (name.equals("guitar")) {
            while (count < number) {
                instruments.add(new Guitar());
                count++;
            }

        } else if (name.equals("piano")) {
            while (count < number) {
                instruments.add(new Piano());
                count++;
            }

        } else if (name.equals("trumpet")) {
            while (count < number) {
                instruments.add(new Trumpet());
                count++;
            }

        }
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) {

        Map<String, Integer> stockBackup = new HashMap<String, Integer>();
        List<Instrument> instrumentsReturn = new ArrayList<Instrument>();

        stockBackup.putAll(stock);
        instrumentsReturn.addAll(instruments);

        List<Instrument> basket = new ArrayList<Instrument>();
        Set<Map.Entry<String, Integer>> set = order.entrySet();

        for (Map.Entry<String, Integer> me : set) {

                stockInstr = stock.get(me.getKey());

                needInstr = me.getValue();
                int counter = 0;
                int counter1 = 0;

            try {
                    if (!(me.getKey().equals("guitar") | me.getKey().equals("trumpet") | me.getKey().equals("piano"))) {
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

            if (stockInstr - needInstr >= 0) {
                    if (me.getKey().equals("guitar")) {
                        while (counter < needInstr) {
                            for (Instrument choice : instruments) {

                                if (choice instanceof Guitar) {
                                    instruments.remove(counter1);
                                    counter1 = 0;
                                    break;
                                } else counter1++;
                            }
                            basket.add(new Guitar());
                            counter++;
                        }
                    } else if (me.getKey().equals("piano")) {
                        while (counter < needInstr) {
                            for (Instrument choice : instruments) {

                                if (choice instanceof Piano) {
                                    instruments.remove(counter1);
                                    counter1 = 0;
                                    break;
                                } else counter1++;
                            }
                            basket.add(new Piano());
                            counter++;
                        }
                    } else if (me.getKey().equals("trumpet")) {
                        while (counter < needInstr) {
                            for (Instrument choice : instruments) {
                                if (choice instanceof Trumpet) {
                                    instruments.remove(counter1);
                                    counter1 = 0;
                                    break;
                                } else counter1++;
                            }
                            basket.add(new Trumpet());
                            counter++;
                        }
                    }

                    stock.put(me.getKey(), stockInstr - needInstr);

                } else if (stockInstr - needInstr < 0) {
                    try {
                        throw new IllegalArgumentException();
                    }
                    catch(IllegalArgumentException iae) {
                        System.out.println("no " + me.getValue() + " " + me.getKey() + " in shop");
                        basket.clear();
                        stock.clear();
                        instruments.clear();
                        stock.putAll(stockBackup);
                        instruments.addAll(instrumentsReturn);
                        break;
                    }
                }
        }
        return basket;
    }
}

