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

public val BoldGroup.`Windmill-bold`: ImageVector
    get() {
        if (`_windmill-bold` != null) {
            return `_windmill-bold`!!
        }
        `_windmill-bold` = Builder(name = "Windmill-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 220.0f)
                lineTo(186.41f, 220.0f)
                lineToRelative(-4.72f, -33.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 23.55f, -8.83f)
                lineToRelative(12.0f, -20.33f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.09f, -27.4f)
                lineToRelative(-31.57f, -18.58f)
                lineToRelative(38.66f, -65.68f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.08f, -27.39f)
                lineToRelative(-20.34f, -12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -27.39f, 7.09f)
                lineTo(143.84f, 45.43f)
                lineTo(78.15f, 6.77f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -27.39f, 7.09f)
                lineToRelative(-12.0f, 20.33f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 7.09f, 27.4f)
                lineTo(77.43f, 80.17f)
                lineTo(38.77f, 145.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 7.08f, 27.39f)
                lineToRelative(20.34f, 12.0f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, 8.0f, 2.65f)
                lineTo(69.59f, 220.0f)
                lineTo(32.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(224.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(186.59f, 162.53f)
                lineTo(124.33f, 125.89f)
                lineTo(132.26f, 112.43f)
                lineTo(194.52f, 149.08f)
                close()
                moveTo(181.07f, 29.53f)
                lineTo(194.53f, 37.46f)
                lineTo(157.89f, 99.67f)
                lineToRelative(-13.46f, -7.92f)
                close()
                moveTo(69.41f, 29.53f)
                lineTo(131.67f, 66.17f)
                lineTo(123.74f, 79.63f)
                lineTo(61.48f, 42.93f)
                close()
                moveTo(61.47f, 154.59f)
                lineTo(98.11f, 92.34f)
                lineToRelative(13.46f, 7.92f)
                lineTo(74.93f, 162.52f)
                close()
                moveTo(101.81f, 164.15f)
                lineTo(112.16f, 146.58f)
                lineTo(155.3f, 172.0f)
                lineToRelative(6.86f, 48.0f)
                lineTo(93.84f, 220.0f)
                close()
            }
        }
        .build()
        return `_windmill-bold`!!
    }

private var `_windmill-bold`: ImageVector? = null
