package org.example.multitask.task;


import org.apache.commons.configuration.ConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.ETLExtractor;
import org.example.ETLLoader;
import org.example.ETLTransformer;
import org.example.config.*;
import org.example.multitask.Task;
import org.example.extractor.DatabaseExtractor;
import org.example.loader.DatabaseLoader;
import org.example.transformer.SimpleETLTransformer;

import java.io.File;

public class Table2TableTask implements Task {
    final Logger logger = LoggerFactory.getLogger(Table2TableTask.class);

    private String businessType;
    private File configuration;

    public Table2TableTask(String businessType, File configuration) {
        this.businessType = businessType;
        this.configuration = configuration;
    }

    public void execute() {
        try {
            ExtractConfig extractConfig = new SimpleExtractConfig(businessType, configuration);
            TransformConfig transformConfig = new SimpleTransformConfig(businessType, configuration);
            LoadConfig loadConfig = new SimpleLoadConfig(businessType, configuration);

            ETLExtractor extractor = new DatabaseExtractor(extractConfig);
            ETLTransformer transformer = new SimpleETLTransformer(transformConfig);
            ETLLoader loader = new DatabaseLoader(loadConfig);

            loader.load(extractor, transformer);
        } catch (ConfigurationException e) {
            logger.error("配置异常 !", e);
        }
    }
}
