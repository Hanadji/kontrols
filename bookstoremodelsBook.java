package bookstore.models;

public class Book {
    private String title;
    private String author;
    private double mass;
    private double volume;
    private double price;
    private int code;

    public Book(String title, String author, double mass, double volume, double price, int code) {
        this.title = title;
        this.author = author;
        this.mass = mass;
        this.volume = volume;
        this.price = price;
        this.code = code;
    }

    public double calculateDensity() {
        if (volume == 0) return 0.0;
        return mass / volume;
    }

    // Геттеры
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getMass() { return mass; }
    public double getVolume() { return volume; }
    public double getPrice() { return price; }
    public int getCode() { return code; }

    // Сеттеры
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setMass(double mass) { this.mass = mass; }
    public void setVolume(double volume) { this.volume = volume; }
    public void setPrice(double price) { this.price = price; }
    public void setCode(int code) { this.code = code; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", mass=" + mass + "g" +
                ", volume=" + volume + "cm³" +
                ", price=" + price + "₽" +
                ", code=" + code +
                ", density=" + String.format("%.2f", calculateDensity()) + "g/cm³" +
                '}';
    }
}
