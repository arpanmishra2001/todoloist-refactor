package com.example.android.todolist.database;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TaskContentProvider extends ContentProvider {

    private TaskDbHelper mTaskDbHelper;


    @Override
    public boolean onCreate() {
        Context context = getContext();
        mTaskDbHelper = new TaskDbHelper(context);
        return true;
    }


    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection,
                        @Nullable String selection, @Nullable String[] selectionArgs,
                        @Nullable String sortOrder) {
       throw  new UnsupportedOperationException("Not Yet Implemented");
    }


    @Override
    public String getType(@NonNull Uri uri) {
        throw  new UnsupportedOperationException("Not Yet Implemented");
    }


    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        throw  new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection,
                      @Nullable String[] selectionArgs) {
        throw  new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values,
                      @Nullable String selection, @Nullable String[] selectionArgs) {
        throw  new UnsupportedOperationException("Not Yet Implemented");
    }
}
