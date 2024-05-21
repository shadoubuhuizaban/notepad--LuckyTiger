package com.example.lucky_tiger;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lucky_tiger.bean.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteDbOpenHelper extends SQLiteOpenHelper {
    private  static final  String DB_NAME = "noteSQLite.db";
    private  static final String TABLE_NAME_NOTE = "note";
    private static  final  String CREATE_TABLE_SQL = "create table " + TABLE_NAME_NOTE +" (id integer primary key autoincrement, title text, content text, create_time text)";
    public  NoteDbOpenHelper(Context context) {super(context, DB_NAME, null, 1);}
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SQL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long insertData(Note note) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("title", note.getTitle());
        values.put("content", note.getContent());
        values.put("create_time", note.getCreatedTime());
        return db.insert(TABLE_NAME_NOTE, null, values);
    }

    public long updateData(Note note) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("title",note.getTitle());
        values.put("content",note.getContent());
        values.put("create_time",note.getCreatedTime());
        return db.update(TABLE_NAME_NOTE,values,"id like ?", new String[]{note.getId()});

    }

    public int deleteFromDbById(String id) {
        SQLiteDatabase db = getWritableDatabase();
        return db.delete(TABLE_NAME_NOTE, "id is ?", new String[]{id});
    }

    public List<Note> queryAllFromDb() {
        SQLiteDatabase db = getWritableDatabase();
        List<Note> noteList = new ArrayList<>();

        Cursor cursor = db.query(TABLE_NAME_NOTE, null, null, null,null,null,null);

        if(cursor != null ) {
            while(cursor.moveToNext()) {
                String id = cursor.getString(cursor.getColumnIndexOrThrow("id"));
                String title = cursor.getString(cursor.getColumnIndexOrThrow("title"));
                String content = cursor.getString(cursor.getColumnIndexOrThrow("content"));
                String createTime = cursor.getString(cursor.getColumnIndexOrThrow("create_time"));

                Note note = new Note();
                note.setId(id);
                note.setTitle(title);
                note.setContent(content);
                note.setCreatedTime(createTime);

                noteList.add(note);

            }
            cursor.close();
        }
        return noteList;
    }

}
