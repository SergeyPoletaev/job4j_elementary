package ru.job4j.poly;

public class FileStore implements Store {

    @Override
    public void save(String value) {
        System.out.println("FileStore " + value);
    }

    @Override
    public String[] load() {
        return new String[0];
    }
}
