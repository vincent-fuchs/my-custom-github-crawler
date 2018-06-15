package com.github.vincent_fuchs.output;

import com.societegenerale.githubcrawler.model.Repository;
import com.societegenerale.githubcrawler.output.GitHubCrawlerOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomOutput implements GitHubCrawlerOutput {

    public CustomOutput() {

        log.info("my custom output gets instantiated !");

    }

    @Override
    public void output(Repository repository) {
        log.info("own output is receiving some data !");
    }

}
