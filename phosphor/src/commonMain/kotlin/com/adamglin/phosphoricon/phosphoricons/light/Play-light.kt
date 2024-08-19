package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Play-light`: ImageVector
    get() {
        if (`_play-light` != null) {
            return `_play-light`!!
        }
        `_play-light` = Builder(name = "Play-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.36f, 116.19f)
                lineTo(87.28f, 28.06f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.18f, -0.27f)
                arcTo(13.69f, 13.69f, 0.0f, false, false, 66.0f, 39.87f)
                lineTo(66.0f, 216.13f)
                arcToRelative(13.69f, 13.69f, 0.0f, false, false, 7.1f, 12.08f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.18f, -0.27f)
                lineToRelative(144.08f, -88.13f)
                arcToRelative(13.82f, 13.82f, 0.0f, false, false, 0.0f, -23.62f)
                close()
                moveTo(225.1f, 129.57f)
                lineTo(81.0f, 217.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.06f, 0.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -1.0f, -1.61f)
                lineTo(77.94f, 39.87f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, 1.0f, -1.61f)
                arcTo(2.06f, 2.06f, 0.0f, false, true, 80.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.0f, 0.31f)
                lineTo(225.1f, 126.43f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.0f, 3.14f)
                close()
            }
        }
        .build()
        return `_play-light`!!
    }

private var `_play-light`: ImageVector? = null
