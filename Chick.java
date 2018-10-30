class Chick implements Animal 
{
  private String myType;
  private String mySound;
  public Chick(String type, String sound)
  {
    myType = type;
    mySound = sound;
  }
  public Chick(String type, String sound, String sound2)
  {
    myType = "chick";
    if((int)(Math.random()*2) == 0)
    {
      mySound = sound;
    }
    else
    {
      mySound = sound2;
    }
  }
  public String getSound()
  {
    return mySound;
  }
  public String getType()
  {
    return myType;
  }
}
