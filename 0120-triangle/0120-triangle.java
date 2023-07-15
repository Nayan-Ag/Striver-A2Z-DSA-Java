class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        List<List<Integer>> dp = new ArrayList<>();
        for(int i=list.size()-1 ; i>=0 ; i--){
            List<Integer> sublist = new ArrayList<>();
            for(int j=0 ; j<list.get(i).size() ;j++){
                if(i==list.size()-1){
                    sublist.add(list.get(i).get(j));
                }else{
                    int min = Math.min(dp.get(list.size()-i-2).get(j) , dp.get(list.size()-i-2).get(j+1));
                    sublist.add(list.get(i).get(j) + min);
                }
            }
            dp.add(sublist);
        }
        return (dp.get(list.size()-1).get(0));
    }
}