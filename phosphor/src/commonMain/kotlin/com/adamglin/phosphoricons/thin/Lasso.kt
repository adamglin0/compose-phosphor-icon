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

public val ThinGroup.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.64f, 63.34f)
                curveTo(183.37f, 50.87f, 156.51f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveTo(72.63f, 50.87f, 52.36f, 63.34f)
                curveTo(31.49f, 76.19f, 20.0f, 93.48f, 20.0f, 112.0f)
                reflectiveCurveToRelative(11.49f, 35.83f, 32.36f, 48.68f)
                curveToRelative(19.29f, 11.87f, 44.55f, 18.65f, 71.51f, 19.28f)
                curveToRelative(0.08f, 1.27f, 0.13f, 2.56f, 0.13f, 3.9f)
                curveToRelative(0.0f, 15.49f, -7.28f, 28.44f, -20.51f, 36.46f)
                curveToRelative(-15.79f, 9.57f, -37.34f, 10.28f, -53.64f, 1.77f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.7f, 7.09f)
                arcTo(62.32f, 62.32f, 0.0f, false, false, 74.91f, 236.0f)
                arcToRelative(63.56f, 63.56f, 0.0f, false, false, 32.73f, -8.82f)
                curveToRelative(15.71f, -9.52f, 24.36f, -24.9f, 24.36f, -43.3f)
                curveToRelative(0.0f, -1.32f, -0.05f, -2.61f, -0.12f, -3.9f)
                curveToRelative(27.06f, -0.59f, 52.41f, -7.38f, 71.76f, -19.28f)
                curveTo(224.51f, 147.85f, 236.0f, 130.56f, 236.0f, 112.0f)
                reflectiveCurveTo(224.51f, 76.19f, 203.64f, 63.34f)
                close()
                moveTo(62.16f, 157.15f)
                curveToRelative(5.3f, -14.49f, 18.83f, -18.22f, 29.3f, -16.85f)
                curveToRelative(13.64f, 1.78f, 27.38f, 12.19f, 31.38f, 31.66f)
                curveTo(99.66f, 171.25f, 78.55f, 165.78f, 62.16f, 157.15f)
                close()
                moveTo(131.0f, 172.0f)
                arcToRelative(51.35f, 51.35f, 0.0f, false, false, -11.18f, -24.59f)
                arcToRelative(43.28f, 43.28f, 0.0f, false, false, -27.3f, -15.06f)
                curveToRelative(-16.82f, -2.19f, -31.24f, 6.0f, -37.33f, 20.74f)
                curveTo(38.33f, 142.35f, 28.0f, 127.9f, 28.0f, 112.0f)
                curveToRelative(0.0f, -33.09f, 44.86f, -60.0f, 100.0f, -60.0f)
                reflectiveCurveToRelative(100.0f, 26.93f, 100.0f, 60.0f)
                curveTo(228.0f, 144.52f, 184.74f, 171.06f, 131.0f, 172.0f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
