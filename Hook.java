/**
 * Activity 4.9.3
 */
public class Hook extends LakeObject
{
  private int strength;

  /*
    Step 2:
    Modify your Hook class as shown above.
    Initialize the strength variable in a new no-arg constructor.
    Update the first line of the class so strength is only initialized within the constructor.
  */
  public Hook()
  {
      //Step 10
      super();
      setCost(15);
      strength = 55; 
  }

  /*---------- accessor ----------*/
  public int getStrength() 
  {
    return strength; // This return will be updated in the next activity
    //return strength;
  }

  @Override
public String say()
{
  return "You now have a hook!";
}

}