package com.example.studyjamsession3.pathway7.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface NoteDatabaseDao {

    @Insert
    suspend fun insert(note: Note)

    /**
     * When updating a row with a value already set in a column,
     * replaces the old value with the new one.
     *
     * @param night new value to write
     */
    @Update
    suspend fun update(note: Note)

    /**
     * Selects and returns the row that matches the supplied start time, which is our key.
     *
     * @param key startTimeMilli to match
     */
    @Query("SELECT * from note_table WHERE noteid = :key")
    suspend fun get(key: Long): Note

    /**
     * Deletes all values from the table.
     *
     * This does not delete the table, only its contents.
     */
    @Query("DELETE FROM note_table")
    suspend fun clear()

    /**
     * Selects and returns all rows in the table,
     *
     * sorted by start time in descending order.
     */
    @Query("SELECT * FROM note_table ORDER BY noteid DESC")
    fun getAllNotes(): LiveData<List<Note>>

    /**
     * Selects and returns the latest night.
     */
    @Query("SELECT * FROM note_table ORDER BY noteid DESC LIMIT 1")
    suspend fun getTopNote(): Note?

    /**
     * Selects and returns the night with given nightId.
     */
    @Query("SELECT * from note_table WHERE noteid = :key")
    fun getNoteWithId(key: Long): LiveData<Note>
}