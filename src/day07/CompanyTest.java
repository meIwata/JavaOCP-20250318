package day07;

public class CompanyTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.salary); // 50000

		Manager manager = new Manager();
		System.out.println(manager.salary); // 50000
		System.out.println(manager.budget); // 70000

		Supervisor supervisor = new Supervisor();
		System.out.println(supervisor.salary); // 50000
		System.out.println(supervisor.budget); // 70000
		System.out.println(supervisor.stock); // 120000

		Employee[] employees = { employee, manager, supervisor }; // 多型
		System.out.println(employees[0].salary);
		System.out.println(employees[1].salary);
		System.out.println(employees[2].salary);
		
		// 傳統的for迴圈
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);
		}
		System.out.println("--------------------------");

		// 增強型for迴圈
		for (Employee emp : employees) {
			System.out.println(emp.salary);
		}
		System.out.println("--------------------------");

		Manager[] managers = { manager, supervisor };

	}

}
