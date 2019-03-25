package com.magpiers.demo_dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.magpiers.demo_dashboard.entity.Component;
import com.magpiers.demo_dashboard.entity.Screen;
import com.magpiers.demo_dashboard.entity.Section;
import com.magpiers.demo_dashboard.repository.ComponentRepository;
import com.magpiers.demo_dashboard.repository.ScreenRepository;
import com.magpiers.demo_dashboard.repository.SectionRepository;

@Service
public class SampleService implements CommandLineRunner{
	
	private ScreenRepository screenrepository;
	private SectionRepository sectionrepository;
	private ComponentRepository componentrepository;
	
	

	public SampleService(ScreenRepository screenrepository,SectionRepository sectionRepository,ComponentRepository componentrepository) {
		super();
		this.screenrepository = screenrepository;
		this.sectionrepository = sectionRepository;
		this.componentrepository = componentrepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Screen scrn1 = new Screen("1","CustomerPage");
		Screen scrn2 = new Screen("2","DealerPage");
		
		Section sec1 = new Section("1","Profile");
		Section sec2= new Section("2","Invoice");
		
		Component cmp1=new Component("1","UserName","Text");
		Component cmp2=new Component("2","Address","Text");
		
		
		List<Screen> screens = new ArrayList<Screen>();
		screens.add(scrn1);
		screens.add(scrn2);
		this.screenrepository.saveAll(screens);
		
		List<Section> sections = new ArrayList<Section>();
		sections.add(sec1);
		sections.add(sec2);
		this.sectionrepository.saveAll(sections);
		
		List<Component> components = new ArrayList<Component>();
		components.add(cmp1);
		components.add(cmp2);
		this.componentrepository.saveAll(components);
		
	}
	
	

}
