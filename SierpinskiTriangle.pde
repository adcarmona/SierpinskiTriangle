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