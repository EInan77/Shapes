/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.shapes;

/**
 *
 * @author ereni
 */
public class Shapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(22, 88, 4);
        shapes[1] = new Square(71, 96, 10);
        shapes[2] = new Sphere(8, 89, 2);
        shapes[3] = new Cube(79, 61, 8);
        shapes[4] = new Triangle(15, 30, 10,8);
        
        shapes[5] = new Tetrahedron(10,20,5);

        for (Shape shape : shapes) {
            System.out.printf("%s: %s", shape.getName(), shape);

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) shape;
                System.out.printf(", area: %d\n", twoDimensionalShape.getArea());
            }

            if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) shape;
                System.out.printf(", area: %d, volume: %d\n", 
                        threeDimensionalShape.getArea(), 
                        threeDimensionalShape.getVolume());
            }

            System.out.println();
        }
    }
}