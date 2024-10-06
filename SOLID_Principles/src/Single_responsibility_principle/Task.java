package Single_responsibility_principle;
//SRP:
//A Class should have one and only one reason to change
//Following classes do multiple responsibilities so they are not following SRP

public class Task {
	public void downLoadFile(){}
	public void parseFile(){}
	public void persistData(){}
}

class Employee{
	public double calculatePay(){
		return 0;};
	public String reportHours(){
		return null;
	}
	public void save(){}
}
