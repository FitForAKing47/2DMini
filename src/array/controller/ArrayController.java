package array.controller;

import array.model.Hipster;
import array.view.GridView;

public class ArrayController
{
	private int[][] myFamilyAges;
	private String[][] fillNames;
	private GridView consoleView;
	private String[][] hipster;

	public ArrayController()
	{
		myFamilyAges = new int[3][3];
		fillNames = new String[3][3];
		hipster = new String[2][2];
		consoleView = new GridView();
	}

	public int[][] getMyFamilyAges()
	{
		return myFamilyAges;
	}

	public String[][] getFriendNames()
	{
		return fillNames;
	}

	public GridView getConsoleView()
	{
		return consoleView;
	}

	public String[][] marshMellowCreatures()
	{
		return hipster;
	}

	public void setMyFamilyAges(int[][] myFamilyAges)
	{
		this.myFamilyAges = myFamilyAges;
	}

	public void setFriendNames(String[][] friendNames)
	{
		this.fillNames = friendNames;
	}

	public void setConsoleView(GridView consoleView)
	{
		this.consoleView = consoleView;
	}

	public void setMarshMellowCreatures(String[][] marshMellowCreatures)
	{
		this.hipster = marshMellowCreatures;
	}

	private void fillAges()
	{
		myFamilyAges[0][0] = 19;
		myFamilyAges[0][1] = 47;
		myFamilyAges[0][2] = 12;

		myFamilyAges[1][0] = 46;
		myFamilyAges[1][1] = 17;
		myFamilyAges[1][2] = 8;

		myFamilyAges[2][0] = 24;
		myFamilyAges[2][1] = 32;
		myFamilyAges[2][2] = 6;

	}

	private void fillHipsterBooks()
	{
		hipster[0][0] = "Physics";
		hipster[0][1] = "Nate The Great";

		hipster[1][0] = "Magic School Bus";
		hipster[1][1] = "Elmo";

	}

	private void fillTheStringArray()
	{
		fillNames[0][0] = "Josh";
		fillNames[0][1] = "Jake";
		fillNames[0][2] = "Cody";
		fillNames[1][0] = "Jarred";
		fillNames[1][1] = "Sam";
		fillNames[1][2] = "Berry";
		fillNames[2][0] = "Devin";
		fillNames[2][1] = "Darron";
		fillNames[2][2] = "Julie";

	}

	public void start()
	{
		fillAges();
		consoleView.printIntInformation(myFamilyAges);
		fillHipsterBooks();
		consoleView.printStringInformation(hipster);
		fillTheStringArray();
		consoleView.printStringInformation(fillNames);
	}
}
