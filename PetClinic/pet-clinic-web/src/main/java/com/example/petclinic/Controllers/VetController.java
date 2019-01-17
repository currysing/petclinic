package com.example.petclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping({ "/vets", "/vets/" })
	public String VetIndex() {

		return "vets/index";
	}
}
