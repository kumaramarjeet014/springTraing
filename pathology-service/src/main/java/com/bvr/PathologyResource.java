package com.bvr;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(
			new Disease("D1", "Asthama", "Warm water bath"),
			new Disease("D2", "Headache", "Hot Water vapour"),
			new Disease("D3", "Corona", "Wash hands and stay home")
			);
	
	@RequestMapping("/diseases")
	public DiseaseList getdiseases() {
		DiseaseList diseaseList = new DiseaseList();
		
		diseaseList.setDiseases(diseases);
		return diseaseList;
	}
	
	@RequestMapping("/diseases/{id}")
	public Disease getdiseasesById(@PathVariable("id") String id) {
		Disease disease = diseases.stream()
				.filter(d -> d.getId().equals(id))
				.findAny().orElse(null);
		return disease;
	}

}
