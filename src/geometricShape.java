abstract class geometricShape {
    protected String name;

    public geometricShape(String name) {
        this.name = name;
    }

    abstract double calculateArea();
}

class Circle extends geometricShape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends geometricShape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Triangle extends geometricShape {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Palette {
    protected String flavor;
    protected double price;

    public Palette(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public void showInformation() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price + " pesos");
    }
}

class WaterPalette extends Palette {
    private boolean waterbase;

    public WaterPalette(String flavor, double price, boolean waterbase) {
        super(flavor, price);
        this.waterbase = waterbase;
    }

    public void showWaterBase() {
        System.out.println("Water Base: " + (waterbase ? "Yes" : "No"));
    }

    public void increasePrice() {
        price += 2;
    }
}

class CreamPalette extends Palette {
    private boolean creamy;

    public CreamPalette(String flavor, double price, boolean creamy) {
        super(flavor, price);
        this.creamy = creamy;
    }

    public void showCreamTexture() {
        System.out.println("Creamy Texture: " + (creamy ? "Yes" : "No"));
    }

    public void increasePrice() {
        price += 6;
    }
}


