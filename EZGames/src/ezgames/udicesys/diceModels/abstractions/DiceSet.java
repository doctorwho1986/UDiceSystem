package ezgames.udicesys.diceModels.abstractions;

public interface DiceSet extends Iterable<Die>
{
	/**
	 * Checks to see if the specified {@code Die} is already in the {@code DiceSet}
	 * @param aDie - the {@code Die} that must be determined if it already exists in the
	 * {@code DiceSet}
	 * @return {@code true} if {@code aDie} is already in the {@code DiceSet}
	 */
	public abstract boolean contains(Die aDie);	
	/**
	 * Checks to see if there is a {@code Die} with the specified name
	 * @param name - the name of the {@code Die} you're searching for
	 * @return true if there is a {@code Die} with the specified name in the {@code DiceSet}
	 */
	public abstract boolean contains(String name);	
	/**
	 * @param index - index of wanted {@code Die} within the {@code DiceSet}
	 * @return the {@code Die} at the specified index
	 */
	public abstract Die get(int index);	
	/**
	 * @param name - name of the wanted {@code Die} within the {@code DiceSet}
	 * @return the {@code Die} with the specified name
	 */
	public abstract Die get(String name);	
	/**
	 * @param aDie - a {@code Die} within the {@code DiceSet}
	 * @return the index of the specified {@code Die}, or {@code -1} if the {@code Die} is not in the
	 * {@code DiceSet}
	 */
	public abstract int indexOf(Die aDie);	
	/**
	 * @param name - name of the {@code Die} within the DiceSet
	 * @return the index of the {@code Die} with the specified name, or {@code -1} if the {@code Die}
	 * is not in the {@code DiceSet}
	 */
	public abstract int indexOf(String name);	
	/**
	 * @return the {@code DiceSet}'s name
	 */
	public abstract String name();	
	/**
	 * @return the number of Dice  in the set
	 */
	public abstract int numberOfDice();
	/**
	 * @return a collection of the Relationships used in all of the Dice (multiple {@code Die} objects)
	 */
	public abstract Iterable<Relationship> listRelationships();
	
}