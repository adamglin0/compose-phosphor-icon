package com.adamglin.phosphor

import androidx.compose.ui.graphics.vector.ImageVector
import com.adamglin.phosphor.phosphoricon.AllIcons
import com.adamglin.phosphor.phosphoricon.Fill
import com.adamglin.phosphor.phosphoricon.Regular
import kotlin.collections.List as ____KtList

public object PhosphorIcon

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhosphorIcon.AllIcons: ____KtList<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons = Fill.AllIcons +
                Regular.AllIcons + listOf()
        return __AllIcons!!
    }
