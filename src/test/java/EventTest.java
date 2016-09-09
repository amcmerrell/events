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

}