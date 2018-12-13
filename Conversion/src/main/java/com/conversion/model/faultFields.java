package com.conversion.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class faultFields {

	private String alarmCondition;
	private final String eventSeverity = "MINOR";
	private final String eventSourceType = "SNMP Agent";
	private final String faultFieldsVersion = "2.0";
	

	private final String specificProblem = "SNMP Fault";
	private final String vfStatus = "Active";
	private List<alarmAdditionalInformation> alarmAdditionalInformation;
	public String getAlarmCondition() {
		return alarmCondition;
	}
	public void setAlarmCondition(String alarmCondition) {
		this.alarmCondition = alarmCondition;
	}
	public String getEventSeverity() {
		return eventSeverity;
	}
	
	public String getEventSourceType() {
		return eventSourceType;
	}
	
	public String getFaultFieldsVersion() {
		return faultFieldsVersion;
	}
	
	public String getSpecificProblem() {
		return specificProblem;
	}
	
	public String getVfStatus() {
		return vfStatus;
	}
	public List<alarmAdditionalInformation> getAlarmAdditionalInformation() {
		return alarmAdditionalInformation;
	}
	public void setAlarmAdditionalInformation(List<alarmAdditionalInformation> alarmAdditionalInformation) {
		this.alarmAdditionalInformation = alarmAdditionalInformation;
	}
	
	
	
}
