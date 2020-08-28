package jl.forthem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jl.forthem.model.Entry;
import jl.forthem.repository.EntryRepository;

@RestController
public class EntryController {
	
	@Autowired
	EntryRepository entryRepository;
	
	@GetMapping("/entries")
	public List<Entry> getEntries(){
		return entryRepository.findAll();
	}

}
