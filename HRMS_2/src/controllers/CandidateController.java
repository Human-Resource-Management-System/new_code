package controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.CandidateDAO;
import models.Candidate;

@Controller
public class CandidateController {

	private CandidateDAO cdao;
	private Candidate cdd;

	@Autowired
	public CandidateController(CandidateDAO cd, Candidate cds) {
		cdao = cd;
		cdd = cds;
	}

	@RequestMapping(value = "/candidate", method = RequestMethod.GET)
	public String showCandidateForm() {
		return "candidate";
	}

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String saveCandidate(@RequestParam("firstName") String firstName,
			@RequestParam("middleName") String middleName, @RequestParam("lastName") String lastName,
			@RequestParam("rDate") Date rDate, @RequestParam("gender") String gender, @RequestParam("dob") Date dob,
			@RequestParam("email") String email, @RequestParam("mobile") Long mobile,
			@RequestParam("address") String address, @RequestParam("ludate") Date ludate,
			@RequestParam("status") String status, Model model) {

		cdd.setCandFirstName(firstName);
		cdd.setCandMiddleName(middleName);
		cdd.setCandLastName(lastName);
		cdd.setCandRDate(rDate);
		cdd.setCandGender(gender);
		cdd.setCandDOB(dob);
		cdd.setCandEmail(email);
		cdd.setCandMobile(mobile);
		cdd.setCandAddress(address);
		cdd.setCandLUDate(ludate);
		cdd.setCandStatus(status);

		cdao.saveCandidate(cdd);

		model.addAttribute("message", "Candidate details saved successfully!");
		return "success";
	}
}
