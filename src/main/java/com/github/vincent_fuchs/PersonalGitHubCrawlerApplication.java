package com.github.vincent_fuchs;

import com.github.vincent_fuchs.output.CustomOutput;
import com.societegenerale.githubcrawler.GitHubCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.lang.System.exit;

@SpringBootApplication
@Configuration
public class PersonalGitHubCrawlerApplication implements CommandLineRunner {

    @Autowired
    private GitHubCrawler crawler;

    public static void main(String[] args) {

        SpringApplication.run(PersonalGitHubCrawlerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        crawler.crawl();

        exit(0);
    }

    @Bean
    public CustomOutput customOutput(){
        return new CustomOutput();
    }

}
