package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Order {
  private int id;
  private Client client;
  private ArrayList<Service> services = new ArrayList<>();
  private Employee employee;
  private Calendar date;
  private boolean isDone = false;

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public Order (int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public ArrayList<Service> getService() {
    return services;
  }

  public void addService (Service service) {
    this.services.add(service);
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Calendar getDate() {
    return date;
  }

  public void setDate(Calendar date) {
    this.date = date;
  }

}
