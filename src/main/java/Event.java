public class Event {
  private int mAttendees;
  private String mFood;
  private boolean mBar;
  private boolean mBand;
  private int mPrice;

  public Event(int attendees, String food) {
    mAttendees = attendees;
    mFood = food;
    mBar = false;
    mBand = false;
    mPrice = 0;
  }

  public int getAttendees() {
    return mAttendees;
  }

  public String getFood() {
    return mFood;
  }

  public boolean getBar() {
    return mBar;
  }

  public boolean getBand() {
    return mBand;
  }

}
