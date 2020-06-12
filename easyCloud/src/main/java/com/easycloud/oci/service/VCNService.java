package com.easycloud.oci.service;


import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.easycloud.oci.domain.VCN;



@Service
public class VCNService {



	public VCN insert(VCN obj) throws IOException {
		OutputStream bytes = new FileOutputStream("C://easyoci/saida.tf", true); // passado "true" para gravar no mesmo arquivo
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);

		strings.write("resource"+"'oci_core_virtual_network'"+ "'test_vcn'" + "{\n");
		strings.write("cidr_block "+obj.cidr_block);
		strings.write("compartment_id "+obj.compartment_id);
		strings.write("display_name "+obj.display_name);
		strings.write("dns_label "+obj.dns_label);
		strings.write("}");
		strings.close();

		return obj;
	}


}
