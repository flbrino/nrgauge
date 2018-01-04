package org.pentaho.nrgauge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StateService {
  @Autowired
  JdbcTemplate jdbcTemplate;

  @RequestMapping( "/getState" )
  public String getState( @RequestParam(value="id", required=true) int id ) {
    return (String) jdbcTemplate
      .queryForObject( getSQL( id ),
        String.class );
  }

  private String getSQL( int id ) {
    StringBuffer sb = new StringBuffer();

    sb.append( "Select " ).append( id == 1 ? "gadget1" : ( id == 2 ? "gadget2" : "gadget3" ) )
      .append( " from \"Events\" order by \"eventTime\" desc LIMIT 1" );
    return sb.toString();
  }

}
