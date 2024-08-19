package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Play-pause-bold`: ImageVector
    get() {
        if (`_play-pause-bold` != null) {
            return `_play-pause-bold`!!
        }
        `_play-pause-bold` = Builder(name = "Play-pause-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 64.0f)
                lineTo(188.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(164.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(224.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(212.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(148.0f, 128.0f)
                arcToRelative(19.71f, 19.71f, 0.0f, false, true, -9.19f, 16.71f)
                lineTo(50.63f, 200.87f)
                arcTo(19.91f, 19.91f, 0.0f, false, true, 20.0f, 184.15f)
                lineTo(20.0f, 71.85f)
                arcTo(19.91f, 19.91f, 0.0f, false, true, 50.63f, 55.13f)
                lineToRelative(88.18f, 56.16f)
                arcTo(19.71f, 19.71f, 0.0f, false, true, 148.0f, 128.0f)
                close()
                moveTo(120.38f, 128.0f)
                lineTo(44.0f, 79.37f)
                verticalLineToRelative(97.26f)
                close()
            }
        }
        .build()
        return `_play-pause-bold`!!
    }

private var `_play-pause-bold`: ImageVector? = null
