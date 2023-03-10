package model;

public class Employee {
  private String name;
  private long id;
  private String skill;

  public Employee (long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }
}
