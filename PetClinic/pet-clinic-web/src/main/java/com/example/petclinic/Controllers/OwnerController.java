package com.example.petclinic.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

	private final OwnerService ownerservice;
	
	@Autowired
	public OwnerController(OwnerService ownerservice) {
		super();
		this.ownerservice = ownerservice;
	}

	@RequestMapping({ "", "/", "/index" })
	public String OwnerIndex() {
		return "owners/index";
	}

	@RequestMapping({"/listing"})
	public String DisplayOwners(Model model) {
		model.addAttribute("owners", ownerservice.findAll());
		return "owners/listing";
	}
}
