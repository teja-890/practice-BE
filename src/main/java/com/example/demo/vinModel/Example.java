
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
    "Report_Type",
    "VIN",
    "Status",
    "Vehicle_ID",
    "Model_Year",
    "Make",
    "Model",
    "Trim_Level",
    "Manufactured_in",
    "Production_Seq._Number",
    "Body_Style",
    "Engine_Type",
    "Engine_Displacement",
    "Engine_Shape",
    "Fuel_Type",
    "Transmission-short",
    "Transmission-long",
    "Driveline",
    "Tank",
    "Fuel_Economy-city",
    "Fuel_Economy-highway",
    "Anti-Brake_System",
    "Steering_Type",
    "Curb_Weight-automatic",
    "Curb_Weight-manual",
    "Vehicle_Type",
    "GVWR_Class",
    "Standard_Seating",
    "Optional_Seating",
    "Length",
    "Width",
    "Height"
})
@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("Report_Type")
    private String reportType;
    @JsonProperty("VIN")
    private String vin;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("Vehicle_ID")
    private VehicleID vehicleID;
    @JsonProperty("Model_Year")
    private ModelYear modelYear;
    @JsonProperty("Make")
    private Make make;
    @JsonProperty("Model")
    private Model model;
    @JsonProperty("Trim_Level")
    private TrimLevel trimLevel;
    @JsonProperty("Manufactured_in")
    private ManufacturedIn manufacturedIn;
    @JsonProperty("Production_Seq._Number")
    private ProductionSeqNumber productionSeqNumber;
    @JsonProperty("Body_Style")
    private BodyStyle bodyStyle;
    @JsonProperty("Engine_Type")
    private EngineType engineType;
    @JsonProperty("Engine_Displacement")
    private EngineDisplacement engineDisplacement;
    @JsonProperty("Engine_Shape")
    private EngineShape engineShape;
    @JsonProperty("Fuel_Type")
    private FuelType fuelType;
    @JsonProperty("Transmission-short")
    private TransmissionShort transmissionShort;
    @JsonProperty("Transmission-long")
    private TransmissionLong transmissionLong;
    @JsonProperty("Driveline")
    private Driveline driveline;
    @JsonProperty("Tank")
    private Tank tank;
    @JsonProperty("Fuel_Economy-city")
    private FuelEconomyCity fuelEconomyCity;
    @JsonProperty("Fuel_Economy-highway")
    private FuelEconomyHighway fuelEconomyHighway;
    @JsonProperty("Anti-Brake_System")
    private AntiBrakeSystem antiBrakeSystem;
    @JsonProperty("Steering_Type")
    private SteeringType steeringType;
    @JsonProperty("Curb_Weight-automatic")
    private CurbWeightAutomatic curbWeightAutomatic;
    @JsonProperty("Curb_Weight-manual")
    private CurbWeightManual curbWeightManual;
    @JsonProperty("Vehicle_Type")
    private VehicleType vehicleType;
    @JsonProperty("GVWR_Class")
    private GVWRClass gVWRClass;
    @JsonProperty("Standard_Seating")
    private StandardSeating standardSeating;
    @JsonProperty("Optional_Seating")
    private OptionalSeating optionalSeating;
    @JsonProperty("Length")
    private Length length;
    @JsonProperty("Width")
    private Width width;
    @JsonProperty("Height")
    private Height height;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("MSRP")
    private MSRP msrPrice;

    @JsonProperty("Report_Type")
    public String getReportType() {
        return reportType;
    }

    @JsonProperty("Report_Type")
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @JsonProperty("VIN")
    public String getVin() {
        return vin;
    }

    @JsonProperty("VIN")
    public void setVin(String vin) {
        this.vin = vin;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("Vehicle_ID")
    public VehicleID getVehicleID() {
        return vehicleID;
    }

    @JsonProperty("Vehicle_ID")
    public void setVehicleID(VehicleID vehicleID) {
        this.vehicleID = vehicleID;
    }

    @JsonProperty("Model_Year")
    public ModelYear getModelYear() {
        return modelYear;
    }

    @JsonProperty("Model_Year")
    public void setModelYear(ModelYear modelYear) {
        this.modelYear = modelYear;
    }

    @JsonProperty("Make")
    public Make getMake() {
        return make;
    }

    @JsonProperty("Make")
    public void setMake(Make make) {
        this.make = make;
    }

    @JsonProperty("Model")
    public Model getModel() {
        return model;
    }

    @JsonProperty("Model")
    public void setModel(Model model) {
        this.model = model;
    }

    @JsonProperty("Trim_Level")
    public TrimLevel getTrimLevel() {
        return trimLevel;
    }

    @JsonProperty("Trim_Level")
    public void setTrimLevel(TrimLevel trimLevel) {
        this.trimLevel = trimLevel;
    }

    @JsonProperty("Manufactured_in")
    public ManufacturedIn getManufacturedIn() {
        return manufacturedIn;
    }

    @JsonProperty("Manufactured_in")
    public void setManufacturedIn(ManufacturedIn manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }

    @JsonProperty("Production_Seq._Number")
    public ProductionSeqNumber getProductionSeqNumber() {
        return productionSeqNumber;
    }

    @JsonProperty("Production_Seq._Number")
    public void setProductionSeqNumber(ProductionSeqNumber productionSeqNumber) {
        this.productionSeqNumber = productionSeqNumber;
    }

    @JsonProperty("Body_Style")
    public BodyStyle getBodyStyle() {
        return bodyStyle;
    }

    @JsonProperty("Body_Style")
    public void setBodyStyle(BodyStyle bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    @JsonProperty("Engine_Type")
    public EngineType getEngineType() {
        return engineType;
    }

    @JsonProperty("Engine_Type")
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @JsonProperty("Engine_Displacement")
    public EngineDisplacement getEngineDisplacement() {
        return engineDisplacement;
    }

    @JsonProperty("Engine_Displacement")
    public void setEngineDisplacement(EngineDisplacement engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @JsonProperty("Engine_Shape")
    public EngineShape getEngineShape() {
        return engineShape;
    }

    @JsonProperty("Engine_Shape")
    public void setEngineShape(EngineShape engineShape) {
        this.engineShape = engineShape;
    }

    @JsonProperty("Fuel_Type")
    public FuelType getFuelType() {
        return fuelType;
    }

    @JsonProperty("Fuel_Type")
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @JsonProperty("Transmission-short")
    public TransmissionShort getTransmissionShort() {
        return transmissionShort;
    }

    @JsonProperty("Transmission-short")
    public void setTransmissionShort(TransmissionShort transmissionShort) {
        this.transmissionShort = transmissionShort;
    }

    @JsonProperty("Transmission-long")
    public TransmissionLong getTransmissionLong() {
        return transmissionLong;
    }

    @JsonProperty("Transmission-long")
    public void setTransmissionLong(TransmissionLong transmissionLong) {
        this.transmissionLong = transmissionLong;
    }

    @JsonProperty("Driveline")
    public Driveline getDriveline() {
        return driveline;
    }

    @JsonProperty("Driveline")
    public void setDriveline(Driveline driveline) {
        this.driveline = driveline;
    }

    @JsonProperty("Tank")
    public Tank getTank() {
        return tank;
    }

    @JsonProperty("Tank")
    public void setTank(Tank tank) {
        this.tank = tank;
    }

    @JsonProperty("Fuel_Economy-city")
    public FuelEconomyCity getFuelEconomyCity() {
        return fuelEconomyCity;
    }

    @JsonProperty("Fuel_Economy-city")
    public void setFuelEconomyCity(FuelEconomyCity fuelEconomyCity) {
        this.fuelEconomyCity = fuelEconomyCity;
    }

    @JsonProperty("Fuel_Economy-highway")
    public FuelEconomyHighway getFuelEconomyHighway() {
        return fuelEconomyHighway;
    }

    @JsonProperty("Fuel_Economy-highway")
    public void setFuelEconomyHighway(FuelEconomyHighway fuelEconomyHighway) {
        this.fuelEconomyHighway = fuelEconomyHighway;
    }

    @JsonProperty("Anti-Brake_System")
    public AntiBrakeSystem getAntiBrakeSystem() {
        return antiBrakeSystem;
    }

    @JsonProperty("Anti-Brake_System")
    public void setAntiBrakeSystem(AntiBrakeSystem antiBrakeSystem) {
        this.antiBrakeSystem = antiBrakeSystem;
    }

    @JsonProperty("Steering_Type")
    public SteeringType getSteeringType() {
        return steeringType;
    }

    @JsonProperty("Steering_Type")
    public void setSteeringType(SteeringType steeringType) {
        this.steeringType = steeringType;
    }

    @JsonProperty("Curb_Weight-automatic")
    public CurbWeightAutomatic getCurbWeightAutomatic() {
        return curbWeightAutomatic;
    }

    @JsonProperty("Curb_Weight-automatic")
    public void setCurbWeightAutomatic(CurbWeightAutomatic curbWeightAutomatic) {
        this.curbWeightAutomatic = curbWeightAutomatic;
    }

    @JsonProperty("Curb_Weight-manual")
    public CurbWeightManual getCurbWeightManual() {
        return curbWeightManual;
    }

    @JsonProperty("Curb_Weight-manual")
    public void setCurbWeightManual(CurbWeightManual curbWeightManual) {
        this.curbWeightManual = curbWeightManual;
    }

    @JsonProperty("Vehicle_Type")
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @JsonProperty("Vehicle_Type")
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @JsonProperty("GVWR_Class")
    public GVWRClass getGVWRClass() {
        return gVWRClass;
    }

    @JsonProperty("GVWR_Class")
    public void setGVWRClass(GVWRClass gVWRClass) {
        this.gVWRClass = gVWRClass;
    }

    @JsonProperty("Standard_Seating")
    public StandardSeating getStandardSeating() {
        return standardSeating;
    }

    @JsonProperty("Standard_Seating")
    public void setStandardSeating(StandardSeating standardSeating) {
        this.standardSeating = standardSeating;
    }

    @JsonProperty("Optional_Seating")
    public OptionalSeating getOptionalSeating() {
        return optionalSeating;
    }

    @JsonProperty("Optional_Seating")
    public void setOptionalSeating(OptionalSeating optionalSeating) {
        this.optionalSeating = optionalSeating;
    }

    @JsonProperty("Length")
    public Length getLength() {
        return length;
    }

    @JsonProperty("Length")
    public void setLength(Length length) {
        this.length = length;
    }

    @JsonProperty("Width")
    public Width getWidth() {
        return width;
    }

    @JsonProperty("Width")
    public void setWidth(Width width) {
        this.width = width;
    }

    @JsonProperty("Height")
    public Height getHeight() {
        return height;
    }

    @JsonProperty("Height")
    public void setHeight(Height height) {
        this.height = height;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    
    
    public MSRP getMsrPrice() {
		return msrPrice;
	}

	public void setMsrPrice(MSRP msrPrice) {
		this.msrPrice = msrPrice;
	}

	public String getVehicleSummary() {
        return this.modelYear.getValue()+" "+this.make.getValue()+" "
                +this.model.getValue()+" "+this.fuelType.getValue()+" "
                    +this.manufacturedIn.getValue()+" "+this.msrPrice.getValue();
    }

}
