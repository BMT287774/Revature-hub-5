select * from facts;
select * from states;

select state_capital
from facts 
where state_pop > 1000000;

select state
from facts
where state_pop <900000;


select state_name from states where state_id > 30;

select min(state_pop)
from facts;

select max(state_pop)
from facts;

select avg(state_pop)
from facts
where state_pop < 1000000;

select sum(state_pop)
from facts
where state_pop > 10000000;

select count(state) 
from facts;
