package com.conversion.controller;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conversion.model.alarmAdditionalInformation;
import com.conversion.model.commonEventHeader;
import com.conversion.model.event;
import com.conversion.model.faultFields;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

@RestController
public class ConversionController {

	@Autowired
	private commonEventHeader handler;
	
	@Autowired
	private faultFields fields;
	
	@Autowired
	private event e;
	
	@Autowired
	private alarmAdditionalInformation alarm;
	
	@RequestMapping("/convert")
	public event doConvert() throws Exception {
		JsonNode start = getRootNode();
		handler.setEventName("fault_"+start.path("cambria.partition").textValue()+"_"+start.path("trap category").textValue());
		String epoch =start.path("time received").textValue();
		handler.setLastEpochMicrosec(epoch.charAt(0)+"."+epoch.substring(2)+"E"+(epoch.length()-1));
		handler.setStartEpochMicrosec(epoch.charAt(0)+"."+epoch.substring(2)+"E"+(epoch.length()-1));
		
		fields.setAlarmCondition(start.path("trap category").textValue());
		
		 List<alarmAdditionalInformation> alarmAdditionalInformation = setInnerElements();
		fields.setAlarmAdditionalInformation(alarmAdditionalInformation);
		e.setEvent(handler);
		e.setFaultFields(fields);
		
		return e;
		
	}
	
	public JsonNode getRootNode() throws JsonProcessingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		return obj.readTree(new File("F://input1.json"));
	}
	public List<alarmAdditionalInformation> setInnerElements() throws JsonProcessingException, IOException {
		JsonNode start = getRootNode();
		ArrayNode varbinds = (ArrayNode) start.get("varbinds");
		Iterator<JsonNode> it = varbinds.elements();
		List <alarmAdditionalInformation> insideArray = new ArrayList<>();
		while(it.hasNext()) {
			JsonNode json = it.next();
			alarm.setName(json.path("varbind_oid").textValue());
			alarm.setValue(json.path("varbind_value").textValue());
			insideArray.add(alarm);
			
		}
		return insideArray;
	
	}
}
