class Solution{
    public int[] findEvenNumbers(int[] digits){
        int frequency[] = new int[10];
        for(int digit : digits) frequency[digit]++;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=9; i++){
            if(frequency[i] == 0) continue;
            frequency[i]--;
            for(int j=0; j<=9; j++){
                if(frequency[j] == 0) continue;
                frequency[j]--;
                for(int k=0; k<=8; k+=2){
                    if(frequency[k] == 0) continue;
                    frequency[k]--;
                    list.add((i * 100) + (j * 10) + k);
                    frequency[k]++;
                }
                frequency[j]++;
            }
            frequency[i]++;
        }
        int result[] = new int[list.size()];
        for(int i=0; i<list.size(); i++) result[i] = list.get(i);
        return result;
    }
}