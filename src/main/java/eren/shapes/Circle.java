/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */
public class Circle extends TwoDimensionalShape

{


public Circle( int x, int y, int radius )

{

super( x, y, radius, radius );

} 

@Override
public String getName()

{

return "Circle";

}



@Override
public int getArea() {
    int area = (int) (Math.PI * getDimension1() * getDimension2());
    return area;
}

}