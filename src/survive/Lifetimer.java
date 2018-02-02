package survive;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author root
 *
 */
public class Lifetimer extends Karma{
	private boolean water = false;
	private int waterTime = 0;
	private int multiplier = 1;
	private Timer lifeTimer;
	
	public Lifetimer() {
		
	}
	
	public void refreshLifetimer() {
		this.lifeTimer.cancel();
		this.lifeTimer = new Timer();
		this.runTimer();
	}
	
	void runTimer() {
		TimerTask myTTask = new TimerTask() {
			@Override
			public void run() {
				subHP(1);
			}
		};
		scheduleLifetimer(myTTask);
	}
	
	void scheduleLifetimer(TimerTask myTimerTask) {
		if(getWater()) {
			setMultiplier(2);
			if(getWaterTime() < 5) {
				addWaterTime();
			}else {
				setWater(false);
				setWaterTime();
			}
		} else {
			setMultiplier(1);
		}
		this.lifeTimer.schedule(myTimerTask, 1000, this.multiplier*1000);
	}
	
	public void setMultiplier(int multi) {
		this.multiplier = multi;
	}
	
	public boolean getWater() {
		return this.water;
	}
	
	public int getWaterTime() {
		return this.waterTime;
	}
	
	public void setWater(boolean isWater) {
		this.water = isWater;
	}
	
	public void setWaterTime() {
		this.waterTime = 0;
	}
	
	public void addWaterTime() {
		this.waterTime++;
	}
	
}
