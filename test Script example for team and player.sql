select * from player;
select * from team;


select p.player, p.player_name, t.team_id, t.team_name
from player p
join team t
on p.team_id = t.team_id;

select p.player, p.player_name, t.team_id, t.team_name
from player p
left join team t
on p.team_id = t.team_id;

select p.player, p.player_name, t.team_id, t.team_name
from player p
right join team t
on p.team_id = t.team_id;

select p.player, p.player_name, t.team_id, t.team_name
from player p
full outer join team t
on p.team_id = t.team_id;