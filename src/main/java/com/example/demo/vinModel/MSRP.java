package com.example.demo.vinModel;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "unit"
})
@Generated("jsonschema2pojo")
public class MSRP {
    
    @JsonProperty("value")
    private String value;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



   @JsonProperty("value")
    public String getValue() {
        return value;
    }



   @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }



   @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }



   @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }



   @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }



   @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}