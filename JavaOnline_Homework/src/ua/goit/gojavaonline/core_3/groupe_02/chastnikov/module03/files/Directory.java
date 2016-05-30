package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module03.files;

import java.util.*;


public class Directory extends File {
    private List<File> listFile;
    Directory() {
        listFile = new ArrayList<>();
    }
    public void addFile(File file) {
        listFile.add(file);
    }
    public void removeFile(int x) {
        listFile.remove(x);
    }
    public void clearDirectory() {
        listFile.clear();
    }
}
