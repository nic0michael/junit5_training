package com.nico.junit5.training;

/**
 *
 * @author Nico Michael
 */
public enum FootballTeams {
  
    ARZ("Arizona Cardinals"),
    ATL("Atlanta Falcons"),
    BLT("Baltimore Ravens"),
    BUF("Buffalo Bills"),
    CAR("Carolina Panthers"),
    CHI("Chicago Bears"),
    CIN("Cincinnati Bengals"),
    CLV("Cleveland Browns"),
    DAL("Dallas Cowboys"),
    DEN("Denver Broncos"),
    DET("Detroit Lions"),
    GB("Green Bay Packers"),
    HST("Houston Texans"),
    IND("Indianapolis Colts"),
    JAX("Jacksonville Jaguars"),
    KC("Kansas City Chiefs"),
    LV("Las Vegas Raiders"),
    LAC("Los Angeles Chargers"),
    LA("Los Angeles Rams"),
    MIA("Miami DolphinsMIA"),
    MIN("Minnesota Vikings"),
    NE("New England Patriots"),
    NO("New Orleans Saints"),
    NYG("New York GiantsNYG"),
    NYJ("New York JetsNYJ"),
    PHI("Philadelphia Eagles"),
    PIT("Pittsburgh Steelers"),
    SF("San Francisco 49ers"),
    SEA("Seattle Seahawks"),
    TB("Tampa Bay Buccaneers"),
    TEN("Tennessee Titans"),
    WAS("Washington Commanders");

    private String name;
            
    private FootballTeams(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

}
