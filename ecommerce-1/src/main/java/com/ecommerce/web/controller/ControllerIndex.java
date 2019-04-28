package com.ecommerce.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ecommerce.model.Familia;
@Controller
@RequestMapping("/ecommerce")
public class ControllerIndex {
	public List<Familia> getFamilia(){
		ArrayList<Familia> familias = new ArrayList<>();
		familias.add(new Familia("img/computadora.jpg","Laptops"));
	    familias.add(new Familia("img/computadoraescritorio.jpg","Computadoras"));
	    familias.add(new Familia("img/teclado.jpg","Teclados"));
	    familias.add(new Familia("img/mousse.jpg","Ratones"));
	    familias.add(new Familia("img/ipad.jpg","Ipads"));
		familias.add(new Familia("img/ipod.jpg","Ipods"));
		familias.add(new Familia("img/parlante.jpg","Parlantes"));
		familias.add(new Familia("img/television.jpg","Televisiones"));
		familias.add(new Familia("img/cable.jpg","Cables"));
		
	    return familias;
	}
	@GetMapping()
	public String menu(Model model) {
			model.addAttribute("familias",this.getFamilia());
		return "inicio";
	}
	
	


}
