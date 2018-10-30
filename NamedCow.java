class NamedCow extends Cow
{
  private String cowName;
  public NamedCow(String name, String type, String sound)
  {
    cowName = name;
    myType = type;
    mySound = sound;
  }
  public NamedCow()
  {
    cowName = "Cory";
    myType = "cow";
    mySound = "moo";
  }
  public String getName()
  {
    return cowName;
  }
}
