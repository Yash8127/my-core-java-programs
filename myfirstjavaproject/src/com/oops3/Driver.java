package com.oops3;

class Driver {
    private String name;
    private String city;
    private boolean available;

    public Driver(String name, String city, boolean available) {
        this.name = name;
        this.city = city;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
