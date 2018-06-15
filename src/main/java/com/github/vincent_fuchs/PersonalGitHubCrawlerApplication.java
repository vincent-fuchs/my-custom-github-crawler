package com.github.vincent_fuchs;

import com.societegenerale.githubcrawler.EnableGitHubCrawler;
import com.societegenerale.githubcrawler.GitHubCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@EnableGitHubCrawler
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
    }

}
