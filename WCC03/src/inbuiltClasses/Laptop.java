package inbuiltClasses;

import java.util.Objects;

public class Laptop {  //extends Object

	String brand;
	int ram_size;
	int hard_disk_size;
	String processor;
	
	public Laptop(String brand, int ram_size, int hard_disk_size, String processor) {
		super();
		this.brand = brand;
		this.ram_size = ram_size;
		this.hard_disk_size = hard_disk_size;
		this.processor = processor;
	}	
	
	public Laptop() {
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, hard_disk_size, processor, ram_size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && hard_disk_size == other.hard_disk_size
				&& Objects.equals(processor, other.processor) && ram_size == other.ram_size;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram_size=" + ram_size + "GB, hard_disk_size=" + hard_disk_size
				+ "TB, processor=" + processor + "]";
	}	
}
