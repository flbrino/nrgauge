package org.pentaho.nrgauge.controller;

public class Event {
  private int gadget1;
  private int gadget2;
  private int gadget3;

  public Event( int gadget1, int gadget2, int gadget3 ) {
    this.gadget1 = gadget1;
    this.gadget2 = gadget2;
    this.gadget3 = gadget3;
  }

  public long getGadget1() {
    return gadget1;
  }

  public long getGadget2() {
    return gadget2;
  }

  public long getGadget3() {
    return gadget3;
  }

  public boolean getBoolGadget1() {
    return gadget1 == 1;
  }

  public boolean getBoolGadget2() {
    return gadget2 == 1;
  }

  public boolean getBoolGadget3() {
    return gadget3 == 1;
  }
}
