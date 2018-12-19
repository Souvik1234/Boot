package com.traverse.traverse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class Controller {

    private JsonNode rootNode;
    private ObjectMapper mapper =new ObjectMapper();
    @RequestMapping("/convert")
    public void doConvert(@RequestBody JsonNode node) throws Exception{

        getValidatedNode(node);

    }
    public void getValidatedNode(JsonNode node){

        Map<String,Object> map = mapper.convertValue(node,Map.class);

        JsonNode innerNode;
        for (String key: map.keySet()){
        	
        

            if(map.get(key) instanceof Map){

                 innerNode = node.path(key);

                getValidatedNode(innerNode);
            }
             if(map.get(key) instanceof ArrayList){
                 ArrayList<Object> list= mapper.convertValue(map.get(key),ArrayList.class);

                 for(Object ob:list )
                 {
                     if(ob instanceof Map)
                     {
                         JsonNode node1 = mapper.convertValue(ob,JsonNode.class);
                         getValidatedNode(node1);

                     }

                     if(ob instanceof String||ob instanceof Integer || ob instanceof Double || ob instanceof Boolean )
                     {
                         System.out.println(key+"-->"+ob);
                     }
                 }

            }

           if(map.get(key) instanceof String ||map.get(key) instanceof Integer ||map.get(key) instanceof Double||map.get(key)instanceof Boolean  ){
                System.out.println(key+"-->"+map.get(key));
            }
        }



    }
}
