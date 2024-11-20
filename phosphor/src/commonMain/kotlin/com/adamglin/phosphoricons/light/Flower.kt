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

public val LightGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.35f, 131.09f)
                arcToRelative(42.24f, 42.24f, 0.0f, false, false, -6.82f, -3.09f)
                arcToRelative(42.24f, 42.24f, 0.0f, false, false, 6.82f, -3.09f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, -65.82f)
                arcToRelative(43.33f, 43.33f, 0.0f, false, false, -6.08f, 4.36f)
                arcTo(42.94f, 42.94f, 0.0f, false, false, 166.0f, 56.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                arcToRelative(42.94f, 42.94f, 0.0f, false, false, 0.73f, 7.45f)
                arcToRelative(43.33f, 43.33f, 0.0f, false, false, -6.08f, -4.36f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 65.82f)
                arcTo(42.24f, 42.24f, 0.0f, false, false, 53.47f, 128.0f)
                arcToRelative(42.24f, 42.24f, 0.0f, false, false, -6.82f, 3.09f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 9.16f, 69.62f)
                arcToRelative(38.53f, 38.53f, 0.0f, false, false, 9.9f, 1.31f)
                arcToRelative(37.82f, 37.82f, 0.0f, false, false, 18.94f, -5.11f)
                arcToRelative(43.33f, 43.33f, 0.0f, false, false, 6.08f, -4.36f)
                arcTo(42.94f, 42.94f, 0.0f, false, false, 90.0f, 200.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 76.0f, 0.0f)
                arcToRelative(42.94f, 42.94f, 0.0f, false, false, -0.73f, -7.45f)
                arcToRelative(43.33f, 43.33f, 0.0f, false, false, 6.08f, 4.36f)
                arcTo(37.82f, 37.82f, 0.0f, false, false, 190.29f, 202.0f)
                arcToRelative(38.53f, 38.53f, 0.0f, false, false, 9.9f, -1.31f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 9.16f, -69.62f)
                close()
                moveTo(177.35f, 69.48f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 45.0f)
                curveToRelative(-4.77f, 2.75f, -14.92f, 6.15f, -36.4f, 7.47f)
                lineToRelative(-1.44f, -0.08f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 152.0f, 98.58f)
                lineToRelative(0.66f, -1.31f)
                curveTo(164.56f, 79.33f, 172.58f, 72.24f, 177.35f, 69.48f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 154.0f)
                close()
                moveTo(128.0f, 30.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                curveToRelative(0.0f, 5.51f, -2.13f, 16.0f, -11.73f, 35.27f)
                curveToRelative(-0.26f, 0.4f, -0.53f, 0.8f, -0.79f, 1.21f)
                arcToRelative(37.88f, 37.88f, 0.0f, false, false, -27.0f, 0.0f)
                lineToRelative(-0.79f, -1.22f)
                curveTo(104.13f, 72.0f, 102.0f, 61.51f, 102.0f, 56.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 30.0f)
                close()
                moveTo(52.65f, 114.52f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -45.0f)
                curveToRelative(4.77f, 2.76f, 12.79f, 9.85f, 24.67f, 27.79f)
                lineToRelative(0.66f, 1.31f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -13.49f, 23.33f)
                lineToRelative(-1.44f, 0.08f)
                curveTo(67.57f, 120.67f, 57.42f, 117.27f, 52.65f, 114.52f)
                close()
                moveTo(78.65f, 186.52f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -45.0f)
                curveToRelative(4.77f, -2.75f, 14.92f, -6.15f, 36.4f, -7.47f)
                lineToRelative(1.44f, 0.08f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 104.0f, 157.42f)
                lineToRelative(-0.66f, 1.31f)
                curveTo(91.44f, 176.67f, 83.42f, 183.76f, 78.65f, 186.52f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                curveToRelative(0.0f, -5.51f, 2.13f, -16.0f, 11.73f, -35.27f)
                curveToRelative(0.26f, -0.4f, 0.53f, -0.8f, 0.79f, -1.21f)
                arcToRelative(37.88f, 37.88f, 0.0f, false, false, 27.0f, 0.0f)
                lineToRelative(0.79f, 1.22f)
                curveTo(151.87f, 184.0f, 154.0f, 194.49f, 154.0f, 200.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 226.0f)
                close()
                moveTo(212.87f, 177.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -35.52f, 9.52f)
                curveToRelative(-4.77f, -2.76f, -12.79f, -9.85f, -24.67f, -27.79f)
                lineToRelative(-0.66f, -1.31f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 13.49f, -23.33f)
                lineTo(167.0f, 134.0f)
                curveToRelative(21.48f, 1.32f, 31.63f, 4.72f, 36.4f, 7.47f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 212.87f, 177.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
