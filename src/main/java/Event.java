public class Event {
  private int mAttendees;
  private String mFood;
  private boolean mBar;
  private boolean mBand;
  private int mCostPerAttendee;
  private int mTotalPrice;

  public Event(int attendees, String food) {
    mAttendees = attendees;
    mFood = food;
    mBar = false;
    mBand = false;
    mCostPerAttendee = 5;
    mTotalPrice = 0;
  }

  public int setCostPerAttendee() {
    if (mAttendees <= 100 && mAttendees > 0) {
      mCostPerAttendee = 5;
    } else if (mAttendees > 100) {
      mCostPerAttendee = 7;
    } else {
      mCostPerAttendee = 0;
    }
    return mCostPerAttendee;
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

  public int getCostPerAttendee() {
    return mCostPerAttendee;
  }

}
