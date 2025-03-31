/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
  //Step 11
  public Boot()
  {
      super();  
      setCost(0);  
  }

    @Override
    public String say()
    {
      return "You now have a boot!";
    }

    //Step 16
    @Override
    public boolean wasCaught(Hook h) {
      return true;
    }
}
