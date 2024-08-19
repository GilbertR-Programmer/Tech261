package com.sparta.grr.webclientapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result{

	@JsonProperty("country")
	private String country;

	@JsonProperty("codes")
	private Codes codes;

	@JsonProperty("ced")
	private Object ced;

	@JsonProperty("parliamentary_constituency_2024")
	private String parliamentaryConstituency2024;

	@JsonProperty("ccg")
	private String ccg;

	@JsonProperty("latitude")
	private Double latitude;

	@JsonProperty("admin_county")
	private Object adminCounty;

	@JsonProperty("msoa")
	private String msoa;

	@JsonProperty("primary_care_trust")
	private String primaryCareTrust;

	@JsonProperty("parish")
	private Object parish;

	@JsonProperty("nhs_ha")
	private String nhsHa;

	@JsonProperty("date_of_introduction")
	private String dateOfIntroduction;

	@JsonProperty("longitude")
	private Double longitude;

	@JsonProperty("postcode")
	private String postcode;

	@JsonProperty("european_electoral_region")
	private String europeanElectoralRegion;

	@JsonProperty("parliamentary_constituency")
	private String parliamentaryConstituency;

	@JsonProperty("admin_ward")
	private String adminWard;

	@JsonProperty("eastings")
	private Integer eastings;

	@JsonProperty("pfa")
	private String pfa;

	@JsonProperty("lsoa")
	private String lsoa;

	@JsonProperty("admin_district")
	private String adminDistrict;

	@JsonProperty("quality")
	private Integer quality;

	@JsonProperty("nuts")
	private String nuts;

	@JsonProperty("outcode")
	private String outcode;

	@JsonProperty("northings")
	private Integer northings;

	@JsonProperty("incode")
	private String incode;

	@JsonProperty("region")
	private Object region;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCodes(Codes codes){
		this.codes = codes;
	}

	public Codes getCodes(){
		return codes;
	}

	public void setCed(Object ced){
		this.ced = ced;
	}

	public Object getCed(){
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

	public void setLatitude(Double latitude){
		this.latitude = latitude;
	}

	public Double getLatitude(){
		return latitude;
	}

	public void setAdminCounty(Object adminCounty){
		this.adminCounty = adminCounty;
	}

	public Object getAdminCounty(){
		return adminCounty;
	}

	public void setMsoa(String msoa){
		this.msoa = msoa;
	}

	public String getMsoa(){
		return msoa;
	}

	public void setPrimaryCareTrust(String primaryCareTrust){
		this.primaryCareTrust = primaryCareTrust;
	}

	public String getPrimaryCareTrust(){
		return primaryCareTrust;
	}

	public void setParish(Object parish){
		this.parish = parish;
	}

	public Object getParish(){
		return parish;
	}

	public void setNhsHa(String nhsHa){
		this.nhsHa = nhsHa;
	}

	public String getNhsHa(){
		return nhsHa;
	}

	public void setDateOfIntroduction(String dateOfIntroduction){
		this.dateOfIntroduction = dateOfIntroduction;
	}

	public String getDateOfIntroduction(){
		return dateOfIntroduction;
	}

	public void setLongitude(Double longitude){
		this.longitude = longitude;
	}

	public Double getLongitude(){
		return longitude;
	}

	public void setPostcode(String postcode){
		this.postcode = postcode;
	}

	public String getPostcode(){
		return postcode;
	}

	public void setEuropeanElectoralRegion(String europeanElectoralRegion){
		this.europeanElectoralRegion = europeanElectoralRegion;
	}

	public String getEuropeanElectoralRegion(){
		return europeanElectoralRegion;
	}

	public void setParliamentaryConstituency(String parliamentaryConstituency){
		this.parliamentaryConstituency = parliamentaryConstituency;
	}

	public String getParliamentaryConstituency(){
		return parliamentaryConstituency;
	}

	public void setAdminWard(String adminWard){
		this.adminWard = adminWard;
	}

	public String getAdminWard(){
		return adminWard;
	}

	public void setEastings(Integer eastings){
		this.eastings = eastings;
	}

	public Integer getEastings(){
		return eastings;
	}

	public void setPfa(String pfa){
		this.pfa = pfa;
	}

	public String getPfa(){
		return pfa;
	}

	public void setLsoa(String lsoa){
		this.lsoa = lsoa;
	}

	public String getLsoa(){
		return lsoa;
	}

	public void setAdminDistrict(String adminDistrict){
		this.adminDistrict = adminDistrict;
	}

	public String getAdminDistrict(){
		return adminDistrict;
	}

	public void setQuality(Integer quality){
		this.quality = quality;
	}

	public Integer getQuality(){
		return quality;
	}

	public void setNuts(String nuts){
		this.nuts = nuts;
	}

	public String getNuts(){
		return nuts;
	}

	public void setOutcode(String outcode){
		this.outcode = outcode;
	}

	public String getOutcode(){
		return outcode;
	}

	public void setNorthings(Integer northings){
		this.northings = northings;
	}

	public Integer getNorthings(){
		return northings;
	}

	public void setIncode(String incode){
		this.incode = incode;
	}

	public String getIncode(){
		return incode;
	}

	public void setRegion(Object region){
		this.region = region;
	}

	public Object getRegion(){
		return region;
	}

	@Override
 	public String toString(){
		return 
			"Result{" + 
			"country = '" + country + '\'' + 
			",codes = '" + codes + '\'' + 
			",ced = '" + ced + '\'' + 
			",parliamentary_constituency_2024 = '" + parliamentaryConstituency2024 + '\'' + 
			",ccg = '" + ccg + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",admin_county = '" + adminCounty + '\'' + 
			",msoa = '" + msoa + '\'' + 
			",primary_care_trust = '" + primaryCareTrust + '\'' + 
			",parish = '" + parish + '\'' + 
			",nhs_ha = '" + nhsHa + '\'' + 
			",date_of_introduction = '" + dateOfIntroduction + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",postcode = '" + postcode + '\'' + 
			",european_electoral_region = '" + europeanElectoralRegion + '\'' + 
			",parliamentary_constituency = '" + parliamentaryConstituency + '\'' + 
			",admin_ward = '" + adminWard + '\'' + 
			",eastings = '" + eastings + '\'' + 
			",pfa = '" + pfa + '\'' + 
			",lsoa = '" + lsoa + '\'' + 
			",admin_district = '" + adminDistrict + '\'' + 
			",quality = '" + quality + '\'' + 
			",nuts = '" + nuts + '\'' + 
			",outcode = '" + outcode + '\'' + 
			",northings = '" + northings + '\'' + 
			",incode = '" + incode + '\'' + 
			",region = '" + region + '\'' + 
			"}";
		}
}