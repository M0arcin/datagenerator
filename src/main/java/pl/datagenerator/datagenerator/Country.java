package pl.datagenerator.datagenerator;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    private int _id;

    @Column
    private String _type;

    @Column
    private String key;

    @Column
    private String name;

    @Column
    private String fullName;

    @Column
    private String iata_airport_code;

    @Column
    private String type;

    @Column
    private String country;

    @Embedded
    private GeoPosition geo_position;

    @Column
    private int location_id;

    @Column
    private boolean inEurope;

    @Column
    private String countryCode;

    @Column
    private boolean coreCountry;

    @Column
    private String distance;


    public Country(){

    }

    public Country(String _type, int _id, String key, String name, String fullName, String iata_airport_code, String type, String country, GeoPosition geo_position, int location_id, boolean inEurope, String countryCode, boolean coreCountry, String distance) {
        this._type = _type;
        this._id = _id;
        this.key = key;
        this.name = name;
        this.fullName = fullName;
        this.iata_airport_code = iata_airport_code;
        this.type = type;
        this.country = country;
        this.geo_position = geo_position;
        this.location_id = location_id;
        this.inEurope = inEurope;
        this.countryCode = countryCode;
        this.coreCountry = coreCountry;
        this.distance = distance;
    }



    public String get_type() {
        return _type;
    }

    public int get_id() {
        return _id;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public GeoPosition getGeo_position() {
        return geo_position;
    }

    public void setGeo_position(GeoPosition geo_position) {
        this.geo_position = geo_position;
    }

    public int getLocation_id() {
        return location_id;
    }

    public boolean isInEurope() {
        return inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public boolean isCoreCountry() {
        return coreCountry;
    }

    public String getDistance() {
        return distance;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public void setInEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCoreCountry(boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
