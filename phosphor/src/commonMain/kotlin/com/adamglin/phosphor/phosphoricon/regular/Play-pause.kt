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

public val RegularGroup.`Play-pause`: ImageVector
    get() {
        if (`_play-pause` != null) {
            return `_play-pause`!!
        }
        `_play-pause` = Builder(name = "Play-pause", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 64.0f)
                lineTo(184.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(224.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(216.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 56.0f)
                close()
                moveTo(144.0f, 128.0f)
                arcToRelative(15.76f, 15.76f, 0.0f, false, true, -7.33f, 13.34f)
                lineTo(48.48f, 197.49f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 24.0f, 184.15f)
                lineTo(24.0f, 71.85f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 48.48f, 58.51f)
                lineToRelative(88.19f, 56.15f)
                arcTo(15.76f, 15.76f, 0.0f, false, true, 144.0f, 128.0f)
                close()
                moveTo(127.82f, 128.0f)
                lineTo(40.0f, 72.08f)
                lineTo(40.0f, 183.93f)
                close()
            }
        }
        .build()
        return `_play-pause`!!
    }

private var `_play-pause`: ImageVector? = null
