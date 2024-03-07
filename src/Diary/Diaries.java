package Diary;

import myDiary.MyDiary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<MyDiary> diaryList;
    public Diaries() {
        this.diaryList = new ArrayList<>();

    }



    public void addDiary(String name, String password) {
        MyDiary diary = new MyDiary(name, password);
        diaryList.add(diary);

    }

    public List<MyDiary> getDiaries() {
        return diaryList;
    }

    public MyDiary findDiaryByUserName(String userName) {
        for(MyDiary diary : diaryList){
            if(diary.getUserName().equals(userName)){
                return diary;
            }
        }
        return null;
    }

    public void deleteDiary(String userName) {
        MyDiary diaryTODelete = findDiaryByUserName(userName);
        if (diaryTODelete != null) {
            diaryList.remove(diaryTODelete);
        }else{
            throw new IllegalArgumentException("Diary not found for userName");
        }
        }
    }

