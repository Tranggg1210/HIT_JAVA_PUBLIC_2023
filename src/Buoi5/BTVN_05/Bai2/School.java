package Buoi5.BTVN_05.Bai2;

class School {
    private String name;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public School() {
    }

    public School(String name, String date) {
        this.name = name;
        this.date = date;
    }
}