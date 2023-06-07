package controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import DAO.InductionDAO;
import models.Induction;
import models.InductionId;

@Controller
public class InductionController {

	private InductionDAO ids;
	private Induction i;
	private InductionId iid;

	@Autowired
	public InductionController(InductionDAO idao, Induction indu, InductionId iids) {
		ids = idao;
		i = indu;
		iid = iids;
	}

	@RequestMapping(value = "/induction", method = RequestMethod.GET)
	public String showCandidateForm() {
		return "induction";
	}

	@RequestMapping(value = "/success2", method = RequestMethod.POST)
	public String submitInduction(@RequestParam("indc_id") int indcId, @RequestParam("indc_emof_id") int indcEmofId,
			@RequestParam("indcDate") Date indcDate, @RequestParam("indc_processes_ausr_id") int indcProcessesAusrId,
			@RequestParam("status") String indcStatus, Model model) {

		iid.setindc_id(indcId);
		iid.setindc_emof_id(indcEmofId);
		i.setId(iid);
		i.setInductionDate(indcDate);
		i.setIndcProcessesAusrId(indcProcessesAusrId);
		i.setStatus(indcStatus);

		// Call the DAO to insert the induction record
		ids.insertInduction(i);

		// Add success message or any other data to the model
		model.addAttribute("message", "Induction record submitted successfully!");

		// Return the view name for the success.jsp
		return "success2";
	}

}
