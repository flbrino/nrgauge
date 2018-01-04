package org.pentaho.nrgauge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class NrGaugeController {
  @Autowired
  JdbcTemplate jdbcTemplate;

  @RequestMapping( "/" )
  public String nrgauge( Map<String, Object> model ) {
    Event event = (Event) jdbcTemplate
      .queryForObject( "Select gadget1, gadget2, gadget3 from \"Events\" order by \"eventTime\" desc LIMIT 1",
        new Object[ 0 ],
        new EventRowMapper() );
    model.put( "value01", event.getBoolGadget1() );
    model.put( "value02", event.getBoolGadget2() );
    model.put( "value03", event.getBoolGadget3() );
    return "nrgauge";
  }
}
