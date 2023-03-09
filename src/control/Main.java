package control;

import model.Client;

public class Main {

    public static void main(String[] args) {
        Client joao = new Client(78);
        Client maria = new Client(99);

        System.out.println("Joao = "+joao.getName());
        System.out.println("Maria = "+maria.getName());

        joao.setName("Joao da Silva");
        maria.setName("Maria Francisca");

        System.out.println("Joao = "+joao.getName());
        System.out.println("Maria = "+maria.getName());

    }

}
