package com.zyc.guitar.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zyc.guitar.pojo.Guitar;
import com.zyc.guitar.pojo.spec.GuitarSpec;

@Component("inventory")
public class Inventory {
	
	public List<Guitar> search(GuitarSpec searchSpec,List<Guitar> guitars) { 
		List<Guitar> matchingGuitars = new LinkedList<Guitar>(); 
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) { 
			Guitar guitar = i.next();
			if(guitar.getSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}
			 
		} 
		return matchingGuitars; 
	}
}
