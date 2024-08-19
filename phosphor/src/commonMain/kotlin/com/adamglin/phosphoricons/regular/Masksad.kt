package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Masksad: ImageVector
    get() {
        if (_masksad != null) {
            return _masksad!!
        }
        _masksad = Builder(name = "Masksad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.66f, 188.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.09f, 2.23f)
                curveTo(141.07f, 186.34f, 136.0f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -13.32f)
                curveTo(108.0f, 171.73f, 116.06f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(20.0f, 3.73f, 28.43f, 9.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 158.66f, 188.43f)
                close()
                moveTo(224.0f, 48.0f)
                verticalLineToRelative(55.77f)
                curveToRelative(0.0f, 35.84f, -9.65f, 69.65f, -27.18f, 95.18f)
                curveToRelative(-18.16f, 26.46f, -42.6f, 41.0f, -68.82f, 41.0f)
                reflectiveCurveToRelative(-50.66f, -14.57f, -68.82f, -41.0f)
                curveTo(41.65f, 173.44f, 32.0f, 139.63f, 32.0f, 103.79f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 53.79f, 33.09f)
                curveTo(67.84f, 38.55f, 96.18f, 47.71f, 128.0f, 47.71f)
                reflectiveCurveToRelative(60.15f, -9.16f, 74.21f, -14.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(208.0f, 48.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(-15.1f, 5.89f, -45.57f, 15.73f, -80.0f, 15.73f)
                reflectiveCurveTo(63.1f, 53.87f, 48.0f, 48.0f)
                verticalLineToRelative(55.79f)
                curveToRelative(0.0f, 32.64f, 8.66f, 63.23f, 24.37f, 86.13f)
                curveTo(87.46f, 211.9f, 107.21f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(40.54f, -12.1f, 55.63f, -34.08f)
                curveTo(199.34f, 167.0f, 208.0f, 136.43f, 208.0f, 103.79f)
                close()
                moveTo(189.34f, 114.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.62f)
                curveToRelative(-2.68f, 3.0f, -8.85f, 5.34f, -14.0f, 5.34f)
                reflectiveCurveToRelative(-11.36f, -2.35f, -14.0f, -5.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 138.0f, 125.33f)
                curveToRelative(5.71f, 6.38f, 16.14f, 10.67f, 26.0f, 10.67f)
                reflectiveCurveToRelative(20.25f, -4.29f, 26.0f, -10.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 189.34f, 114.0f)
                close()
                moveTo(118.0f, 125.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 106.0f, 114.66f)
                curveToRelative(-2.68f, 3.0f, -8.85f, 5.34f, -14.0f, 5.34f)
                reflectiveCurveToRelative(-11.36f, -2.35f, -14.0f, -5.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 66.0f, 125.33f)
                curveTo(71.75f, 131.71f, 82.18f, 136.0f, 92.0f, 136.0f)
                reflectiveCurveTo(112.25f, 131.71f, 118.0f, 125.33f)
                close()
            }
        }
        .build()
        return _masksad!!
    }

private var _masksad: ImageVector? = null
