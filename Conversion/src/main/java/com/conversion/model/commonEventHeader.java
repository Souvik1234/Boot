package com.conversion.model;

import org.springframework.stereotype.Component;

@Component
public class commonEventHeader {

	private final String domain = "fault";
	private final String eventId = "XXXX";
	private String eventName;
	private String lastEpochMicrosec;
	private final String priority = "Medium";
	private final String reportingEntityName = "VesAdapter";
	private final String sequence = "0";
	private final String sourceName = "VesAdapter";
	private String startEpochMicrosec;
	private final String version = "3.0";
	
	public String getDomain() {
		return domain;
	}
	
	public String getEventId() {
		return eventId;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getLastEpochMicrosec() {
		return lastEpochMicrosec;
	}
	public void setLastEpochMicrosec(String lastEpochMicrosec) {
		this.lastEpochMicrosec = lastEpochMicrosec;
	}
	public String getPriority() {
		return priority;
	}
	
	public String getReportingEntityName() {
		return reportingEntityName;
	}
	
	public String getSequence() {
		return sequence;
	}
	
	public String getSourceName() {
		return sourceName;
	}
	
	public String getStartEpochMicrosec() {
		return startEpochMicrosec;
	}
	public void setStartEpochMicrosec(String startEpochMicrosec) {
		this.startEpochMicrosec = startEpochMicrosec;
	}
	public String getVersion() {
		return version;
	}
	
	
	
}
