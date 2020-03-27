package pl.datagenerator.CSVConverter;

public class Country {


    private String _type;

    private Integer id;


    private String key;


    private String name;


    private String fullName;


    private String iata_airport_code;


    private String type;


    private String country;


    private GeoPosition geo_position;


    private int location_id;


    private boolean inEurope;


    private String countryCode;


    private boolean coreCountry;


    private String distance;

    public Country(){

    }

    public Country(String _type, Integer id, String key, String name, String fullName, String iata_airport_code, String type, String country, GeoPosition geo_position, int location_id, boolean inEurope, String countryCode, boolean coreCountry, String distance) {
        this._type = _type;
        this.id = id;
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

    public void set_type(String _type) {
        this._type = _type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public boolean isinEurope() {
        return inEurope;
    }

    public void setinEurope(boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean iscoreCountry() {
        return coreCountry;
    }

    public void setcoreCountry(boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
