int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    int max = 0, i, j;
    for(i=0; i<accountsSize; i++){
        int sum = 0;
        for(j=0; j<accountsColSize[i]; j++){
            sum += accounts[i][j];
        }
        if(max < sum){
            max = sum;
        }
    }
    return max;
}