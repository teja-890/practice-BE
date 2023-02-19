package com.example.demo.vinModel;

import java.util.List;



import javax.annotation.Generated;



import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("jsonschema2pojo")
public class ZipCode {
    
    @JsonProperty("Result")
    private List<String> Result;
    
    @JsonProperty("Result")
    public List<String> getResult() {
        return Result;
    }



   @JsonProperty("Result")
    public void setResult(List<String> result){
        Result = result;
    }
    
    public String[] extractZip() {
        List<String> res = this.getResult();
        String takeFirstLoc = res.get(0);
        return takeFirstLoc.split(", ");
    }
}