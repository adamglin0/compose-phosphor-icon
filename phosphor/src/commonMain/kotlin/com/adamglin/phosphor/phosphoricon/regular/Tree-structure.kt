package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Tree-structure`: ImageVector
    get() {
        if (`_tree-structure` != null) {
            return `_tree-structure`!!
        }
        `_tree-structure` = Builder(name = "Tree-structure", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 112.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(160.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(144.0f, 64.0f)
                lineTo(128.0f, 64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(32.0f)
                lineTo(72.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 96.0f)
                lineTo(24.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(56.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(160.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineTo(128.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(144.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 112.0f)
                close()
                moveTo(56.0f, 144.0f)
                lineTo(24.0f, 144.0f)
                lineTo(24.0f, 112.0f)
                lineTo(56.0f, 112.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(160.0f, 160.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                lineTo(160.0f, 208.0f)
                close()
                moveTo(160.0f, 48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(208.0f, 96.0f)
                lineTo(160.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_tree-structure`!!
    }

private var `_tree-structure`: ImageVector? = null
