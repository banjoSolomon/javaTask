package Diary;

import myDiary.MyDiary;

import java.util.List;
import java.util.Scanner;

public class MainDiary {
    public static void main(String[] args) {
        Diaries diaries = new Diaries();
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO SEMICOLON DIARY");

        System.out.println("Enter UserName for Diary 1:");
        String userName1 = scanner.nextLine();

        System.out.println("Enter Password for Diary 1:");
        String password1 = scanner.nextLine();

        diaries.addDiary(userName1, password1);


        System.out.println("Enter UserName for Diary 2:");
        String userName2 = scanner.nextLine();

        System.out.println("Enter Password for Diary 2:");
        String password2 = scanner.nextLine();

        diaries.addDiary(userName2, password2);


        List<MyDiary> diaryList = diaries.getDiaries();
        for (MyDiary diary : diaryList) {
            System.out.println("Diary Details:");
            System.out.println("UserName: " + diary.getUserName());
            System.out.println("Password: " + diary.getPassword());
            System.out.println("Is Locked: " + diary.isLocked());


            System.out.println("Do you want to lock this diary? (yes/no):");
            String lockChoice = scanner.nextLine();
            if ("yes".equalsIgnoreCase(lockChoice)) {
                diary.lockDiary();
                System.out.println("Diary is now locked.");
            }


            System.out.println("Enter Title for the new entry:");
            String entryTitle = scanner.nextLine();

            System.out.println("Enter Body for the new entry:");
            String entryBody = scanner.nextLine();


            Entry newEntry = diary.createEntry(entryTitle, entryBody, diary.getEntries().size() + 1);
            System.out.println("New Entry Created with ID: " + newEntry.getId());

            List<Entry> entries = diary.getEntries();
            for (Entry entry : entries) {
                System.out.println("Entry ID: " + entry.getId());
                System.out.println("Entry Title: " + entry.getName());
                System.out.println("Entry Body: " + entry.getBody());
                System.out.println("Entry Date Created: " + entry.getDateCreated());
                System.out.println("THANK U FOR USING SEMICOLON DIARY>>>>>>>>>APP STILL UNDER REFACTORING");
            }
        }
    }
}