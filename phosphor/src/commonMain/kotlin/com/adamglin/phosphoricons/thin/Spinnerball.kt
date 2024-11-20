package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) {
            return _spinnerBall!!
        }
        _spinnerBall = Builder(name = "SpinnerBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(219.92f, 124.44f)
                curveToRelative(-33.69f, 24.71f, -58.55f, 15.45f, -83.94f, 3.0f)
                curveToRelative(23.54f, -15.86f, 45.85f, -33.95f, 43.34f, -75.81f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 219.92f, 124.44f)
                close()
                moveTo(170.86f, 46.61f)
                curveTo(175.4f, 88.13f, 155.0f, 105.0f, 131.55f, 120.83f)
                curveToRelative(-2.0f, -28.32f, -6.47f, -56.69f, -44.0f, -75.45f)
                arcToRelative(91.87f, 91.87f, 0.0f, false, true, 83.3f, 1.23f)
                close()
                moveTo(79.0f, 50.18f)
                curveToRelative(38.22f, 16.83f, 42.63f, 43.0f, 44.58f, 71.16f)
                curveToRelative(-25.5f, -12.46f, -52.33f, -22.75f, -87.34f, 0.38f)
                arcTo(92.07f, 92.07f, 0.0f, false, true, 79.0f, 50.18f)
                close()
                moveTo(36.1f, 131.56f)
                curveToRelative(33.69f, -24.71f, 58.55f, -15.45f, 83.94f, -3.05f)
                curveToRelative(-23.54f, 15.86f, -45.85f, 34.0f, -43.34f, 75.81f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 36.08f, 131.56f)
                close()
                moveTo(85.16f, 209.39f)
                curveTo(80.6f, 167.87f, 101.0f, 151.0f, 124.45f, 135.17f)
                curveToRelative(2.0f, 28.32f, 6.47f, 56.69f, 44.0f, 75.45f)
                arcToRelative(91.87f, 91.87f, 0.0f, false, true, -83.3f, -1.23f)
                close()
                moveTo(177.0f, 205.82f)
                curveToRelative(-38.22f, -16.83f, -42.63f, -43.0f, -44.58f, -71.16f)
                curveToRelative(14.43f, 7.05f, 29.29f, 13.41f, 45.81f, 13.41f)
                curveToRelative(12.67f, 0.0f, 26.33f, -3.74f, 41.53f, -13.78f)
                arcTo(92.06f, 92.06f, 0.0f, false, true, 177.0f, 205.82f)
                close()
            }
        }
        .build()
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null
