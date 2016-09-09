import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(50, "snacks");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsAttendees_50() {
    Event testEvent = new Event(50, "snacks");
    assertEquals(50, testEvent.getAttendees());
  }

  @Test
  public void newEvent_getsFood_snacks() {
    Event testEvent = new Event(50, "snacks");
    assertEquals("snacks", testEvent.getFood());
  }

  @Test
  public void newEvent_getsBar_false() {
    Event testEvent = new Event(50, "snacks");
    assertEquals(false, testEvent.getBar());
  }

  @Test
  public void newEvent_getsBand_false() {
    Event testEvent = new Event(50, "snacks");
    assertEquals(false, testEvent.getBand());
  }

  @Test
  public void newEvent_setsCostPerAttendeeByAttendeeValue_7() {
    Event testEvent = new Event(101, "none");
    assertEquals(7, testEvent.setCostPerAttendee());
  }

  @Test
  public void newEvent_setsCostPerAttendeeByFoodValue_15() {
    Event testEvent = new Event(50, "full dinner menu");
    assertEquals(15, testEvent.setCostPerAttendee());
  }

  @Test
  public void newEvent_setsBarTrue_true() {
    Event testEvent = new Event(50, "none");
    assertEquals(true, testEvent.setBarTrue());
  }

  @Test
  public void newEvent_setsCostPerAttendeeByBarValue_8() {
    Event testEvent = new Event(50, "none");
    testEvent.setBarTrue();
    assertEquals(8, testEvent.setCostPerAttendee());
  }

  @Test
  public void newEvent_setsBandTrue_true() {
    Event testEvent = new Event(50, "none");
    assertEquals(true, testEvent.setBandTrue());
  }

  @Test
  public void newEvent_setsTotalCost_250() {
    Event testEvent = new Event(50, "none");
    testEvent.setCostPerAttendee();
    assertEquals(250, testEvent.setTotalCost());
  }

  // @Test
  // public void newEvent_setsTotalCost_250() {
  //   Event testEvent = new Event(50, "none");
  //   testEvent.setCostPerAttendee();
  //   assertEquals(250, testEvent.setTotalCost());
  // }

}
