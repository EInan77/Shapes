/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */
public class Square extends TwoDimensionalShape

{


public Square( int x, int y, int side )

{
super( x, y, side, side );
} 

@Override
public int getArea()

{
int area=getDimension1()*getDimension1();

return area;
}


@Override
public String getName()

{
return "Square";
}

}
