/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */
public class Triangle extends TwoDimensionalShape {

    public Triangle(int x, int y, int base, int height) {
        super(x, y, base, height);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public int getArea() {
        int area = (int) (0.5 * getDimension1() * getDimension2());
        return area;
    }
}