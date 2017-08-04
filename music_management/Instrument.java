package music_management;
import behaviours.*;

public abstract class Instrument implements Playable, Sellable{

  private InstrumentColour colour;
  private InstrumentType type;

  public Instrument(InstrumentColour colour, InstrumentType type){

    this.colour = colour;
    this.type = type;

  }
  public abstract String play();

  public abstract int calculateMarkUp(int wholesale, int retail);
}