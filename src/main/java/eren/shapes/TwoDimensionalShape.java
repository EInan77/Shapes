/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */


public abstract class TwoDimensionalShape extends Shape

{

private int dimension1;

private int dimension2;

public TwoDimensionalShape( int x, int y, int d1, int d2 )

{

super( x, y );

dimension1 = d1;

dimension2 = d2;

} 

public int getDimension1()

{
return dimension1;
}



public int getDimension2()

{
return dimension2;
}



public abstract int getArea();

}