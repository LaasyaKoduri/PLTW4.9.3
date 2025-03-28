/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
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
