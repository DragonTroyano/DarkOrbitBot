package pet;

import java.awt.Point;

import userControls.Mouse;
import workingFinder.bonesBox;

public class PetControler {

	public PetStats petSt;
	private bonesBox mouse;
	private int n=0;

	public PetControler(PetStats p,bonesBox cbox) {
		p=petSt;
		mouse=cbox;
	}
	public void moniter(){
		//petSt.petmoniter();
	}
public void start(){
	if(petSt.petdown){
		
		if(n==1){
			mouse.rightclick(petSt.startBTN);
			}
			if(n>70){
				n=0;
			}
			n++;
	}
	}
public void stop(){
	
	if(petSt.petup){
			if(n==1){
				mouse.rightclick(petSt.startBTN);
			}
			if(n>50){
				n=0;
			}
			n++;
	}
}
public void colect(){
	if(petSt.petup){
		if(!petSt.petColecting()){
			if(n==6){
				mouse.rightclick(petSt.selectBTN);
			}
			if(n>10){
				if(petSt.dropdownShown()){
					mouse.rightclick(petSt.BTN3);
					n=0;
				}
				if(n>30){
					n=0;
				}
			}
			n++;
		}
		
	}
}
}
