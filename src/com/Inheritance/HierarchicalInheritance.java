/**
 * 
 */
package com.Inheritance;

/**
 * program to use hierarchical inheritance
 * @author mkanakkanadar
 * 28/04/2023
 */
class FootBall
{
	String playerName;
	String teamName;
	public void setDetails(String playerName, String teamName)
	{
		this.playerName = playerName;
		this.teamName = teamName;
	}
	public void showDetails()
	{
		System.out.println("Player name: "+playerName+" teamName: "+teamName);
	}
}
class Strikers extends FootBall
{
	int goalCount;
	public void setCount(int goalCount)
	{
		this.goalCount = goalCount;
	}
	public void Display()
	{
		System.out.println("Goals: "+goalCount);
	}
	
}
class GoalKeeper extends FootBall
{
	int blockedGoal;
	public void setGoalRate(int blockedGoal)
	{
		this.blockedGoal = blockedGoal;
	}
	public void ScoreBoard()
	{
		System.out.println("Blocked Goals: "+blockedGoal);
	}
}
public class HierarchicalInheritance {
	public static void main(String args[]) {
		Strikers strike = new Strikers();
		GoalKeeper goal = new GoalKeeper();
		System.out.println("Striker Details");
		strike.setDetails("Ronaldo","AL-NASSR-FC");
		strike.showDetails();
		strike.setCount(4);
		strike.Display();
		System.out.println("GoalKeeper Details ");
		goal.setDetails("Messi","Barcelona");
		goal.showDetails();
		goal.setGoalRate(6);
		goal.ScoreBoard();
	}

}
