 package com.example.Hospital.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Hospital.entity.DoctorEntity;
import com.example.Hospital.repository.DoctorRepository;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorRepository doctorRepository;

	@GetMapping("/list")
	public String listDoctor(Model model) {
		model.addAttribute("doctors", doctorRepository.findAll());
		return "doctor/list_doctor";
	}

	@GetMapping("/add")
	public String addDoctor(Model model) {
		model.addAttribute("doctor", new DoctorEntity());
		return "doctor/add_doctor";
	}

	@PostMapping("/add")
	public String addDoctor(@ModelAttribute("doctor") DoctorEntity doctorEntity, 
			@RequestParam("bdate") String birthday)
			throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		doctorEntity.setBirthday(simpleDateFormat.parse(birthday));
		doctorRepository.save(doctorEntity);
		return "redirect:/list";
	}

	@GetMapping("/delete")
	public String deleteDoctor(@RequestParam("id") int id) {
		doctorRepository.deleteById(id);
		return "redirect:/doctor/list";
	}

	@GetMapping("/update")
	public String updateDoctor(Model model, @RequestParam("id") int id) {
		model.addAttribute("newDoctor", doctorRepository.findById(id));
		return "doctor/update_doctor";
	}

	@PostMapping("/update")
	public String updateDoctor(@ModelAttribute("newDoctor") DoctorEntity doctorEntity,
			@RequestParam("bdate") String birthday) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		doctorEntity.setBirthday(simpleDateFormat.parse(birthday));
		doctorRepository.save(doctorEntity);
		return "redirect:/doctor/list";
	}
	@GetMapping("/search")
	public String searchDoctor(Model model, @RequestParam("name") String name ) {
		if (name == "") {
			return "redirect:/doctor/list";
		} else {
			model.addAttribute("doctors", doctorRepository.getbyname(name));
			return "doctor/list_doctor";
		}
	} 
}
