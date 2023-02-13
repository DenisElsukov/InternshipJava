package com.internship.game.quests;
/**
 * Need to assign step-check's indicator and check it before any next step
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatsMyNameQuest {
    static String answer;
    final static String RIGHT_ANSWER = "Artas";
    final static String YES_ANSWER = "yes";
    final static String NO_ANSWER = "no";
    final static String WRONG_ANSWER = "Wrong answer";
    static boolean nextStep;
    static boolean endQuest;
    static boolean winner;



    public static void main(String[] args) {
        WhatsMyNameQuest quest = new WhatsMyNameQuest();
        quest.firstLoop();
        quest.secondLoop();
    }

    void firstLoop() {
        System.out.println("Hello, Adventure. Glad to see you");
        do {
            System.out.println("I'll ask you a question. If you answer correctly, you get a reward. If you're wrong, you walk away in disgrace.");
            System.out.println("Are you ready to hear the riddle?");
            yesOrNowAnswer();
            if (nextStep) break;
            System.out.println("Do you want to leave?");
            yesOrNowAnswer();
            if (nextStep) {
                System.out.println("It's your choice");
                endQuest = true;
                break;
            }
            System.out.println("Your uncertainty is testing my patience. Are you sure you're ready for my test?");
            yesOrNowAnswer();
            if (!nextStep) {
                endQuest = true;
                break;
            }
            System.out.println("Do you remember the conditions?");
            yesOrNowAnswer();
            if (nextStep) break;
        } while(true);
    }

    void secondLoop() {
        do {
            if(endQuest) break;
            System.out.println("I found the sword, it was my goal,");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I lost my home, but gained fame.");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Frostmourne was stole my sinful soul...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("D'you know, wayfarer, what's my name?");

            winLose();
        } while(!endQuest);
        System.out.println("Удачи путник");
    }

    String inputAnswer () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            try {
//                System.in.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

    }
    void yesOrNowAnswer () {
        answer = WRONG_ANSWER;
        do {
            switch (inputAnswer().toLowerCase()) {
                case YES_ANSWER -> answer = YES_ANSWER;
                case NO_ANSWER -> answer = NO_ANSWER;
                default -> System.out.println("Please, input correct answer");
            }
        } while (answer.equals(WRONG_ANSWER));
        switch (answer){
            case YES_ANSWER -> nextStep = true;
            case NO_ANSWER -> nextStep = false;
        }
    }
    void winLose () {
        do {
            answer = inputAnswer();
            if(answer.equalsIgnoreCase(RIGHT_ANSWER)) winner = true;
            System.out.println("Are you sure?");
            if (inputAnswer().equalsIgnoreCase(YES_ANSWER)) break;
        } while (true);

        if (winner) {
            System.out.println("Вот твоя награда");
        }
        else System.out.println("Сожалею, это не " + answer + ". Правильный ответ: " + RIGHT_ANSWER);

        endQuest = true;
    }


}
