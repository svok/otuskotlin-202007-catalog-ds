package ru.otus.otuskotlin.catalogue.transport.common.models.items

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import ru.otus.otuskotlin.catalogue.transport.common.models.CatalogueDbModes

//
//@Serializable
//abstract class ItemCreateQuery (
//    @Transient open var categoryId: String? = null
//)

@Serializable
sealed class ItemCreateQuery(
   @Transient open var categoryId: String? = null,
   @Transient open var debug: Debug? = null
) {
    @Serializable
    data class Debug (
            val stub: StubCases? = null,
            val dbMode: CatalogueDbModes? = null
    )

    @Serializable
    enum class StubCases{
        NONE,
        SUCCESS
    }
}

@Serializable
@SerialName("note")
data class NoteCreateQuery(
    var id: String? = null,
    override var categoryId: String? = null,
    var header: String? = null,
    var description: String? = null,
    var preview: String? = null,
    override var debug: Debug? = null
): ItemCreateQuery(
    categoryId = categoryId
)
