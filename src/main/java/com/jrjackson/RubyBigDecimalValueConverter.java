package com.jrjackson;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import org.jruby.Ruby;
import org.jruby.RubyObject;

/**
 *
 * @author Guy Boertje
 */
public class RubyBigDecimalValueConverter implements RubyConverter {

    @Override
    public RubyObject convert(Ruby ruby, JsonParser jp) throws IOException {
        return RubyUtils.rubyBigDecimal(ruby, jp.getDecimalValue());
    }
}
