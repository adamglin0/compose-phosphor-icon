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

public val BoldGroup.`Fire-simple-bold`: ImageVector
    get() {
        if (`_fire-simple-bold` != null) {
            return `_fire-simple-bold`!!
        }
        `_fire-simple-bold` = Builder(name = "Fire-simple-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(145.93f, 14.77f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 127.0f, 19.89f)
                lineTo(107.07f, 74.5f)
                lineTo(87.38f, 55.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.9f, 1.33f)
                curveTo(47.27f, 85.82f, 36.0f, 115.19f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 82.85f, 168.2f, 33.25f, 145.93f, 14.77f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                curveToRelative(0.0f, -19.94f, 7.0f, -40.62f, 20.71f, -61.64f)
                lineToRelative(22.93f, 22.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.63f, -4.5f)
                lineToRelative(20.21f, -55.4f)
                curveTo(165.39f, 65.61f, 196.0f, 102.29f, 196.0f, 144.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_fire-simple-bold`!!
    }

private var `_fire-simple-bold`: ImageVector? = null
