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

public val LightGroup.`Horse-light`: ImageVector
    get() {
        if (`_horse-light` != null) {
            return `_horse-light`!!
        }
        `_horse-light` = Builder(name = "Horse-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 134.0f, 100.0f)
                close()
                moveTo(230.0f, 129.45f)
                arcTo(102.29f, 102.29f, 0.0f, false, true, 130.06f, 230.0f)
                lineToRelative(-2.13f, 0.0f)
                arcTo(101.33f, 101.33f, 0.0f, false, true, 60.0f, 204.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -8.94f)
                arcToRelative(87.12f, 87.12f, 0.0f, false, false, 22.09f, 14.39f)
                lineToRelative(29.0f, -39.89f)
                curveToRelative(-23.93f, -11.37f, -50.18f, -6.93f, -64.8f, -4.45f)
                arcToRelative(29.84f, 29.84f, 0.0f, false, true, -29.38f, -12.0f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, true, -0.22f, -0.32f)
                lineToRelative(-13.79f, -22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.95f, -8.29f)
                lineTo(114.0f, 60.65f)
                lineTo(114.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(8.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 230.0f, 129.45f)
                close()
                moveTo(218.0f, 129.28f)
                arcTo(90.0f, 90.0f, 0.0f, false, false, 128.0f, 38.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(126.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.86f, 5.11f)
                lineTo(24.29f, 129.94f)
                lineToRelative(10.47f, 16.74f)
                arcToRelative(17.91f, 17.91f, 0.0f, false, false, 17.54f, 7.06f)
                curveToRelative(15.82f, -2.67f, 48.42f, -8.18f, 77.23f, 8.22f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 170.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, true, -50.87f, 53.9f)
                lineToRelative(-29.36f, 40.37f)
                arcTo(92.83f, 92.83f, 0.0f, false, false, 129.82f, 218.0f)
                arcTo(90.28f, 90.28f, 0.0f, false, false, 218.0f, 129.28f)
                close()
            }
        }
        .build()
        return `_horse-light`!!
    }

private var `_horse-light`: ImageVector? = null
