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

public val BoldGroup.`Play-bold`: ImageVector
    get() {
        if (`_play-bold` != null) {
            return `_play-bold`!!
        }
        `_play-bold` = Builder(name = "Play-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.49f, 111.07f)
                lineTo(90.41f, 22.94f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 39.87f)
                verticalLineTo(216.13f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 30.41f, 16.93f)
                lineToRelative(144.08f, -88.13f)
                arcToRelative(19.82f, 19.82f, 0.0f, false, false, 0.0f, -33.86f)
                close()
                moveTo(84.0f, 208.85f)
                verticalLineTo(47.15f)
                lineTo(216.16f, 128.0f)
                close()
            }
        }
        .build()
        return `_play-bold`!!
    }

private var `_play-bold`: ImageVector? = null
