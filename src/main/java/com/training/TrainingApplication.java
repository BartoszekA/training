package com.training;

import com.training.firststeps.ChristmasTree;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {
        ChristmasTree.drawChristmasTree(10);
        //NewChristmasTree.drawTrunk(4);

        //SpringApplication.run(TrainingApplication.class, args);
    }
}
