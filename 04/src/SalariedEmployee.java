public class SalariedEmployee extends Employee{

  String socialSecurityNumber;
  double fixedMonthlyPayment;

  // TODO fix class declaration and declare variables here

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
  super(employeeId,name);
    this.employeeId = employeeId;
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {

    return this.socialSecurityNumber ;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return this.fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
     this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public double calculatePay() {
    return fixedMonthlyPayment;
  }

  // TODO fill in code here
}
