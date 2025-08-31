class employyesss {

    private int id, salary;
    private String EmpName;

    public employyesss() {

    }

    public employyesss(int id, int salary, String EmpName) {

        this.id = id;
        this.salary = salary;
        this.EmpName = EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return EmpName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;

    }

    // public String toString() {
    // return "Employee ID: " + id + ", Name: " + EmpName + ", Salary: " + salary;
    // }
}
