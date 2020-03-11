public class ContractedEmployee extends Employee {
  String federalTaxId;
  double hourlyRate;
  double numberOfHoursWorked;
  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(name,employeeId);
    this.name = name;
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {

    return this.federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
   this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
   this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {

    return this.numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  // TODO fill in code here


  @Override
  public double calculatePay() {
    return numberOfHoursWorked*hourlyRate;
  }
}
