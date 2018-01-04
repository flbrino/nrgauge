package org.pentaho.nrgauge.controller;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EventRowMapper implements RowMapper {

  public Object mapRow( ResultSet rs, int rowNum ) throws SQLException {
    Event event = new Event(
      rs.getInt( 1 ),
      rs.getInt( 2 ),
      rs.getInt( 3 )
    );
    return event;
  }
}
