package array.view;

import array.model.Hipster;

public class GridView
{

	public void printIntInformation(int[][] currentArray)
	{
		System.out.println("for-each printing");
		for (int[] currentRow : currentArray)
		{
			for (int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}

		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}

	}
	
	public void printStringInformation(String[][] currentArray)
	{
		System.out.println("for-each printing");
		for (String[] currentRow : currentArray)
		{
			for (String currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}

		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}

	}

	public void printHipsterInformation(Hipster[][] currentArray)
	{
		System.out.println("for-each printing");
		for (Hipster[] currentRow : currentArray)
		{
			for (Hipster currentHipster : currentRow)
			{
				System.out.print(currentHipster.getHipsterBooks() + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for (int row = 0; row < currentArray.length; row++)
		{
			for (int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getHipsterBooks()[0] + "\t");
			}
			System.out.println();
		}
	}

}
