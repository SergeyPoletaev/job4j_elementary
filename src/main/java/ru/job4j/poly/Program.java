package ru.job4j.poly;

public class Program {

    public static void main(String[] args) {
        Store store = new FileStore();
        Service service = new Service(store);
        service.extract();
    }
}
