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
    mCostPerAttendee = 0;
    mTotalPrice = 0;
  }

  public int setCostPerAttendee() {
    if (mAttendees > 0 && mAttendees <= 100) {
      mCostPerAttendee = 5;
    } else if (mAttendees > 100) {
      mCostPerAttendee = 7;
    } else {
      mCostPerAttendee = 0;
    }

    if (mFood.equalsIgnoreCase("full dinner menu")) {
      mCostPerAttendee += 10;
    } else if (mFood.equalsIgnoreCase("snacks")) {
      mCostPerAttendee += 5;
    }

    if (mBar) {
      mCostPerAttendee += 3;
    }
    return mCostPerAttendee;
  }

  public boolean setBarTrue() {
    mBar = true;
    return mBar;
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
