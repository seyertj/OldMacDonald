class NamedCow extends Cow
{
  private String cowName;
  private String nType;
  private String nSound;
  public NamedCow(String name, String type, String sound)
  {
    cowName = name;
    nType = type;
    nSound = sound;
  }
  public NamedCow()
  {
    cowName = "Cory";
    nType = "cow";
    nSound = "mooo";
  }
  public String getName()
  {
    return cowName;
  }
}
