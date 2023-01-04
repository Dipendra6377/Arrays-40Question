class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(o1,o2)->Integer.compare(o1[0],o2[0]));
        ArrayList<int[]> list= new ArrayList<>();

        int start = intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];

            if(s<=end){
                end=Math.max(end,e);
            }

            else{
                list.add(new int[]{start,end});
                start=s;
                end=e;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][2]);
    }
}
