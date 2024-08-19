package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Play-pause-fill`: ImageVector
    get() {
        if (`_play-pause-fill` != null) {
            return `_play-pause-fill`!!
        }
        `_play-pause-fill` = Builder(name = "Play-pause-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(136.67f, 114.66f)
                lineTo(48.48f, 58.51f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 24.0f, 71.85f)
                verticalLineToRelative(112.3f)
                arcTo(15.83f, 15.83f, 0.0f, false, false, 32.23f, 198.0f)
                arcToRelative(15.95f, 15.95f, 0.0f, false, false, 16.25f, -0.53f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 0.0f, -26.68f)
                close()
            }
        }
        .build()
        return `_play-pause-fill`!!
    }

private var `_play-pause-fill`: ImageVector? = null
