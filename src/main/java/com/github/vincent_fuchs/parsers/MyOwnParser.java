package com.github.vincent_fuchs.parsers;

import com.societegenerale.githubcrawler.IndicatorDefinition;
import com.societegenerale.githubcrawler.parsers.FileContentParser;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Slf4j
@Component
public class MyOwnParser implements FileContentParser {

    public MyOwnParser() {

        log.info("my own parser gets instantiated !");

    }

    @NotNull
    public String getNameInConfig() {
        return "MY OWN PARSER";
    }

    @NotNull
    @Override
    public Map<String, String> parseFileContentForIndicator(String s, String s1, IndicatorDefinition indicatorDefinition) {
        return Collections.emptyMap();
    }
}
