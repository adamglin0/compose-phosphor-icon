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

public val LightGroup.`Aperture-light`: ImageVector
    get() {
        if (`_aperture-light` != null) {
            return `_aperture-light`!!
        }
        `_aperture-light` = Builder(name = "Aperture-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.12f, 55.88f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 55.87f, 200.12f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.88f)
                close()
                moveTo(98.12f, 122.55f)
                lineTo(117.77f, 99.41f)
                lineTo(147.63f, 104.87f)
                lineTo(157.84f, 133.45f)
                lineTo(138.19f, 156.59f)
                lineTo(108.33f, 151.13f)
                close()
                moveTo(209.93f, 90.69f)
                arcToRelative(90.24f, 90.24f, 0.0f, false, true, -2.0f, 78.63f)
                lineToRelative(-56.14f, -10.24f)
                close()
                moveTo(203.77f, 79.41f)
                lineTo(166.83f, 122.89f)
                lineTo(136.66f, 38.42f)
                arcToRelative(89.31f, 89.31f, 0.0f, false, true, 55.0f, 25.94f)
                arcTo(91.33f, 91.33f, 0.0f, false, true, 203.77f, 79.41f)
                close()
                moveTo(64.36f, 64.41f)
                arcTo(89.37f, 89.37f, 0.0f, false, true, 123.81f, 38.1f)
                lineTo(143.0f, 91.82f)
                lineTo(54.75f, 75.71f)
                arcTo(91.2f, 91.2f, 0.0f, false, true, 64.36f, 64.36f)
                close()
                moveTo(48.0f, 86.68f)
                lineToRelative(56.14f, 10.24f)
                lineTo(46.07f, 165.31f)
                arcToRelative(90.24f, 90.24f, 0.0f, false, true, 2.0f, -78.63f)
                close()
                moveTo(52.21f, 176.59f)
                lineTo(89.15f, 133.11f)
                lineTo(119.32f, 217.58f)
                arcToRelative(89.31f, 89.31f, 0.0f, false, true, -55.0f, -25.94f)
                arcTo(91.33f, 91.33f, 0.0f, false, true, 52.23f, 176.59f)
                close()
                moveTo(191.62f, 191.59f)
                arcToRelative(89.32f, 89.32f, 0.0f, false, true, -59.45f, 26.26f)
                lineTo(113.0f, 164.18f)
                lineToRelative(88.24f, 16.11f)
                arcTo(91.2f, 91.2f, 0.0f, false, true, 191.64f, 191.64f)
                close()
            }
        }
        .build()
        return `_aperture-light`!!
    }

private var `_aperture-light`: ImageVector? = null
