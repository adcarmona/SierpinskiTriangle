import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

int limit = 20;
public void setup()
{
	background(0);
	size(500, 600);
}
public void draw()
{
	background(0);
	sierpinski(0,500,500);
}
public void mouseDragged()//optional
{
	if(limit > 0) {limit = limit - 1;}
	if(limit == 0) {limit = limit + 20;}
}
public void sierpinski(int x, int y, int len) 
{
	if(len > limit)
	{
		sierpinski(x, y, len/2);
		sierpinski(x + len/2, y, len/2);
		sierpinski(x + len/4, y - len/2, len/2);
	}
	else
	{
		triangle(x, y, x + len, y, x + len/2, y - len);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
