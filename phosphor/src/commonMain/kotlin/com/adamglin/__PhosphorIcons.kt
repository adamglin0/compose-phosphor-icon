package com.adamglin

import androidx.compose.ui.graphics.vector.ImageVector
import com.adamglin.phosphoricons.AllIcons
import com.adamglin.phosphoricons.Bold
import com.adamglin.phosphoricons.Duotone
import com.adamglin.phosphoricons.Fill
import com.adamglin.phosphoricons.Light
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.Thin
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
