package com.sparta.grr.webclientapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Codes{

	@JsonProperty("ccg_id")
	private String ccgId;

	@JsonProperty("lau2")
	private String lau2;

	@JsonProperty("ced")
	private String ced;

	@JsonProperty("parliamentary_constituency_2024")
	private String parliamentaryConstituency2024;

	@JsonProperty("ccg")
	private String ccg;

	@JsonProperty("admin_ward")
	private String adminWard;

	@JsonProperty("parliamentary_constituency")
	private String parliamentaryConstituency;

	@JsonProperty("admin_county")
	private String adminCounty;

	@JsonProperty("pfa")
	private String pfa;

	@JsonProperty("admin_district")
	private String adminDistrict;

	@JsonProperty("lsoa")
	private String lsoa;

	@JsonProperty("msoa")
	private String msoa;

	@JsonProperty("nuts")
	private String nuts;

	@JsonProperty("parish")
	private String parish;

	public void setCcgId(String ccgId){
		this.ccgId = ccgId;
	}

	public String getCcgId(){
		return ccgId;
	}

	public void setLau2(String lau2){
		this.lau2 = lau2;
	}

	public String getLau2(){
		return lau2;
	}

	public void setCed(String ced){
		this.ced = ced;
	}

	public String getCed(){
		return ced;
	}

	public void setParliamentaryConstituency2024(String parliamentaryConstituency2024){
		this.parliamentaryConstituency2024 = parliamentaryConstituency2024;
	}

	public String getParliamentaryConstituency2024(){
		return parliamentaryConstituency2024;
	}

	public void setCcg(String ccg){
		this.ccg = ccg;
	}

	public String getCcg(){
		return ccg;
	}

	public void setAdminWard(String adminWard){
		this.adminWard = adminWard;
	}

	public String getAdminWard(){
		return adminWard;
	}

	public void setParliamentaryConstituency(String parliamentaryConstituency){
		this.parliamentaryConstituency = parliamentaryConstituency;
	}

	public String getParliamentaryConstituency(){
		return parliamentaryConstituency;
	}

	public void setAdminCounty(String adminCounty){
		this.adminCounty = adminCounty;
	}

	public String getAdminCounty(){
		return adminCounty;
	}

	public void setPfa(String pfa){
		this.pfa = pfa;
	}

	public String getPfa(){
		return pfa;
	}

	public void setAdminDistrict(String adminDistrict){
		this.adminDistrict = adminDistrict;
	}

	public String getAdminDistrict(){
		return adminDistrict;
	}

	public void setLsoa(String lsoa){
		this.lsoa = lsoa;
	}

	public String getLsoa(){
		return lsoa;
	}

	public void setMsoa(String msoa){
		this.msoa = msoa;
	}

	public String getMsoa(){
		return msoa;
	}

	public void setNuts(String nuts){
		this.nuts = nuts;
	}

	public String getNuts(){
		return nuts;
	}

	public void setParish(String parish){
		this.parish = parish;
	}

	public String getParish(){
		return parish;
	}

	@Override
 	public String toString(){
		return 
			"Codes{" + 
			"ccg_id = '" + ccgId + '\'' + 
			",lau2 = '" + lau2 + '\'' + 
			",ced = '" + ced + '\'' + 
			",parliamentary_constituency_2024 = '" + parliamentaryConstituency2024 + '\'' + 
			",ccg = '" + ccg + '\'' + 
			",admin_ward = '" + adminWard + '\'' + 
			",parliamentary_constituency = '" + parliamentaryConstituency + '\'' + 
			",admin_county = '" + adminCounty + '\'' + 
			",pfa = '" + pfa + '\'' + 
			",admin_district = '" + adminDistrict + '\'' + 
			",lsoa = '" + lsoa + '\'' + 
			",msoa = '" + msoa + '\'' + 
			",nuts = '" + nuts + '\'' + 
			",parish = '" + parish + '\'' + 
			"}";
		}
}