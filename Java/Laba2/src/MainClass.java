import java.util.Scanner;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Transport> transports = new Vector<Transport>();
		Transport transport;
		int choose=0;
		
		while(true){
            System.out.println("\nChose the action:");
            System.out.println("1 - Put bus on the route");
            System.out.println("2 - Put trolley on the route");
            System.out.println("3 - Put tram on the route");
            System.out.println("4 - Show autopark");
            System.out.println("5 - Remove car from autopark");
            System.out.println("6 - Destroy the autopark");
            System.out.println("7 - Exit");
            choose = scan.nextInt();
            
            switch(choose){
            case 1:
            	transport = new Bus();
            	System.out.println("Input firm: ");
            	transport.SetFirm(scan.next());
            	
            	System.out.println("Input type: ");
            	transport.SetType(scan.next());
            	
            	System.out.println("Input number: ");
            	transport.SetNumber(scan.nextInt());
            	
            	System.out.println("Input way: ");
            	transport.SetWay(scan.next());
            	
            	System.out.println("Input capacity: ");
            	transport.SetCapacity(scan.nextInt());
            	
            	System.out.println("Input driver: ");
            	transport.SetDriver(scan.next());
            	
            	transports.add(transport);
                System.out.println("Done! Bus is put on course.");

            	break;
            case 2:
            	transport = new Trolley();
            	System.out.println("Input firm: ");
            	transport.SetFirm(scan.next());
            	
            	System.out.println("Input type: ");
            	transport.SetType(scan.next());
            	
            	System.out.println("Input number: ");
            	transport.SetNumber(scan.nextInt());
            	
            	System.out.println("Input way: ");
            	transport.SetWay(scan.next());
            	
            	System.out.println("Input capacity: ");
            	transport.SetCapacity(scan.nextInt());
            	
            	System.out.println("Input driver: ");
            	transport.SetDriver(scan.next());
            	
            	transports.add(transport);
                System.out.println("Done! Trolley is put on course.");
            	break;
            case 3:
            	transport = new Tram();
            	System.out.println("Input firm: ");
            	transport.SetFirm(scan.next());
            	
            	System.out.println("Input type: ");
            	transport.SetType(scan.next());
            	
            	System.out.println("Input number: ");
            	transport.SetNumber(scan.nextInt());
            	
            	System.out.println("Input way: ");
            	transport.SetWay(scan.next());
            	
            	System.out.println("Input capacity: ");
            	transport.SetCapacity(scan.nextInt());
            	
            	System.out.println("Input driver: ");
            	transport.SetDriver(scan.next());
            	
            	transports.add(transport);
                System.out.println("Done! Tram is put on course.");
            	break;
            case 4:
            	for(int i=0; i<transports.size(); i++){
            		System.out.println("The "+(i+1)+" car in autopark: ");
            		System.out.println("Car made by: " + transports.elementAt(i).GetFirm());
            		System.out.println("Car type is: " + transports.elementAt(i).GetType());
            		System.out.println("Car number is: " + transports.elementAt(i).GetNumber());
            		System.out.println("Car course is: " + transports.elementAt(i).GetWay());
            		System.out.println("Car capacity is: " + transports.elementAt(i).GetCapacity());
            		System.out.println("Driver name is: " + transports.elementAt(i).GetDriver());
            	}
            	
            	break;
            case 5:
            	System.out.println("Input position will be removed!");
            	transports.remove(scan.nextInt() - 1);

            	break;
            case 6:
            	System.out.println("Autopark will be destroyed!");
            	transports.clear();
            	break;
            case 7:
            	System.exit(0);
            }

		}
	}

}
