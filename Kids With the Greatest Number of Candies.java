class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;

    List<Boolean> res = new ArrayList<>();

    for (int candy : candies) {
        max = Integer.max(candy, max);
    }
    for (int candy : candies) {
        if (candy + extraCandies >= max) {
            res.add(true);
        } else {
            res.add(false);
        }
    }
    return res;
}
}
