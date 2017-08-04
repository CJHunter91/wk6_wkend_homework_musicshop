package music_management;

public class Guitar extends Instrument{

  int numberStrings;

  public Guitar(InstrumentColour colour, InstrumentType type, int numberStrings){
    super(colour, type);
    this.numberStrings = numberStrings;
  }

  public String play(){
    return "Strum";
  }
}