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

public val LightGroup.`Play-circle-light`: ImageVector
    get() {
        if (`_play-circle-light` != null) {
            return `_play-circle-light`!!
        }
        `_play-circle-light` = Builder(name = "Play-circle-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(175.18f, 122.91f)
                lineTo(111.18f, 82.91f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.18f, 5.09f)
                lineToRelative(64.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.18f)
                close()
                moveTo(114.0f, 157.17f)
                lineTo(114.0f, 98.83f)
                lineTo(160.68f, 128.0f)
                close()
            }
        }
        .build()
        return `_play-circle-light`!!
    }

private var `_play-circle-light`: ImageVector? = null
