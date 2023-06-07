package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.EmployeeDAO;
import DAO.EmployeeRefDAO;
import DAO.HolidayDAO;
import DAO.ImageDAO;
import models.Employee;
import models.EmployeeRedocuments;
import models.Holiday;
import models.Image;

@Controller
public class MDController {

	private final HolidayDAO hd;
	private final ImageDAO i;
	private final EmployeeDAO emp;
	private final EmployeeRefDAO er;

	@Autowired
	public MDController(HolidayDAO holidayDAO, ImageDAO id, EmployeeDAO ed, EmployeeRefDAO erd) {
		this.hd = holidayDAO;
		i = id;
		emp = ed;
		er = erd;
	}

	@RequestMapping("/holidays")
	public String showHolidays(Model model) {
		List<Holiday> holidays = hd.findAllHolidays();
		model.addAttribute("holidays", holidays);
		return "holidays";
	}

	@RequestMapping("/img")
	public String showImages(Model model) {
		List<Image> images = i.getAllImages();
		model.addAttribute("images", images);
		return "img";
	}

	@RequestMapping("/employees")
	public String showEmployees(Model model) {
		List<Object[]> employees = emp.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}

	@GetMapping("/get-employee-details")
	public String getEmployeeDetails(@RequestParam("id") int employeeId, Model model) {
		Employee employee = emp.getEmployeeById(employeeId);
		model.addAttribute("employee", employee);
		return "get-employee-details";
	}

	@GetMapping("/empldocx")
	public String showEmployeeDocumentsPage() {
		return "get-employee-documents";
	}

	@GetMapping("/displaydocx")
	public String getEmployeeDocuments(@RequestParam("erfd_id") int erfdId, Model model) {
		EmployeeRedocuments employeeRedocuments = er.findById(erfdId);
		model.addAttribute("employeeRedocuments", employeeRedocuments);
		return "displaydocx";
	}

	@RequestMapping(value = "/empholidays")
	public String getEmpHolidays(Model model) {
		return "emphol";
	}

	@RequestMapping(value = "/empleaves")
	public String getEmpLeaves(Model model) {
		return "emplev";
	}

	@RequestMapping(value = "/adhollev")
	public String getAD(Model model) {
		return "emphollev";
	}

}