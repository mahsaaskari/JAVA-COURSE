class Manufacture {
    String name;
    String location;
    int foundedYear;
    public Manufacture(String name, String location, int foundedYear) {
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
    }
    public void ShowCharacteristics() {
        System.out.println("Manufacturer: " + name);
        System.out.println("Location: " + location);
        System.out.println("Founded Year: " + foundedYear);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public int getFoundedYear() {
        return foundedYear;
    }
    public void setFoundedYear(int year) {
        this.foundedYear = year;
    }
}
