package org.pentaho.nrgauge.domain;

public class Instant {

  private long timestamp;
  private boolean isOn1;
  private boolean isOn2;
  private boolean isOn3;


  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp( long timestamp ) {
    this.timestamp = timestamp;
  }

  public boolean isOn1() {
    return isOn1;
  }

  public void setOn1( boolean on1 ) {
    isOn1 = on1;
  }

  public boolean isOn2() {
    return isOn2;
  }

  public void setOn2( boolean on2 ) {
    isOn2 = on2;
  }

  public boolean isOn3() {
    return isOn3;
  }

  public void setOn3( boolean on3 ) {
    isOn3 = on3;
  }
}
