package me.ibrahimsn.lib.internal.ext

import me.ibrahimsn.lib.internal.model.Character
import me.ibrahimsn.lib.internal.model.State

internal fun CharSequence?.prependPlus(): String {
    return StringBuilder()
        .append(Character.PLUS.char)
        .append(this)
        .toString()
}

internal fun Int?.orZero(): Int {
    return this ?: 0
}

internal fun CharSequence?.startsWithPlus(): Boolean {
    return this?.startsWith(Character.PLUS.char) == true
}

internal fun String?.clearSpaces(): String? {
    return this?.replace("\\s+", "")
}

internal fun <T> State.doIfAttached(block: State.Attached.() -> T): T? {
    if (this is State.Attached) return block.invoke(this)
    return null
}
