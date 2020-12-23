select length(state)
from facts;

select mid(state,1,4)
from facts;

select state, format(now(),'YYYY-MM-DD')
as date
from facts;

select state_name from states
union
select state_capital from facts;