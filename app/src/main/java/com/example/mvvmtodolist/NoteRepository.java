package com.example.mvvmtodolist;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class NoteRepository {
    private NoteDao noteDao;
    private LiveData<List<Note>> allnotes;

    public NoteRepository(Application application){
        NoteDatabse databse = NoteDatabse.getInstance(application);
        noteDao = databse.noteDao();
        allnotes = noteDao.getAllNotes();
    }
    public void insert(Note note){

    }
    public void update(Note note){

    }
    public void delete(Note note){

    }
    public void deleteAllNotes(){

    }
    public LiveData<List<Note>> getAllNotes(){
        return allnotes;
    }
}
