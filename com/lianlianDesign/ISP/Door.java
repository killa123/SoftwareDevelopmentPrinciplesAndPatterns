package com.lianlianDesign.ISP;

import com.lianlianDesign.ISP.TimerClient;

public abstract class Door extends TimerClient{
	public abstract void lock();
	public abstract void unlock();
	public abstract boolean isDoorOpen();
}
