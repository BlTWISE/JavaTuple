/**
 * Pairs are generalized tuples that can contain any two linked types.
 * @author BITWISE
 *
 * @param <X> First object in the pair. Referred to as the first.
 * @param <Y> Second object in the pair. Referred to as the second.
 */
public class Pair<X, Y> {
	
	/**
	 * The first object.
	 */
	private X x;
	
	/**
	 * The last object.
	 */
	private Y y;

	/**
	 * Set the first item.
	 * @param item The new object value.
	 */
	public void setFirst(X item) 
	{
		this.x = item;
	}
	
	/**
	 * Set the last item.
	 * @param item The new last object value.
	 */
	public void setLast(Y item) 
	{
		this.y = item;
	}
	
	/**
	 * Set both values at once.
	 * @param item1 The new object value.
	 * @param item2 The new last object value.
	 */
	public void set(X item1, Y item2)
	{
		this.setFirst(item1);
		this.setLast(item2);
	}
	
	/**
	 * Returns the first object in the pair.
	 * @return First object in the pair.
	 */
	public X first() 
	{
		return this.x;
	}
	
	/**
	 * Return the second object in the pair.
	 * @return Second object in the pair.
	 */
	public Y last() 
	{
		return this.y;
	}
	
	/**
	 * Default initializer.
	 */
	public Pair() 
	{
		
	}
	
	/**
	 * Initialize a pair.
	 * @param x The first value.
	 * @param y The second value.
	 */
	public Pair(X x, Y y) 
	{
		this.set(x, y);
	}
	
}
