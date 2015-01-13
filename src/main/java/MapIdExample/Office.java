package MapIdExample;

import com.paypal.DozerMappingViaAnnotation.Employee;

public class Office {

	String address1;
	String address2;
	Long postalCode;
	Employee employee;
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Long postalCode) {
		this.postalCode = postalCode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
