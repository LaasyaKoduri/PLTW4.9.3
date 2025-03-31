/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    @Override
    public String say()
    {
      return "You now have fish!";
    }

    @Override
    public int getCost() {
        return super.getWeight() * super.getCost();
    }
}