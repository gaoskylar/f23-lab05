package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{

    /** Counter for the number of elements added to the list. */
    private int numberAdded;

    /**
     * Default constructor that initializes the list and sets the added elements counter to zero.
     */
    public InheritanceSortedIntList() {
        super();
        this.numberAdded = 0;
    }

    /**
     * Adds a number to the sorted list and increments the added elements counter.
     * 
     * @param num The number to be added.
     * @return {@code true} if the number was added successfully, {@code false} otherwise.
     */
    @Override
    public boolean add(int num) {
        numberAdded++;
        return super.add(num);
    }

    /**
     * Adds all numbers from another {@code IntegerList} to this sorted list.
     * 
     * @param num The list of numbers to be added.
     * @return {@code true} if all numbers were added successfully, {@code false} otherwise.
     */
    @Override
    public boolean addAll(IntegerList num) {
        return super.addAll(num);
    }

    /**
     * Retrieves the total number of individual elements added to the list.
     * 
     * @return The total number of elements added.
     */
    public int getTotalAdded(){
        return this.numberAdded;
    }
}