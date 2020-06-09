package org.example;

import java.util.Iterator;
import java.util.Map;

public interface ETLExtractor {
    Iterator<Map<String, Object>> walker();
}
