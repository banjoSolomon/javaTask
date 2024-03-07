package myDiary;

import Diary.Entry;

import java.util.ArrayList;
import java.util.List;

public class MyDiary {
    private String userName;
    private String password;
    private boolean isLocked = false;
    private List<Entry> entries;

    public MyDiary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.entries = new ArrayList<>();

    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        this.isLocked = locked;

    }

    public void addEntry(Entry entry) {

        entries.add(entry);
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void unlockDiary(String password) {
        if (password.equals(this.password)) isLocked = false;

    }

    public void lockDiary() {
        if (!isLocked) isLocked = true;

    }

    public Entry createEntry(String title, String body, int id) {
        Entry entry = new Entry(title, body, id);
        addEntry(entry);

        return entry;
    }


    public void deleteEntry(int id) {
      Entry  entryToDelete = findEntryById(id);
      if(entryToDelete != null)
          this.entries.remove(entryToDelete);
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId()==(id)) {
                return entry;

            }

        }
        return null;
    }

    public void updateEntry(Entry entry,String newName, String newPassword, int newId) {
        if(entries.contains(entry)) {
            entry.setName(newName);
            entry.setPassword(newPassword);
            entry.setId(newId);
        }else{
            throw new IllegalArgumentException("Entry not found");
        }


    }
}
