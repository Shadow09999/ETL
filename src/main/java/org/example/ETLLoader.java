package org.example;


public interface ETLLoader {
    void load(ETLExtractor extractor, ETLTransformer transformer);
}
