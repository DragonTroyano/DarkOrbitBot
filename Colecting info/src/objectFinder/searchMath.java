package objectFinder;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class searchMath {
	
	public int skipPnts(BufferedImage img,Point p,Rectangle[] rect){
		if(rect!=null){
		for(Rectangle r: rect){
			if(r.contains(p)){
					int nx = r.width+r.x;
					if(nx>img.getWidth()-50){
						nx=img.getWidth()-50;
					}
				return nx;
			
			}
		}
		}
		return p.x;
	}
	public boolean contains(Point p, Rectangle[] rect) {
		for(Rectangle r: rect){
			if(r.contains(p)){
				return true;
			}
		}
		return false;
	}
	public boolean skipPnts( int x, int y,Rectangle[] rect){
		for(Rectangle r: rect){
			if(r.x<x&&r.y<y&&r.x+r.width>x
					&&r.y+r.height>y){
				return true;
			}
		}
		return false;
	}
 	public boolean searchBoundries(BufferedImage img,Point p){
 		//System.out.println(img.getWidth()+">"+p.x);
 		//System.out.println(img.getHeight()+">"+p.y);
		return (p.x<img.getWidth()&&p.y<img.getHeight()&&p.x>5&&p.y>5);
	}
	public boolean inBounds(BufferedImage img, int x, int y) {
		return searchBoundries(img,new Point(x,y));
		
	}
	
}
