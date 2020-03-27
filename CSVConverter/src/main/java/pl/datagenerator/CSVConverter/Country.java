package pl.datagenerator.CSVConverter;

public class Country {


    private String _type;

    private Integer id;


    private String key;


    private String name;


    private String fullname;


    private String iata_airport_code;


    private String type;


    private String country;


    private GeoPosition geo_position;


    private int location_id;


    private boolean ineurope;


    private String countrycode;


    private boolean corecountry;


    private String distance;

    public Country(){

    }

    public Country(String _type, Integer id, String key, String name, String fullname, String iata_airport_code, String type, String country, GeoPosition geo_position, int location_id, boolean ineurope, String countrycode, boolean corecountry, String distance) {
        this._type = _type;
        this.id = id;
        this.key = key;
        this.name = name;
        this.fullname = fullname;
        this.iata_airport_code = iata_airport_code;
        this.type = type;
        this.country = country;
        this.geo_position = geo_position;
        this.location_id = location_id;
        this.ineurope = ineurope;
        this.countrycode = countrycode;
        this.corecountry = corecountry;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public boolean isIneurope() {
        return ineurope;
    }

    public void setIneurope(boolean ineurope) {
        this.ineurope = ineurope;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public boolean isCorecountry() {
        return corecountry;
    }

    public void setCorecountry(boolean corecountry) {
        this.corecountry = corecountry;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
