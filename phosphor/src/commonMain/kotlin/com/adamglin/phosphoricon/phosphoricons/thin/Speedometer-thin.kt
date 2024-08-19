package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Speedometer-thin`: ImageVector
    get() {
        if (`_speedometer-thin` != null) {
            return `_speedometer-thin`!!
        }
        `_speedometer-thin` = Builder(name = "Speedometer-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.17f, 157.17f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(67.94f, 67.94f, 0.0f, false, true, 21.72f, 3.54f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 152.27f, 80.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 52.0f, 152.0f)
                arcToRelative(79.27f, 79.27f, 0.0f, false, false, 0.46f, 8.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.56f)
                lineToRelative(0.45f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.54f, -4.42f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 128.0f, 84.0f)
                close()
                moveTo(224.17f, 102.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.11f, 3.64f)
                arcToRelative(100.34f, 100.34f, 0.0f, false, true, 5.26f, 78.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, 2.7f)
                lineTo(37.46f, 188.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -3.8f, -2.74f)
                arcTo(100.05f, 100.05f, 0.0f, false, true, 173.54f, 62.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 3.64f, -7.12f)
                arcTo(107.0f, 107.0f, 0.0f, false, false, 129.0f, 44.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(108.06f, 108.06f, 0.0f, false, false, 26.12f, 187.92f)
                arcTo(12.07f, 12.07f, 0.0f, false, false, 37.46f, 196.0f)
                lineTo(218.53f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.34f, -8.0f)
                arcToRelative(108.31f, 108.31f, 0.0f, false, false, -5.7f, -85.14f)
                close()
            }
        }
        .build()
        return `_speedometer-thin`!!
    }

private var `_speedometer-thin`: ImageVector? = null
