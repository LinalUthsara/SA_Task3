public class ShapeFactory {

    Shape getShape(String shapeType) {

        if (shapeType.equals("SQUARE")){
            return new Square();
        }else if (shapeType.equals("CIRCLE")){
            return new Circle();
        }else if (shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }
        return new InvalidShape();
    }
}
