package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList is a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed).
 * It also exports an accessor (totalAdded) for this count.
 * 
 * @author Nora Shoemaker
 */
public class DelegationSortedIntList implements IntegerList {
    
    /** The SortedIntList instance to which we delegate most operations. */
    private final SortedIntList sortedList;
    
    /** Counter for the number of elements added to the list. */
    private int numberAdded;

    /**
     * Default constructor that initializes the list and sets the added elements counter to zero.
     */
    public DelegationSortedIntList() {
        this.sortedList = new SortedIntList();
        this.numberAdded = 0;
    }

    /**
     * Adds a number to the list and increments the added elements counter.
     * 
     * @param num The number to be added.
     * @return true if the number was added successfully, false otherwise.
     */
    @Override
    public boolean add(int num) {
        numberAdded++;
        return sortedList.add(num);
    }

    /**
     * Adds all numbers from another list to this list and increments the added elements counter.
     * 
     * @param list The list of numbers to be added.
     * @return true if all numbers were added successfully, false otherwise.
     */
    @Override
    public boolean addAll(IntegerList list) {
        numberAdded += list.size();
        return sortedList.addAll(list);
    }

    /**
     * Retrieves a number from the list at a given index.
     * 
     * @param index The index of the number to be retrieved.
     * @return The number at the specified index.
     */
    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    /**
     * Removes a number from the list.
     * 
     * @param num The number to be removed.
     * @return true if the number was removed successfully, false otherwise.
     */
    @Override
    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    /**
     * Removes all numbers from another list from this list.
     * 
     * @param list The list of numbers to be removed.
     * @return true if all numbers were removed successfully, false otherwise.
     */
    @Override
    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }

    /**
     * Retrieves the size of the list.
     * 
     * @return The size of the list.
     */
    @Override
    public int size() {
        return sortedList.size();
    }

    /**
     * Retrieves the total number of individual elements added to the list.
     * 
     * @return The total number of elements added.
     */
    public int getTotalAdded() {
        return this.numberAdded;
    }
}
