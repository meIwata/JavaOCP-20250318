package day05;

// 車車
public class CarToy {
	private String name;
	private int price;
	private Wheel[] wheels;
	private Battery battery;

	public CarToy(String name, int price, Wheel[] wheels, Battery battery) {
		this.name = name;
		this.wheels = wheels;
		this.battery = battery;
		this.price = price + battery.getPrice();
		
		if (wheels != null && wheels.length > 0) {
			for(Wheel wheel : wheels) {
				this.price += wheel.getPrice();
			}
		}
	}
}
