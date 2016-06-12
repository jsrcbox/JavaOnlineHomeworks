package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.musicshop;

public class InstrumentNameException extends Exception {
    InstrumentNameException(String s) {
        System.out.println(s + " unknown instrument");
    }


}
