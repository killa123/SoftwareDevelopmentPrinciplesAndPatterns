package com.lianlianDesign.ISP;

import com.lianlianDesign.ISP.TimerDoor;
import com.lianlianDesign.ISP.TimerClient;
import com.lianlianDesign.ISP.Timer;

public class DoorTimeAdapter extends TimerClient{
	private TimerDoor timerDoor;
	
	public DoorTimeAdapter(TimerDoor door){
		timerDoor = door;
		Timer timer = new Timer();
		timer.Register(5, this);
	}
	
	@Override
	public void timeOut(){
		timerDoor.DoorTimeOut();
	}
}
