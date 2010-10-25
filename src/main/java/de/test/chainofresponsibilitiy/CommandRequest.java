package de.test.chainofresponsibilitiy;

public class CommandRequest {

  private int number;
  private double amount;
  private String purpose;

  public CommandRequest(int number, double amount, String purpose) {
    this.number = number;
    this.amount = amount;
    this.purpose = purpose;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amt) {
    amount = amt;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String reason) {
    purpose = reason;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int num) {
    number = num;
  }

}
