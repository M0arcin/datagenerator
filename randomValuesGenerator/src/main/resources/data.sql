drop table country;
create table country (
    _type varchar(255),
    id integer not null,
    key varchar(255),
    name varchar(255),
    full_name varchar(255),
    iata_airport_code varchar(255),
    type varchar(255),
    country varchar(255),
    latitude double not null,
    longitude double not null,
    location_id integer,
    in_europe boolean,
    country_code varchar(255),
    core_country boolean,
    distance varchar(255),
    primary key (id)
);
insert into country values('Position', 1, null, 'Oksywska', 'Oksywska, Poland', null, 'location', 'Poland', 51.0855422,  16.9987442 , 757423, true, 'PL', false, null);
insert into country values('Position', 2, null, 'Hillingdon' , 'Hillingdon, London, United Kingdom', 'LHR' , 'location', 'Great Britain', 51.469603, -0.453566, 757424,true, 'GB', true, null);
insert into country values('Position', 3, null, 'Richmond' , 'Richmond, British Columbia, Canada' , 'YVR' , 'location', 'Canada', 49.1966913, -123.18151230000001, 757425,false, 'CA', true, null);
insert into country values('Position', 4, null, 'Mascot' , 'Mascot, New South Wales, Australia', 'SYD' , 'location', 'Australia', -33.946111, 151.177222, 757426,false, 'AU', true, null);
insert into country values('Position', 5, null, 'Ōta' , 'Ōta, Tokyo, Japan', 'HND' , 'location', 'Japan', 35.553333, 139.781111, 757427,false, 'JP', true, null);
insert into country values('Position', 6, null, 'Lago Sul' , 'Lago Sul, DF, Brazil', 'BSB' , 'location', 'Brazil', -15.869167, -47.920833, 757428,false, 'BR', true, null);
insert into country values('Position', 7, null, 'Paris' , 'Paris, France', 'CDG' , 'location', 'France', 49.009722, 2.547778, 757429,true, 'FR', true, null);
insert into country values('Position', 8, null, 'Niamey' , 'Niamey, Niger', 'NIM' , 'location', 'Niger', 13.481667, 2.170278, 757430,false, 'NE', false, null);
insert into country values('Position', 9, null, 'Kempton Park' , 'Kempton Park, Ekurhuleni, Gauteng, South Africa', 'JNB' , 'location', 'South Africa', -26.133333, 28.25, 757431,false, 'ZA', true, null);
insert into country values('Position', 10, null, 'Aleja Wiśniowa' , 'Aleja Wiśniowa, Wrocław, Poland', null , 'location', 'Poland', 51.085364, 17.014500, 757432,true, 'PL', false, null);



