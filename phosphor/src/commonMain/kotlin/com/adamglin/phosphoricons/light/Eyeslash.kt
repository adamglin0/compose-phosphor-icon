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

public val LightGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(64.44f, 67.0f)
                curveToRelative(-37.28f, 21.9f, -53.23f, 57.0f, -53.92f, 58.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 4.88f)
                curveToRelative(0.34f, 0.77f, 8.66f, 19.22f, 27.24f, 37.8f)
                curveTo(55.0f, 185.47f, 84.62f, 206.0f, 128.0f, 206.0f)
                arcToRelative(124.91f, 124.91f, 0.0f, false, false, 52.57f, -11.25f)
                lineToRelative(23.0f, 25.29f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(101.06f, 107.32f)
                lineTo(146.06f, 156.84f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -45.0f, -49.52f)
                close()
                moveTo(128.0f, 194.0f)
                curveToRelative(-31.38f, 0.0f, -58.78f, -11.42f, -81.45f, -33.93f)
                arcTo(134.57f, 134.57f, 0.0f, false, true, 22.69f, 128.0f)
                curveToRelative(4.29f, -8.2f, 20.1f, -35.18f, 50.0f, -51.91f)
                lineTo(92.89f, 98.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 61.35f, 67.48f)
                lineToRelative(17.81f, 19.6f)
                arcTo(113.47f, 113.47f, 0.0f, false, true, 128.0f, 194.0f)
                close()
                moveTo(134.4f, 94.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.25f, -11.79f)
                arcToRelative(46.17f, 46.17f, 0.0f, false, true, 37.15f, 40.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.42f, 6.53f)
                lineToRelative(-0.56f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -5.45f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 134.4f, 94.6f)
                close()
                moveTo(245.48f, 130.45f)
                curveToRelative(-0.41f, 0.92f, -10.37f, 23.0f, -32.86f, 43.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.0f, -8.94f)
                arcTo(134.07f, 134.07f, 0.0f, false, false, 233.31f, 128.0f)
                arcToRelative(134.67f, 134.67f, 0.0f, false, false, -23.86f, -32.07f)
                curveTo(186.78f, 73.42f, 159.38f, 62.0f, 128.0f, 62.0f)
                arcToRelative(120.19f, 120.19f, 0.0f, false, false, -19.69f, 1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.0f, -11.83f)
                arcTo(131.12f, 131.12f, 0.0f, false, true, 128.0f, 50.0f)
                curveToRelative(43.38f, 0.0f, 73.0f, 20.54f, 90.24f, 37.76f)
                curveToRelative(18.58f, 18.58f, 26.9f, 37.0f, 27.24f, 37.81f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 245.48f, 130.45f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
