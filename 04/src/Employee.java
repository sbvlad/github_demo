public abstract class Employee implements Payable{
  // TODO fix class declaration and declare variables here

   String employeeId;
   String name;
   int count = 0;
   double all_salary = 0.0;



  public Employee(String employeeId, String name) {

    this.employeeId = employeeId;
    this.name = name;
    count++;

  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {

    return calculatePay();
  }

  @Override
  public String toString() {
    // TODO fill in code here and replace the return statement, be sure to format double value
    System.out.println(String.format(name+" %.2f",getAverageMonthlySalary()));

    return String.format(name+" %.2f",getAverageMonthlySalary());
  }
}
