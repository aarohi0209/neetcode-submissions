/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		
		for(int i=0;i<intervals.size()-1;i++) {
			Interval prev = intervals.get(i);
			Interval curr = intervals.get(i+1);
			
			if(prev.end>curr.start) {
				return false;
			}
		}
		return true;
    }
}
