package Lesson21;

public class Product {
	
	
	@ProductAnnotation("Use for the Name of Product")
	public String name;
	@ProductAnnotation("Use for the Product length")
	private int length;
	@ProductAnnotation("Use for the Product width")
	private int width;
	@ProductAnnotation("Use for the Product weight")
	private int weight;

	public Product() {
		
	}
	
	public Product(String name) {
		this.name=name;
	}
	
	public Product(String name, int length, int width) {
		this.name=name;
		this.length=length;
		this.width=width;
	}
	
	public Product(String name, int weight) {
		super();
		this.name=name;
		this.weight=weight;
	}
	
	public Product(String name, int length, int width, int weight) {
		super();
		this.name=name;
		this.weight=weight;
		this.width=width;
		this.length=length;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void putOnShelf(int shelfNumber) {
		System.out.println("Item placed on shelf #" + shelfNumber);
	}
	
	public void giveForSafeKeeping(String person) {
		System.out.println("Worker " + person + " accepted the goods for storage");
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}
	
}
