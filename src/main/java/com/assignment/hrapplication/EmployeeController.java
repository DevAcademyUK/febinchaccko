package com.assignment.hrapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@SuppressWarnings("Duplicates")
public class EmployeeController {

    private static int count = 0;

    private void init() {
        if (count < 1) {
            Employee.addNewEmployee(new  Employee("Mr", "Febin", "Chacko", "08/02/1989", "25 Coventry Road", "Nuneaton", "Warwickshire", "CV11 4NL", "07391473117", "febin.t.chacko@gmail.com", 1, "Developer", "18/03/2019" ));
            Employee.addNewEmployee(new  Employee("Mrs", "Honey", "Saju", "10/09/1990", "17 Coventry Road", "Nuneaton", "Warwickshire", "CV11 4NL", "07391472112", "honey@gmail.com", 2, "Manager", "18/03/2019" ));
            count++;
        }


    }

    @GetMapping("/viewEmployee")
    public String viewEmployee (Model model) {
        init();
        model.addAttribute("employee", Employee.employees);
        return "viewEmployee";
    }

    @GetMapping("/addEmployee")
    public String addEmployee (Model model) {
            int nextID = Employee.employees.size() + 1;
            System.out.println(nextID);
            Employee employee = new Employee();
            employee.setEmployeeID(nextID);
            model.addAttribute("employee", employee);
            return "addEmployee";
    }
    @PostMapping("/employeeAdded")
    public String employeeAdded(@ModelAttribute Employee employee ) {
        Employee.addNewEmployee(employee);
        return "index";
    }

    @GetMapping("/editDeleteEmployee")
    public String editDeleteEmployee(Model model) {
        init();
        model.addAttribute("employee", Employee.employees);
        model.addAttribute("aEmployee", new Employee());
        return "editDeleteEmployee";
    }

    @PostMapping("/employeeEdit")
    public String employeeToEdit(@ModelAttribute Employee employee, Model model) {
        Employee b = new Employee();
        for(Employee bk : Employee.employees) {
            if(bk.getEmployeeID() == employee.getEmployeeID()){
                b = bk;
            }
        }
        model.addAttribute("employee", b);
        return "employeeEdit";
    }

    @PostMapping("/employeeSaved")
    public String employeeSaved(@ModelAttribute Employee employee) {
        for(Employee b : Employee.employees) {
            if (b.getEmployeeID() == employee.getEmployeeID()) {
                int index = Employee.employees.indexOf(b);
                Employee.employees.set(index, employee);
                break;
            }
        }
        return "/index";
    }

    @PostMapping ("/employeeDelete")
    public String employeeDelete(@ModelAttribute Employee employee ,Model model) {
            Employee b = new Employee();
            for (Employee bk: Employee.employees) {
                if (bk.getEmployeeID() == employee.getEmployeeID()) {
                    b=bk;
                }
            }
            model.addAttribute("employee", b);
            return "employeeDelete";
    }

}
