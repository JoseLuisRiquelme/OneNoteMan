package cl.onm.onenoteman.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import cl.onm.onenoteman.ui.theme.BabyBlue
import cl.onm.onenoteman.ui.theme.LightGreen
import cl.onm.onenoteman.ui.theme.RedOrange
import cl.onm.onenoteman.ui.theme.RedPink
import cl.onm.onenoteman.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violet,
            BabyBlue,
            RedPink
        )
    }
}

class InvalidNoteException(message: String): Exception(message)