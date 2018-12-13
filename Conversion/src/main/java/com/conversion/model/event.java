package com.conversion.model;

import org.springframework.stereotype.Component;

@Component
public class event {
	
	private commonEventHeader event;
	private faultFields faultFields;
	
	public commonEventHeader getEvent() {
		return event;
	}
	public void setEvent(commonEventHeader event) {
		this.event = event;
	}
	public faultFields getFaultFields() {
		return faultFields;
	}
	public void setFaultFields(faultFields faultFields) {
		this.faultFields = faultFields;
	}
	
	
	

}
