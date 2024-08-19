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

public val BoldGroup.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.83f, 56.53f)
                curveTo(186.32f, 43.29f, 158.0f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveTo(69.68f, 43.29f, 48.17f, 56.53f)
                curveTo(24.85f, 70.89f, 12.0f, 90.6f, 12.0f, 112.0f)
                reflectiveCurveToRelative(12.85f, 41.14f, 36.17f, 55.5f)
                curveToRelative(18.48f, 11.37f, 42.0f, 18.34f, 67.29f, 20.08f)
                curveToRelative(-2.0f, 11.07f, -9.09f, 17.75f, -15.22f, 21.54f)
                curveToRelative(-13.48f, 8.31f, -32.75f, 9.18f, -46.86f, 2.1f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 42.62f, 232.7f)
                arcToRelative(71.76f, 71.76f, 0.0f, false, false, 32.0f, 7.3f)
                arcToRelative(73.2f, 73.2f, 0.0f, false, false, 38.18f, -10.43f)
                curveToRelative(15.45f, -9.54f, 25.0f, -24.58f, 26.83f, -41.9f)
                curveToRelative(25.6f, -1.64f, 49.47f, -8.65f, 68.16f, -20.15f)
                curveTo(231.15f, 153.16f, 244.0f, 133.45f, 244.0f, 112.0f)
                reflectiveCurveTo(231.15f, 70.89f, 207.83f, 56.53f)
                close()
                moveTo(73.39f, 153.53f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 20.16f, -9.35f)
                curveToRelative(10.36f, 1.39f, 16.54f, 9.43f, 19.72f, 19.13f)
                arcTo(135.3f, 135.3f, 0.0f, false, true, 73.39f, 153.56f)
                close()
                moveTo(138.26f, 163.67f)
                arcToRelative(61.84f, 61.84f, 0.0f, false, false, -10.76f, -24.82f)
                arcToRelative(46.08f, 46.08f, 0.0f, false, false, -30.75f, -18.46f)
                curveToRelative(-18.0f, -2.41f, -34.52f, 5.89f, -44.1f, 21.0f)
                curveTo(42.2f, 133.0f, 36.0f, 122.84f, 36.0f, 112.0f)
                curveToRelative(0.0f, -28.19f, 42.13f, -52.0f, 92.0f, -52.0f)
                reflectiveCurveToRelative(92.0f, 23.82f, 92.0f, 52.0f)
                curveTo(220.0f, 138.26f, 183.51f, 160.71f, 138.26f, 163.7f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
