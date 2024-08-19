package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Paintbucket: ImageVector
    get() {
        if (_paintbucket != null) {
            return _paintbucket!!
        }
        _paintbucket = Builder(name = "Paintbucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.0f, 164.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.0f, 0.0f)
                curveToRelative(-0.7f, 1.0f, -17.0f, 25.72f, -17.0f, 43.33f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                curveTo(254.0f, 190.39f, 237.69f, 165.71f, 237.0f, 164.67f)
                close()
                moveTo(232.0f, 218.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                curveToRelative(0.0f, -8.17f, 5.37f, -19.92f, 10.0f, -28.34f)
                curveToRelative(4.63f, 8.41f, 10.0f, 20.15f, 10.0f, 28.34f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 232.0f, 218.0f)
                close()
                moveTo(233.9f, 137.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.34f, -9.94f)
                lineTo(120.76f, 11.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 0.0f)
                lineToRelative(-42.0f, 42.0f)
                lineToRelative(-26.0f, -26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 8.48f)
                lineToRelative(26.0f, 26.0f)
                lineTo(16.44f, 107.59f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.11f)
                lineToRelative(84.86f, 84.86f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.11f, 0.0f)
                lineToRelative(78.83f, -78.83f)
                close()
                moveTo(203.76f, 135.24f)
                lineTo(123.93f, 215.07f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -14.14f, 0.0f)
                lineTo(24.93f, 130.21f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f)
                lineTo(70.25f, 70.75f)
                lineToRelative(31.62f, 31.61f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 3.75f, 32.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 36.76f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -32.0f, -40.51f)
                lineTo(78.74f, 62.26f)
                lineToRelative(37.78f, -37.77f)
                lineTo(220.89f, 128.86f)
                lineToRelative(-14.79f, 4.93f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 203.76f, 135.24f)
                close()
                moveTo(114.1f, 106.11f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 0.0f, 19.82f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, true, 0.0f, -19.82f)
                close()
            }
        }
        .build()
        return _paintbucket!!
    }

private var _paintbucket: ImageVector? = null
