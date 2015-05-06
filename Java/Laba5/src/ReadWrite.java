import java.io.*;
import java.util.Vector;

public class ReadWrite {
	private String path;
	
	public ReadWrite(String path){
		this.path = path;
	}
	
	public void SaveCollection(Vector<Transport> collection){
		Writer writer = null;
        try {
            writer = new FileWriter(this.path);
            for (int i = 0; i<collection.size(); i++) {
            	writer.write("The "+(i+1)+" car in autopark: ");
            	writer.write("\n");
            	writer.write("Car made by: " + collection.elementAt(i).GetFirm());
            	writer.write("\n");
            	writer.write("Car type is: " + collection.elementAt(i).GetType());
            	writer.write("\n");
            	writer.write("Car number is: " + collection.elementAt(i).GetNumber());
            	writer.write("\n");
            	writer.write("Car course is: " + collection.elementAt(i).GetWay());
            	writer.write("\n");
            	writer.write("Car capacity is: " + collection.elementAt(i).GetCapacity());
            	writer.write("\n");
            	writer.write("Driver name is: " + collection.elementAt(i).GetDriver());
            	writer.write("\n");
            }
            writer.flush();
        } 
        catch (IOException  e) {
        	System.err.println(e);
        } 
        finally {
            if (writer != null) {
                try {
                    writer.close();
                } 
                catch (IOException ex) {
                }
            }
        }
	}
	
	public Vector<String> LoadCollection() throws FileNotFoundException, IOException{
        String line = null;
        Vector<String> lines = new Vector<String>();
        
        File file = new File(this.path);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        
        while ((line = br.readLine()) != null) {
        	lines.add(line);
        }
        br.close();
		
		return lines;
	}
}
