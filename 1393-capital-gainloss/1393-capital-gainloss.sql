with TotalBought as (
    select stock_name, sum(price) as spent from stocks where operation = 'buy' group by stock_name
),
TotalSold as (
    select stock_name, sum(price) as gained from stocks where operation = 'sell' group by stock_name
)
select stocks.stock_name, gained - spent as capital_gain_loss from TotalBought as stocks join TotalSold as stock on stocks.stock_name = stock.stock_name;