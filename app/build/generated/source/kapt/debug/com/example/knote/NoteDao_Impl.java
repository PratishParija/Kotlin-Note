package com.example.knote;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNote;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `notes`(`id`,`title`,`content`,`date`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Note value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
      }
    };
  }

  @Override
  public void insert(Note... note) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNote.insert(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Note> getAll() {
    final String _sql = "SELECT * FROM notes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfContent = _cursor.getColumnIndexOrThrow("content");
      final int _cursorIndexOfDate = _cursor.getColumnIndexOrThrow("date");
      final List<Note> _result = new ArrayList<Note>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Note _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpContent;
        _tmpContent = _cursor.getString(_cursorIndexOfContent);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        _item = new Note(_tmpId,_tmpTitle,_tmpContent,_tmpDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
