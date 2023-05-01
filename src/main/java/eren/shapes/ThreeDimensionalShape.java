/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;

/**
 *
 * @author ereni
 */
public abstract class ThreeDimensionalShape extends Shape

{

private int dimension1;

private int dimension2;

private int dimension3;



public ThreeDimensionalShape(int x, int y, int d1, int d2, int d3 )

{

super( x, y );

dimension1 = d1;
dimension2 = d2;
dimension3 = d3;
} 

public int getDimension1()

{
return dimension1;
}


public int getDimesion2()
{
return dimension2;
}



public int getDimension3()

{
return dimension3;
}


public abstract int getArea();

public abstract int getVolume();

} 
