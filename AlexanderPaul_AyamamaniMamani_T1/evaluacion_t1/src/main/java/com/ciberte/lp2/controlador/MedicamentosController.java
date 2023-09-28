package com.ciberte.lp2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciberte.lp2.entidades.Medicamentos;
import com.ciberte.lp2.repositorio.IMedicamentosRepositorio;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentosController {
	@Autowired
	private IMedicamentosRepositorio medicamentoRepositorio;
	
	@GetMapping("/")
	public String listarMedicamentos(Model model) {
		List<Medicamentos> medicamentos = medicamentoRepositorio.findAll();
		model.addAttribute("medicamentos", medicamentos);
		return "listarmedicamentos";
	}
	
	@GetMapping("/nuevo")
	public String nuevoMedicamento(Model model) {
		model.addAttribute("medicamentos", new Medicamentos());
		return "nuevo";
	}

	@PostMapping("/guardar")
	public String guardarlibro(@ModelAttribute Medicamentos medicamentos) {
		medicamentoRepositorio.save(medicamentos);
		return "redirect:/medicamentos/";
	}
}
