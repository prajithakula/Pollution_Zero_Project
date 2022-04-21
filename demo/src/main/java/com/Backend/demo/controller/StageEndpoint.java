package com.rentbyke.demo.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndpoint {

    Map<String,Stage> stageMap = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Stage> getAllStageMap(){
        return stageMap;
    }
    @ReadOperation
    public Stage getStageMap(@Selector String name){
        return stageMap.get(name);
    }
    @WriteOperation
    public void setValue(@Selector String name,Stage stage){
        stageMap.put(name,stage);
    }


    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }


    }
}
