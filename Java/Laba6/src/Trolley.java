
public class Trolley implements Transport {

	public String GetType() {
		return this.type;
	}
	public void SetType(String type) {
		this.type = type;
	}

	public String GetFirm() {
		return this.firm;
	}
	public void SetFirm(String firm) {
		this.firm = firm;
	}
	
	public int GetNumber(){
		return this.number;
	}
	public void SetNumber(int number){
		this.number=number;
	}
	
	public String GetWay() {
		return this.way;
	}
	public void SetWay(String way){
		this.way=way;
	}
	
	public int GetCapacity(){
		return this.capacity;
	}
	public void SetCapacity(int capacity){
		this.capacity=capacity;
	}
	
	public String GetDriver(){
		return this.driver;
	}
	public void SetDriver(String driver){
		this.driver=driver;
	}
	
	
	private String type;
	private String firm;
	private int number;
	private String way;
	private int capacity;
	private String driver;
}
