package com.adamglin.phosphoricon

import androidx.compose.ui.graphics.vector.ImageVector
import com.adamglin.phosphoricon.phosphoricons.AllIcons
import com.adamglin.phosphoricon.phosphoricons.Bold
import com.adamglin.phosphoricon.phosphoricons.Duotone
import com.adamglin.phosphoricon.phosphoricons.Fill
import com.adamglin.phosphoricon.phosphoricons.Light
import com.adamglin.phosphoricon.phosphoricons.Regular
import com.adamglin.phosphoricon.phosphoricons.Thin
import kotlin.collections.List as ____KtList

public object PhosphorIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhosphorIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Fill.AllIcons + Duotone.AllIcons + Thin.AllIcons + Bold.AllIcons + Light.AllIcons +
        Regular.AllIcons + listOf()
    return __AllIcons!!
  }
