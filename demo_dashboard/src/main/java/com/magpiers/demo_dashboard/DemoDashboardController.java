package com.magpiers.demo_dashboard;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.magpiers.demo_dashboard.entity.Component;
import com.magpiers.demo_dashboard.entity.Screen;
import com.magpiers.demo_dashboard.entity.Section;
import com.magpiers.demo_dashboard.repository.ComponentRepository;
import com.magpiers.demo_dashboard.repository.ScreenRepository;
import com.magpiers.demo_dashboard.repository.SectionRepository;

@RestController
@RequestMapping(value ="/magpiers")
public class DemoDashboardController {
	@Autowired
    private ComponentRepository componentrepository;
	@Autowired
	private ScreenRepository screenrepository;
	@Autowired
	private SectionRepository sectionrepository;
	
	@PostMapping("/components/add")
	public Component addComponent(@Valid @RequestBody Component component) {
		componentrepository.save(component);
		return component;
	}
	
	@GetMapping("/components/list")
	public List<Component> getallComponents(){
		List<Component> components = this.componentrepository.findAll();
		return components;
	}
	
	@GetMapping("/{userid}/components")
	public List<Screen> getall(@RequestParam(required = false,name ="userid") String userId){
		List<Screen> screens =	this.screenrepository.findAll();
		return screens;
	}
	
	@GetMapping("/{userid}/sections")
	public List<Section> getallSections(@RequestParam(required = false,name ="userid") String userId){
		
		List<Section> sections = this.sectionrepository.findAll();
		return sections;
	}
	

}
