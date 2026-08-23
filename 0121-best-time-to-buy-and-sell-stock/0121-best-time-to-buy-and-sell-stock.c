int maxProfit(int* prices, int size){
    int buy_price = prices[0], current_profit = 0, max_profit = 0;
    for(int i=1; i<size; i++){
        if(prices[i] < buy_price){
            buy_price = prices[i];
        }else{
            current_profit = prices[i] - buy_price;
            if(max_profit < current_profit){
                max_profit = current_profit;
            }
        }
    }
    return max_profit;
}