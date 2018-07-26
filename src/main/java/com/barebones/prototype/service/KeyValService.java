package com.barebones.prototype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barebones.prototype.repository.KeyvalRepository;

@Service
public class KeyValService {

	@Autowired
	KeyvalRepository keyvalRepository;
	
	
	public String getKeyval(String key) {
		return key;
		
	}
	
	
}
