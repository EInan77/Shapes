/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.shapes;


/**
 *
 * @author ereni
 */
public abstract class Shape

{

private int x; 

private int y; 

public Shape( int x, int y )

{
this.x = x;

this.y = y;
} 

public void setX( int x )

{
this.x = x;
} 

public void setY( int y )

{
this.y = y;
} 

public int getX()

{

return x;

} 

public int getY()

{
return y;
} 

    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + '}';
    }













public abstract String getName();

} 
