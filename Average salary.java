class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        Double a=0d;
        for (int i=1;i<salary.length-1;i++){
            a=a+salary[i];
        }
        Double e=a/(salary.length-2);
        return e;
    }
}
