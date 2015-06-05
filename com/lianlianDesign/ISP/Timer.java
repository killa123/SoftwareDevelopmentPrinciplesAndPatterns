package com.lianlianDesign.ISP;

import com.lianlianDesign.ISP.TimerClient;

public class Timer {
	
	public void Register(int timeout,TimerClient client){
		for(int i = 0;i< timeout;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		client.timeOut();
	}
}
