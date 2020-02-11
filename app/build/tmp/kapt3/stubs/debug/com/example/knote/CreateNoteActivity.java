package com.example.knote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\bH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/knote/CreateNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appDatabase", "Lcom/example/knote/AppDatabase;", "getCurrentDateTime", "", "init", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveToDb", "InsertNote", "app_debug"})
public final class CreateNoteActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.knote.AppDatabase appDatabase;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final void saveToDb() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentDateTime() {
        return null;
    }
    
    public CreateNoteActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u0011\u001a\u00020\u00032\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0013\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/example/knote/CreateNoteActivity$InsertNote;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "context", "Lcom/example/knote/CreateNoteActivity;", "note", "Lcom/example/knote/Note;", "(Lcom/example/knote/CreateNoteActivity;Lcom/example/knote/Note;)V", "getContext", "()Lcom/example/knote/CreateNoteActivity;", "setContext", "(Lcom/example/knote/CreateNoteActivity;)V", "getNote", "()Lcom/example/knote/Note;", "setNote", "(Lcom/example/knote/Note;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "onPostExecute", "", "bool", "(Ljava/lang/Boolean;)V", "app_debug"})
    static final class InsertNote extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.NotNull()
        private com.example.knote.CreateNoteActivity context;
        @org.jetbrains.annotations.NotNull()
        private com.example.knote.Note note;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean bool) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.knote.CreateNoteActivity getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        com.example.knote.CreateNoteActivity p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.knote.Note getNote() {
            return null;
        }
        
        public final void setNote(@org.jetbrains.annotations.NotNull()
        com.example.knote.Note p0) {
        }
        
        public InsertNote(@org.jetbrains.annotations.NotNull()
        com.example.knote.CreateNoteActivity context, @org.jetbrains.annotations.NotNull()
        com.example.knote.Note note) {
            super();
        }
    }
}