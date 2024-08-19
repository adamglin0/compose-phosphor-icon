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

public val LightGroup.`Flower-tulip-light`: ImageVector
    get() {
        if (`_flower-tulip-light` != null) {
            return `_flower-tulip-light`!!
        }
        `_flower-tulip-light` = Builder(name = "Flower-tulip-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 50.0f)
                arcToRelative(85.52f, 85.52f, 0.0f, false, false, -36.17f, 8.0f)
                curveToRelative(-14.67f, -25.9f, -40.0f, -38.79f, -41.15f, -39.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                curveTo(124.18f, 19.21f, 98.84f, 32.1f, 84.17f, 58.0f)
                arcTo(85.52f, 85.52f, 0.0f, false, false, 48.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(42.0f, 96.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 80.0f, 85.77f)
                verticalLineToRelative(40.52f)
                lineTo(82.68f, 202.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 10.74f)
                lineToRelative(48.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineToRelative(48.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f)
                lineTo(134.0f, 222.29f)
                lineTo(134.0f, 181.77f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 214.0f, 96.0f)
                lineTo(214.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 50.0f)
                close()
                moveTo(128.0f, 30.88f)
                curveToRelative(6.46f, 3.84f, 23.07f, 15.0f, 33.33f, 32.94f)
                arcTo(86.5f, 86.5f, 0.0f, false, false, 128.0f, 104.5f)
                arcTo(86.5f, 86.5f, 0.0f, false, false, 94.67f, 63.82f)
                curveTo(104.93f, 45.83f, 121.54f, 34.71f, 128.0f, 30.88f)
                close()
                moveTo(54.0f, 96.0f)
                lineTo(54.0f, 62.24f)
                arcTo(74.11f, 74.11f, 0.0f, false, true, 122.0f, 136.0f)
                verticalLineToRelative(33.76f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 54.0f, 96.0f)
                close()
                moveTo(202.0f, 96.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -68.0f, 73.76f)
                lineTo(134.0f, 136.0f)
                arcToRelative(74.11f, 74.11f, 0.0f, false, true, 68.0f, -73.76f)
                close()
            }
        }
        .build()
        return `_flower-tulip-light`!!
    }

private var `_flower-tulip-light`: ImageVector? = null
