class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        helper(list , temp , nums , vis);
        return list;
    }

    public void helper(List<List<Integer>> list , List<Integer> temp , int[] nums , boolean[] vis ){
        if(temp.size() == nums.length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = 0; i< nums.length ; i++){
            if(!vis[i]){
                if(i>0 && nums[i] == nums[i-1] && !vis[i-1]){
                    continue;
                }
                temp.add(nums[i]);
                vis[i] = true;
                helper(list , temp , nums , vis );
                vis[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
}