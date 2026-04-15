package gestion.ventilacion;

public class Equipament {

    private String code;
    private String description;
    private String location;
    private String state;
    private String type;
    private String brand;

    public Equipament(String code, String description, String location, String state, String type, String brand) {
        this.code = code;
        this.description = description;
        this.location = location;
        this.state = state;
        this.type = type;
        this.brand = brand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "code: " + code + ", description: " + description + ", location: " + location + ", state: " + state + ", type: " + type + ", brand: " + brand +"\n";
    }
}
