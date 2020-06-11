package org.example;

import org.example.extractor.DatabaseExtractor;
import org.example.config.ExtractConfig;
import org.example.config.SimpleExtractConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    private ETLExtractor extractor;

    private ExtractConfig extractconf;
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	extractconf = new SimpleExtractConfig("select");
	extractor = new DatabaseExtractor(extractconf);
	extractor.releaseAll();
    }
    
}
