package com.example.knote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/example/knote/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/knote/NoteAdapter;", "appDatabase", "Lcom/example/knote/AppDatabase;", "notes", "Ljava/util/ArrayList;", "Lcom/example/knote/Note;", "getNotes", "()Ljava/util/ArrayList;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onData", "note", "", "GetNote", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.knote.AppDatabase appDatabase;
    private com.example.knote.NoteAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.knote.Note> notes = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.knote.Note> getNotes() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.knote.Note> note) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/knote/MainActivity$GetNote;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/example/knote/Note;", "context", "Lcom/example/knote/MainActivity;", "(Lcom/example/knote/MainActivity;)V", "getContext", "()Lcom/example/knote/MainActivity;", "setContext", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/List;", "onPostExecute", "", "noteList", "app_debug"})
    static final class GetNote extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.example.knote.Note>> {
        @org.jetbrains.annotations.NotNull()
        private com.example.knote.MainActivity context;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.List<com.example.knote.Note> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.util.List<com.example.knote.Note> noteList) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.knote.MainActivity getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        com.example.knote.MainActivity p0) {
        }
        
        public GetNote(@org.jetbrains.annotations.NotNull()
        com.example.knote.MainActivity context) {
            super();
        }
    }
}