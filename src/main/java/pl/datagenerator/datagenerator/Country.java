package pl.datagenerator.datagenerator;


public class Country {
    private final String _type;
    private final int _id;
    private final String key;
    private final String name;
    private final String fullName;
    private final String iata_airport_code;
    private final String type;
    private final String country;
    private final String geo_position;
    private final int location_id;
    private final boolean inEurope;
    private final String countryCode;
    private final boolean coreCountry;
    private final String distance;

    public Country(String type, int id, String key, String name, String fullName, String iata_airport_code, String type1, String country, String geo_position, int location_id, boolean inEurope, String countryCode, boolean coreCountry, String distance) {
        _type = type;
        _id = id;
        this.key = key;
        this.name = name;
        this.fullName = fullName;
        this.iata_airport_code = iata_airport_code;
        this.type = type1;
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

    public String getGeo_position() {
        return geo_position;
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
}
