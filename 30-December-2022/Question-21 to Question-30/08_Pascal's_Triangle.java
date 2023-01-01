class Solution {
    public List<List<Integer>> generate(int numrows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> current,prev =null;

        for(int i=0;i<numrows;i++){
            current = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    current.add(1);
                }
                else{
                    current.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=current;
            res.add(current);
        }

        return res;

    }
}
