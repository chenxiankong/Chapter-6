package com.byted.camp.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {
    public static final String SQL_CREATE_ENTRIES=
                "CREATE TABLE " +TodoEntry.TABLE_NAME+" ("+
                        TodoEntry._ID+" INTEGER PRIMARY KEY,"+
                        TodoEntry.COLUMN_CONTEXT +" TEXT,"+
                        TodoEntry.COLUMN_DONE +" TEXT," +
                        TodoEntry.COLUMN_PRI +" TEXT," +
                        TodoEntry.COLUMN_TIME +" TEXT)";

    public static final String SQL_DELETE_ENTRIES="DROP TABLE IF EXISTS "+TodoEntry.TABLE_NAME;

    // TODO 定义表结构和 SQL 语句常量
    public static class TodoEntry implements BaseColumns{
        public static final String TABLE_NAME="entry";
        public static final String COLUMN_DONE="done";
        public static final String COLUMN_TIME="time";
        public static final String COLUMN_CONTEXT="context";
        public static final String COLUMN_PRI="priority";
}
    private TodoContract() {
    }

}
