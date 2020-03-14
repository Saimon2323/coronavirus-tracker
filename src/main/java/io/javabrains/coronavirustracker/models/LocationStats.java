package io.javabrains.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int locationTotalCases;
    private int diffFromPrevDay;

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLocationTotalCases() {
        return locationTotalCases;
    }

    public void setLocationTotalCases(int locationTotalCases) {
        this.locationTotalCases = locationTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", locationTotalCases=" + locationTotalCases +
                ", diffFromPrevDay=" + diffFromPrevDay +
                '}';
    }
}
