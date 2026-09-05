class Solution {
    public int totalNumbers(int[] digits) {
        int frequency[] = new int[10];
        for(int digit : digits) frequency[digit]++;
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=1; i<=9; i++){
            if(frequency[i] == 0) continue;
            frequency[i]--;
            for(int j=0; j<=9; j++){
                if(frequency[j] == 0) continue;
                frequency[j]--;
                for(int k=0; k<=8; k+=2){
                    if(frequency[k] == 0) continue;
                    frequency[k]--;
                    int num = (i * 100) + (j * 10) + k;
                    if(!set.contains(num)){
                        set.add(num);
                        count++;
                    }
                    frequency[k]++;
                }
                frequency[j]++;
            }
            frequency[i]++;
        }
        return count;
    }
}