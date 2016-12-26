package at.fhjoanneum.ippr.processengine.parser.db;

import org.springframework.stereotype.Component;

@Component
public class DbStringParser implements DbParser<String> {

  @Override
  public String parse(final Object value) {
    return String.valueOf(value);
  }

}
