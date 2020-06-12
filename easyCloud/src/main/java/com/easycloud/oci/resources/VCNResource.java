package com.easycloud.oci.resources;
import java.io.IOException;
import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.easycloud.oci.domain.VCN;
import com.easycloud.oci.service.VCNService;



@Controller
@RestController
@RequestMapping(value="/vcns")
public class VCNResource {
	
	@Autowired
	private VCNService service;

	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<VCN> insert(@Valid @RequestBody VCN obj) throws IOException {
		obj = service.insert(obj);
		URI url = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{getCompartment_id}").buildAndExpand(obj.getCompartment_id()).toUri();
		return ResponseEntity.created(url).build();
	}
	
}
