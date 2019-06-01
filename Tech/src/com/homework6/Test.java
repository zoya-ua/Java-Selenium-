package com.homework6;
class Test {
	double width, height, depth;
	
	Test(double w,double h, double d){
		width=w;
		height = h;
		depth = d;
	}
	Test(){
		
		
		width=height=depth=0;
		
	}
	Test(double len){
		width=height=depth = len;
		
	}
	double volume() {
		return width*height*depth;
	}
	}
public class Test{
	public static void main(String[] args) {
	
	Box mybox1 = new Box(10,20,15);
	Box mybox2 = new Box();
	Box mycube = new Box(7);
	double vol;
	vol= mybox1.volume();
	System.out.println("Volum of mybox1 is " + vol);
	
	vol = mybox2.volume();
	System.out.println("Volumeof mybox2 is"+ vol);
	
	vol = mycube.volume();
	System.out.println("Volume of mycube is "+ vol);

	}

}
