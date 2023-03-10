package control;

import model.*;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //cadastro funcionário
    Employee francisco = new Employee(0);
    francisco.setName("Francisco");

    // cadastro de cliente
    Client emerson = new Client(12345);
    emerson.setName("emerson");
    Address emersonAddr = new Address();
    emersonAddr.setStreet("rua manoel ribas");
    Register register1 = new Register(emerson,emersonAddr);

    // cadastro do serviço
    Service service1 = new Service(1);
    service1.setDescription("arrumar a televisão");

    // criar ordem de serviço
    Order ordem1 = new Order(12);
    ordem1.addService(service1);
    ordem1.setClient(emerson);
    ordem1.setEmployee(francisco);

    // listar ordens em aberto
    System.out.println(ordem1.getId()+"\n"+ ordem1.getClient().getName()+"\n"+ordem1.getEmployee().getName()+"\n"+ordem1.getService().get(0).getDescription());
  }

}