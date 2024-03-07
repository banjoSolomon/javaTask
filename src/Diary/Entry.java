package Diary;

import java.time.LocalDate;

public class Entry {
    private static int nextId = 1;
    private String name;
    private String password;
    private int id;
    private LocalDate dateCreated;

    public Entry(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = nextId++;
        this.dateCreated = LocalDate.now();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getTitle() {
        return name;
    }

    public String getBody() {
        return  password;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
}
