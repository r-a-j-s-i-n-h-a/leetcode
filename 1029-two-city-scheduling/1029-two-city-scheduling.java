class Solution {
   public int twoCitySchedCost(int[][] costs) {
		
		Arrays.sort(costs, (a1, a2) -> a1[0] - a1[1] - a2[0] + a2[1]);
		
		int cost = 0;
	
		int n = costs.length;
		
		for (int i = 0; i < n / 2; i++) {
			
			cost += costs[i][0] + costs[i + n / 2][1];
		}
		
		return cost;
	}
}