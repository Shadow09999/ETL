package org.example.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.ETLExtractor;
import org.example.ETLLoader;
import org.example.ETLTransformer;

public class ExcelLoader implements ETLLoader {
    final Logger logger = LoggerFactory.getLogger(org.example.loader.ExcelLoader.class);

    @Override
    public void load(ETLExtractor extractor, ETLTransformer transformer) {
        // TODO Auto-generated method stub

    }

}
