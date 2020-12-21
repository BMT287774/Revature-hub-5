package eg2;

public class Player extends Person{
	
	private double rating;
	private Team team;
	
	public Player() {
		
	}
	public Player( int id, String name, double rating, Team team) {
		super(id, name);
		this.rating = rating;
		this.team = team;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public String toString() {
		return "Player [rating=" + rating + ", team=" + team  + "]";
	}

}
