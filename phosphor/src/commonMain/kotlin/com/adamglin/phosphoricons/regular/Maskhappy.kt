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

public val RegularGroup.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) {
            return _maskHappy!!
        }
        _maskHappy = Builder(name = "MaskHappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.0f, 34.8f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -14.82f, -1.71f)
                curveTo(188.15f, 38.55f, 159.82f, 47.71f, 128.0f, 47.71f)
                reflectiveCurveTo(67.84f, 38.55f, 53.79f, 33.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineToRelative(55.77f)
                curveToRelative(0.0f, 35.84f, 9.65f, 69.65f, 27.18f, 95.18f)
                curveToRelative(18.16f, 26.46f, 42.6f, 41.0f, 68.82f, 41.0f)
                reflectiveCurveToRelative(50.66f, -14.57f, 68.82f, -41.0f)
                curveTo(214.35f, 173.44f, 224.0f, 139.63f, 224.0f, 103.79f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 217.0f, 34.8f)
                close()
                moveTo(208.0f, 103.8f)
                curveToRelative(0.0f, 32.64f, -8.66f, 63.23f, -24.37f, 86.13f)
                curveTo(168.54f, 211.9f, 148.79f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(-40.54f, -12.1f, -55.63f, -34.08f)
                curveTo(56.66f, 167.0f, 48.0f, 136.43f, 48.0f, 103.79f)
                lineTo(48.0f, 48.0f)
                curveToRelative(15.11f, 5.87f, 45.58f, 15.71f, 80.0f, 15.71f)
                reflectiveCurveTo(192.9f, 53.87f, 208.0f, 48.0f)
                verticalLineToRelative(55.81f)
                close()
                moveTo(190.0f, 122.67f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 178.0f, 133.33f)
                curveToRelative(-2.68f, -3.0f, -8.85f, -5.33f, -14.0f, -5.33f)
                reflectiveCurveToRelative(-11.36f, 2.34f, -14.0f, 5.33f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 138.0f, 122.66f)
                curveToRelative(5.71f, -6.38f, 16.14f, -10.66f, 26.0f, -10.66f)
                reflectiveCurveTo(184.25f, 116.28f, 190.0f, 122.66f)
                close()
                moveTo(92.0f, 128.0f)
                curveToRelative(-5.19f, 0.0f, -11.36f, 2.34f, -14.0f, 5.33f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 66.0f, 122.66f)
                curveTo(71.75f, 116.28f, 82.18f, 112.0f, 92.0f, 112.0f)
                reflectiveCurveToRelative(20.25f, 4.28f, 26.0f, 10.66f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 106.0f, 133.33f)
                curveTo(103.36f, 130.34f, 97.19f, 128.0f, 92.0f, 128.0f)
                close()
                moveTo(168.45f, 173.19f)
                arcToRelative(52.9f, 52.9f, 0.0f, false, true, -80.9f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 99.72f, 162.8f)
                arcToRelative(36.89f, 36.89f, 0.0f, false, false, 56.56f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.17f, 10.39f)
                close()
            }
        }
        .build()
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
