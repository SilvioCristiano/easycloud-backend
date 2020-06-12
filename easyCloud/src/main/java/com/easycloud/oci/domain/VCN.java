package com.easycloud.oci.domain;

public class VCN {
	
	public String display_name;
	public String cidr_block;
	public String compartment_id;
	public String dns_label;
	
	
	
	public VCN(String display_name, String cidr_block, String compartment_id, String dns_label) {
		super();
		this.display_name = display_name;
		this.cidr_block = cidr_block;
		this.compartment_id = compartment_id;
		this.dns_label = dns_label;
	}
	
	
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getCidr_block() {
		return cidr_block;
	}
	public void setCidr_block(String cidr_block) {
		this.cidr_block = cidr_block;
	}
	public String getCompartment_id() {
		return compartment_id;
	}
	public void setCompartment_id(String compartment_id) {
		this.compartment_id = compartment_id;
	}
	public String getDns_label() {
		return dns_label;
	}
	public void setDns_label(String dns_label) {
		this.dns_label = dns_label;
	}


	@Override
	public String toString() {
		return "VCN [display_name=" + display_name + ", cidr_block=" + cidr_block + ", compartment_id=" + compartment_id
				+ ", dns_label=" + dns_label + "]";
	}
	
	

}
