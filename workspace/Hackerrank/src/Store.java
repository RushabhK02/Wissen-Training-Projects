import java.util.*;

public class Store{
	
	public static void main(String[] args) {
		String []records = new String[4];
		records[0]="A,IT,10000";
		records[1]="B,HR,5000";
		records[2]="C,IT,30000";
		records[3]="D,Sales,55000";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String record:records) {
			String[] data=record.split(",");
			if(map.get(data[1])!=null) {
				int currentSal=map.get(data[1]);
				currentSal+=Integer.valueOf(data[2]);
				map.put(data[1], currentSal);
			}else {
				map.put(data[1], Integer.valueOf(data[2]));
			}	
		}
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
	}
	
}