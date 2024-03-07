package Diary;

import myDiary.MyDiary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private MyDiary diary;
    private Entry entry;
    private Entry createdEntry;
    private Diaries diaries;

    @BeforeEach
    public void setUp(){
        diary = new MyDiary("Banjo Solomon", "2468");
        entry = new Entry("Enter name", "Enter password", 2463);
        createdEntry = new Entry("Enter name", "Enter password", 2463);
        diaries = new Diaries();
    }
    @Test
    public void testDiaryHasAUserName(){
        assertEquals("Banjo Solomon",  diary.getUserName());

    }

    @Test
    public void testDiaryHasAPassword(){
        diary = new MyDiary("Banjo Solomon","2468");
        String password = "2468";
        diary.setPassword(password);
        String actualPassword = diary.getPassword();
        assertEquals(password, actualPassword);

    }

    @Test
    public void testDiary_Can_BeUnlocked_ByDefault_And_DiaryCan_BeLocked(){
       diary = new MyDiary("Banjo Solomon", "2468");
       assertFalse(diary.isLocked());
       diary.setLocked(true);
       assertTrue(diary.isLocked());

    }

    @Test
    public void testDiaryEntry(){
        diary= new MyDiary("Banjo Solomon", "2468");
        Entry entry = new Entry("Enter Name", "Enter Password",2463);
        diary.addEntry(entry);
        List<Entry> entries = diary.getEntries();
        assertTrue(entries.contains(entry));
    }

    @Test
    public void testUnlockDiary(){
        diary= new MyDiary("Banjo Solomon", "2468");
        diary.unlockDiary("2468");
        diary.setLocked(true);

        diary.unlockDiary("2468");
        assertFalse(diary.isLocked());

    }
    @Test
    public void testLockDiary(){
        diary= new MyDiary("Banjo Solomon", "2468");
        diary.lockDiary();
        assertTrue(diary.isLocked());

    }
    @Test
    public void testToCreateAnEntry(){
        diary= new MyDiary("Banjo Solomon", "2468");
        diary.createEntry(" My Life", "God help me", 3452);
        diary.addEntry(entry);
        List<Entry> entries = diary.getEntries();
        assertTrue(entries.contains(entry));
    }

    @Test
    public void testToDeleteEntry(){
        diary= new MyDiary("Banjo Solomon", "2468");
        diary.createEntry("My Girl", "She break my heart", 2463);
        diary.addEntry(entry);
        diary.deleteEntry(createdEntry.getId());

        List<Entry> entries = diary.getEntries();
        assertFalse(entries.contains(createdEntry));

    }

    @Test
    public void testToFindEntryById(){
        diary= new MyDiary("Banjo Solomon", "Id2468");
        Entry createdEntry = diary.createEntry("Chelsea win", "Jackson scores",2463);
        Entry foundEntry = diary.findEntryById(createdEntry.getId());
        assertNotNull(foundEntry);
        assertEquals(createdEntry,foundEntry);


    }

    @Test
    public void testToUpdateEntry(){
        diary= new MyDiary("Banjo Solomon", "Id2468");
        Entry createdEntry = diary.createEntry("Life At Semicolon", "E no easy i swear",2463);
        diary.updateEntry(createdEntry, "Kell Sam", "KS345", 3554);

        assertEquals("Kell Sam",createdEntry.getName());
        assertEquals("KS345",createdEntry.getPassword());
        assertEquals(3554,createdEntry.getId());

    }

    @Test
    public void testEntryHasATitleAndBody(){
        diary = new MyDiary("Banjo Solomon", "Id2468");
        Entry createdEntry = diary.createEntry("Life At Semicolon", "E no easy i swear",2463);
        assertNotNull(createdEntry.getTitle());
        assertNotNull(createdEntry.getBody());


    }

    @Test
    public void testDateCreatedInEntry(){
        Entry createdEntry = diary.createEntry("Life At Semicolon", "E no easy i swear",2463);
        assertNotNull(createdEntry.getDateCreated());
        assertEquals(LocalDate.now(), createdEntry.getDateCreated());

    }

    @Test
    public void testDiariesHasListDiary(){
        diaries = new Diaries();
        diary = new MyDiary("Banjo Solomon", "Id2468");
        diaries.addDiary("Justin Parker", "3458");
        List<MyDiary> diaryList = diaries.getDiaries();
        assertNotNull(diaryList);
    }

    @Test
    public void testFindDiaryByUserName(){
        diaries = new Diaries();
        diary = new MyDiary("Banjo Solomon", "Id2468");
        diaries .addDiary("Sam Walker", "231");
        diaries.addDiary("Divine", "290");
        MyDiary findDiary = diaries.findDiaryByUserName("Sam Walker");

        assertNotNull(findDiary);
        assertEquals("Sam Walker", findDiary.getUserName());
        assertEquals("231", findDiary.getPassword());

    }

    @Test
    public void testToDeleteDiary() {
        diaries = new Diaries();
        diaries.addDiary("Suzie", "290");
        diaries.addDiary("Sam Walker", "231");
        diaries.deleteDiary("Sam Walker");
        assertNull(diaries.findDiaryByUserName("Sam Walker"));

    }

    }
