public class EmployeeData {
    private String empFname;
    private String empLname;
    private int emp_id;

    public EmployeeData()
    {

    }
    public EmployeeData(String empFname, String empLname, int emp_id)
    {
        this.empFname = empFname;
        this.empLname = empLname;
        this.emp_id =emp_id;
    }

    public String getEmpFname()
    {
        return empFname;
    }

    public void setEmpFname(String empFname)
    {
        this.empFname = empFname;
    }

    public String getEmpLname()
    {
        return empLname;
    }

    public void setEmpLname(String empLname)
    {
        this.empLname = empLname;
    }

    public int getEmp_id()
    {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
}