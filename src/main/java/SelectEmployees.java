import java.util.List;

import dao.EmployeesDAO;
import model.Employee;

public class SelectEmployees {

	public static void main(String[] args) {
		//Employeesテーブルの全レコードを取得
		EmployeesDAO empDAO = new EmployeesDAO();
		List<Employee> empList = empDAO.findAll();

		//取得したレコードの内容を取得
		for (Employee emp : empList) {
			System.out.println("ID :" + emp.getId());
			System.out.println("名前:" + emp.getName());
			System.out.println("年齢 :" + emp.getAge());
		}
	}

}
