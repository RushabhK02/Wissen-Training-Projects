import java.util.*;

public class test {
	public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayDeque deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int maxlen=0;
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.push(num);
            }
            Iterator itr = deque.iterator();
            for(int i=m;m<n;m++) {
            	
            	for(int j=i-m;j<i;j++) {
            		set.add(deque.contains(itr));
            	}
            	itr=itr.next();
            }
            
//            Iterator itr=deque.iterator();
//            long maxLen=-1;
//            long len=0;
//            for(int j=0;j<n-m;j++){
//               Map<Integer,Integer> map = new HashMap();
//                Iterator itr2=itr;
//                len=0;
//               for(int k=0;k<m;k++){
//                   Integer next=itr2.next();
//                   if(!map.containsKey(next){
//                       map.put(next);
//                       len+=1;}
//                      }
//                if(len>maxLen){
//                    maxLen=len;
//                }
//                itr++;
//            }       
//            System.out.println(maxLen);
        }
}
