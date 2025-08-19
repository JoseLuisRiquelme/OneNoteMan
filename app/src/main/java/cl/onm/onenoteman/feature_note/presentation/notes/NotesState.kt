package cl.onm.onenoteman.feature_note.presentation.notes

import cl.onm.onenoteman.feature_note.domain.model.Note
import cl.onm.onenoteman.feature_note.domain.util.NoteOrder
import cl.onm.onenoteman.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
