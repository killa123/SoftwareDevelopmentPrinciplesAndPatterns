package com.lianlianDesign.ISP;

import com.lianlianDesign.ISP.Door;
public class TimerDoor extends Door{
	private boolean locked;
	
	@Override
	public void lock() {
		locked = true;
	}

	@Override
	public void unlock() {
		locked = false;
	}

	@Override
	public boolean isDoorOpen() {
		return locked;
	}
	
	public void DoorTimeOut(){
		
	}
}
