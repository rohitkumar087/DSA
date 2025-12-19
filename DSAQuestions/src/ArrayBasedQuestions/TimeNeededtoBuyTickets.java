package ArrayBasedQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededtoBuyTickets {

	public static void main(String[] args) {
		int tickets[] = {2,3,2};
		int k = 2;
		int second = 0;
		
		Queue<Integer>  qu = new LinkedList<>();
		for(int i=0;i<tickets.length;i++){
            qu.add(i);
        } 
		
		while(true) {
			int person = qu.poll();
			tickets[person]--;
			second++;
			
			if(tickets[person]==0) {
				if(person==k) {
					System.out.println(second);
					break;
				}
			}
			else {
				qu.add(person);
			}
		}
	}

}
