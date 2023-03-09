package model;

public class Client {

    private long id;
    private String name;

    public Client(long id) {
        this.id = id;
        System.out.println("Opa, construtor em acao!");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
