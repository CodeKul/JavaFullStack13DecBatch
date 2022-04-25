package association;

public class Company {
    String companyName;
    Employee employee;
    Address address;

    public Company(String companyName, Employee employee, Address address) {
        this.companyName = companyName;
        this.employee = employee;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
class Employee{
    String empName;
    int id;
    Address address;

    public Employee(String empName, int id, Address address) {
        this.empName = empName;
        this.id = id;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
class Address{
    String streetName;
    int flatNo;
    String city;
    String state;
    String country;
    int pinCode;

    public Address(String streetName, int flatNo, String city, String state, String country, int pinCode) {
        this.streetName = streetName;
        this.flatNo = flatNo;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

class CompanyImpl{
    public static void main(String[] args) {
        Address empAddress = new Address
                ("Bhusari Colony",401,"Pune","MH","INDIA",411028);
        Employee employee = new Employee("xyz",1,empAddress);

        Address companyAddress = new Address("Chafekar Chowk",205,"Pune","MH","India",411052);
        Company company = new Company("Codekul",employee,companyAddress);

        System.out.println(employee.getEmpName() +" is employee of "+company.getCompanyName());
        System.out.println("Personal Address: "+empAddress.getFlatNo() + " "+ empAddress.getStreetName()
        + " " +empAddress.getCity()+","+empAddress.getState()+","+empAddress.getPinCode());

        System.out.println("Company Address: "+companyAddress.getFlatNo() + " "+ companyAddress.getStreetName()
                + " " +companyAddress.getCity()+","+companyAddress.getState()+","+companyAddress.getPinCode());
    }
}

