package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) {
            return _spinnerBall!!
        }
        _spinnerBall = Builder(name = "SpinnerBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(211.65f, 120.47f)
                curveTo(188.51f, 136.0f, 170.71f, 133.74f, 151.92f, 126.0f)
                curveToRelative(7.87f, -6.0f, 15.29f, -12.73f, 21.35f, -21.16f)
                arcTo(74.85f, 74.85f, 0.0f, false, false, 187.0f, 68.25f)
                arcTo(83.73f, 83.73f, 0.0f, false, true, 211.65f, 120.47f)
                close()
                moveTo(163.3f, 51.8f)
                curveToRelative(1.9f, 27.81f, -9.0f, 42.09f, -25.09f, 54.48f)
                curveToRelative(-1.24f, -9.82f, -3.38f, -19.61f, -7.64f, -29.08f)
                arcTo(75.0f, 75.0f, 0.0f, false, false, 105.69f, 47.0f)
                arcTo(83.73f, 83.73f, 0.0f, false, true, 163.3f, 51.8f)
                close()
                moveTo(79.69f, 59.35f)
                curveToRelative(25.0f, 12.25f, 31.93f, 28.8f, 34.6f, 48.94f)
                curveToRelative(-9.12f, -3.82f, -18.66f, -6.87f, -29.0f, -7.91f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, false, -38.59f, 6.46f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 79.69f, 59.35f)
                close()
                moveTo(44.35f, 135.53f)
                curveTo(67.49f, 120.0f, 85.29f, 122.26f, 104.08f, 130.0f)
                curveToRelative(-7.87f, 6.0f, -15.29f, 12.73f, -21.35f, 21.16f)
                arcTo(74.85f, 74.85f, 0.0f, false, false, 69.0f, 187.75f)
                arcTo(83.73f, 83.73f, 0.0f, false, true, 44.35f, 135.53f)
                close()
                moveTo(92.7f, 204.2f)
                curveToRelative(-1.9f, -27.81f, 9.0f, -42.09f, 25.09f, -54.48f)
                curveToRelative(1.24f, 9.82f, 3.38f, 19.61f, 7.64f, 29.08f)
                arcTo(75.0f, 75.0f, 0.0f, false, false, 150.31f, 209.0f)
                arcTo(83.73f, 83.73f, 0.0f, false, true, 92.7f, 204.2f)
                close()
                moveTo(176.31f, 196.65f)
                curveToRelative(-25.0f, -12.25f, -31.93f, -28.8f, -34.6f, -48.94f)
                curveToRelative(9.12f, 3.82f, 18.66f, 6.87f, 29.0f, 7.91f)
                quadToRelative(3.75f, 0.38f, 7.47f, 0.38f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 31.12f, -6.85f)
                arcTo(84.19f, 84.19f, 0.0f, false, true, 176.31f, 196.65f)
                close()
            }
        }
        .build()
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
