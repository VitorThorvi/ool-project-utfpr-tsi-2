package model;

public class Address {
  private String street;
  private int number;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  private String city;
  private String cep; //minúsculo para indicar q não é CONSTATNTE
}
