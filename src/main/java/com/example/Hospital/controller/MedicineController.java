package com.example.Hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Hospital.repository.MedicineRepository;

@Controller
@RequestMapping("/medicine")
public class MedicineController {
	@Autowired
	MedicineRepository medicineRepository;
	@GetMapping("/list")
	public String listMedicine(Model model) {
		model.addAttribute("medicines", medicineRepository.findAll());
		return "medicine/list_medicine";
	}

}
