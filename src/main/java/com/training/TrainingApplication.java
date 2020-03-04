package com.training;

import com.training.firststeps.Tree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {
        Tree.drawTree(4);
        //SpringApplication.run(TrainingApplication.class, args);
    }
}
