public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[7];
        objects[0] = new Circle("Circle", 5);
        objects[1] = new Rectangle("Rectangle", 4, 6);
        objects[2] = new Triangle("Triangle", 3, 8);
        objects[3] = new WaterPalette("Blueberry", 10, true);
        objects[4] = new WaterPalette("Grape", 12, false);
        objects[5] = new CreamPalette("Chocolate", 18, true);
        objects[6] = new CreamPalette("Vanilla", 15, false);

        for (Object obj : objects) {
            if (obj instanceof geometricShape) {
                geometricShape shape = (geometricShape) obj;
                System.out.println("Area of " + shape.name + ": " + shape.calculateArea());
            } else if (obj instanceof Palette) {
                Palette palette = (Palette) obj;
                palette.showInformation();
                if (palette instanceof WaterPalette) {
                    ((WaterPalette) palette).showWaterBase();
                    ((WaterPalette) palette).increasePrice();
                } else if (palette instanceof CreamPalette) {
                    ((CreamPalette) palette).showCreamTexture();
                    ((CreamPalette) palette).increasePrice();
                }
            }
            System.out.println("-------------------");
        }
    }
}