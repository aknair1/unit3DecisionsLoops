O

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @aknair
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 17 rows and 17 columns
    private final int ROWS = 17;
    private final int COLS = 17;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);

        // populate the game
        populateGame();

        // display the newly constructed and populated world
        world.show();

    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();

        // create and add rocks (a type of Actor) to the forty-eight intial locations

        grid.put(new Location(2, 4), new Rock());
        grid.put(new Location(2, 5), new Rock());   
        grid.put(new Location(2, 6), new Rock());         
        grid.put(new Location(4, 2), new Rock());     
        grid.put(new Location(5, 2), new Rock());
        grid.put(new Location(6, 2), new Rock());               
        grid.put(new Location(4, 7), new Rock());      
        grid.put(new Location(5, 7), new Rock());
        grid.put(new Location(6, 7), new Rock());
        grid.put(new Location(7, 4), new Rock());
        grid.put(new Location(7, 5), new Rock());
        grid.put(new Location(7, 6), new Rock());

        grid.put(new Location(2, 10), new Rock());
        grid.put(new Location(2, 11), new Rock());   
        grid.put(new Location(2, 12), new Rock());         
        grid.put(new Location(4, 9), new Rock());     
        grid.put(new Location(5, 9), new Rock());
        grid.put(new Location(6, 9), new Rock());               
        grid.put(new Location(4, 14), new Rock());      
        grid.put(new Location(5, 14), new Rock());
        grid.put(new Location(6, 14), new Rock());
        grid.put(new Location(7, 10), new Rock());
        grid.put(new Location(7, 11), new Rock());
        grid.put(new Location(7, 12), new Rock());

        grid.put(new Location(9, 4), new Rock());
        grid.put(new Location(9, 5), new Rock());   
        grid.put(new Location(9, 6), new Rock());         
        grid.put(new Location(10, 2), new Rock());     
        grid.put(new Location(11, 2), new Rock());
        grid.put(new Location(12, 2), new Rock());               
        grid.put(new Location(10, 7), new Rock());      
        grid.put(new Location(11, 7), new Rock());
        grid.put(new Location(12, 7), new Rock());
        grid.put(new Location(14, 4), new Rock());
        grid.put(new Location(14, 5), new Rock());
        grid.put(new Location(14, 6), new Rock());

        grid.put(new Location(9, 10), new Rock());
        grid.put(new Location(9, 11 ), new Rock());   
        grid.put(new Location(9, 12), new Rock());         
        grid.put(new Location(10, 9), new Rock());     
        grid.put(new Location(11, 9), new Rock());
        grid.put(new Location(12, 9), new Rock());               
        grid.put(new Location(10, 14), new Rock());      
        grid.put(new Location(11, 14), new Rock());
        grid.put(new Location(12, 14), new Rock());
        grid.put(new Location(14, 10), new Rock());
        grid.put(new Location(14, 11), new Rock());
        grid.put(new Location(14, 12), new Rock());
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        // create the grid, of the specified size, that contains Actors
        
        Grid<Actor> grid = world.getGrid();
        
        // creates the new grid that will be modified and will replace the old grid in the world object
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(ROWS, COLS);

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                //Gets the cell from the location and the amount of neighbors of the location
                Location loc = new Location(row, col);
                Actor cell = this.getActor(row, col);
                int neighbors = grid.getNeighbors(loc).size();
                if ((neighbors == 3) || (cell != null && neighbors == 2))
                {
                    //If the location satifies the requirements for a live cell, a rock actor will be placed
                    newGrid.put(loc, new Rock());                
                }
            }
        }
        world.setGrid(newGrid);
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        //initializes a new game of life object
        GameOfLife game = new GameOfLife();
        while(true){           
            //Runs create next generation every 500 milliseconds(half a second)
            Thread.sleep(500);
            game.createNextGeneration();
        }
    }
}
