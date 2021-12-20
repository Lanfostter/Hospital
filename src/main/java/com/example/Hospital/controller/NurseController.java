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
import com.example.Hospital.entity.NurseEntity;
import com.example.Hospital.repository.DoctorRepository;
import com.example.Hospital.repository.NurseRepository;

@Controller
@RequestMapping("/nurse")
public class NurseController {
	@Autowired
	NurseRepository nurseRepository;

	@GetMapping("/list")
	public String listDoctor(Model model) {
		model.addAttribute("nurses", nurseRepository.findAll());
		return "nurse/list_nurse";
	}

	@GetMapping("/add")
	public String addDoctor(Model model) {
		model.addAttribute("nurse", new NurseEntity());
		return "nurse/add_nurse";
	}

	@PostMapping("/add")
	public String addDoctor(@ModelAttribute("nurse") NurseEntity nurseEntity, @RequestParam("bdate") String birthday)
			throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		nurseEntity.setBirthday(simpleDateFormat.parse(birthday));
		nurseRepository.save(nurseEntity);
		return "redirect:/nurse/list";
	}

	@GetMapping("/delete")
	public String deleteDoctor(@RequestParam("id") int id) {
		nurseRepository.deleteById(id);
		return "redirect:/nurse/list";
	}

	@GetMapping("/update")
	public String updateDoctor(Model model, @RequestParam("id") int id) {
		model.addAttribute("newNurse", nurseRepository.findById(id));
		return "nurse/update_nurse";
	}

	@PostMapping("/update")
	public String updateDoctor(@ModelAttribute("newDoctor") NurseEntity nurseEntity,
			@RequestParam("bdate") String birthday) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		nurseEntity.setBirthday(simpleDateFormat.parse(birthday));
		nurseRepository.save(nurseEntity);
		return "redirect:/nurse/list";
	}

	@GetMapping("/search")
	public String searchDoctor(Model model, @RequestParam("name") String name) {
		if (name == "") {
			return "redirect:/nurse/list";
		} else {
			model.addAttribute("nurses", nurseRepository.getbyname(name));
			return "nurse/list_nurse";
		}
	}
}
