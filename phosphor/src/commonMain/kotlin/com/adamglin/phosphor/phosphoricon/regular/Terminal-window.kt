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

public val RegularGroup.`Terminal-window`: ImageVector
    get() {
        if (`_terminal-window` != null) {
            return `_terminal-window`!!
        }
        `_terminal-window` = Builder(name = "Terminal-window", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.0f, 6.25f)
                lineToRelative(-40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.0f, -12.5f)
                lineTo(107.19f, 128.0f)
                lineTo(75.0f, 102.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.0f, -12.5f)
                lineToRelative(40.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 128.0f)
                close()
                moveTo(176.0f, 152.0f)
                lineTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 200.0f)
                lineTo(216.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_terminal-window`!!
    }

private var `_terminal-window`: ImageVector? = null
