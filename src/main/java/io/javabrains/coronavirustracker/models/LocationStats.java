package io.javabrains.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int locationTotalCasesYesterday;
    private int locationTotalCasesToday;
    private int diffFromPrevDay;

    public int getLocationTotalCasesYesterday() {
        return locationTotalCasesYesterday;
    }

    public void setLocationTotalCasesYesterday(int locationTotalCasesYesterday) {
        this.locationTotalCasesYesterday = locationTotalCasesYesterday;
    }

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

    public int getLocationTotalCasesToday() {
        return locationTotalCasesToday;
    }

    public void setLocationTotalCasesToday(int locationTotalCasesToday) {
        this.locationTotalCasesToday = locationTotalCasesToday;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", locationTotalCasesYesterday=" + locationTotalCasesYesterday +
                ", locationTotalCasesToday=" + locationTotalCasesToday +
                ", diffFromPrevDay=" + diffFromPrevDay +
                '}';
    }
}
