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

public val LightGroup.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) {
            return _maskHappy!!
        }
        _maskHappy = Builder(name = "MaskHappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.47f, 124.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.94f, 8.0f)
                curveToRelative(-3.06f, -3.42f, -9.74f, -6.0f, -15.53f, -6.0f)
                reflectiveCurveToRelative(-12.47f, 2.58f, -15.53f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.94f, -8.0f)
                curveToRelative(5.35f, -6.0f, 15.19f, -10.0f, 24.47f, -10.0f)
                reflectiveCurveTo(183.12f, 118.0f, 188.47f, 124.0f)
                close()
                moveTo(107.53f, 132.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.94f, -8.0f)
                curveToRelative(-5.35f, -6.0f, -15.19f, -10.0f, -24.47f, -10.0f)
                reflectiveCurveToRelative(-19.12f, 4.0f, -24.47f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.94f, 8.0f)
                curveToRelative(3.06f, -3.42f, 9.74f, -6.0f, 15.53f, -6.0f)
                reflectiveCurveTo(104.47f, 128.58f, 107.53f, 132.0f)
                close()
                moveTo(166.26f, 163.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.67f)
                arcToRelative(38.89f, 38.89f, 0.0f, false, true, -59.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.13f, 7.79f)
                arcToRelative(50.9f, 50.9f, 0.0f, false, false, 77.86f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 166.26f, 163.43f)
                close()
                moveTo(222.0f, 48.0f)
                verticalLineToRelative(55.77f)
                curveToRelative(0.0f, 35.45f, -9.53f, 68.86f, -26.83f, 94.06f)
                curveTo(177.4f, 223.74f, 153.54f, 238.0f, 128.0f, 238.0f)
                reflectiveCurveToRelative(-49.4f, -14.26f, -67.17f, -40.16f)
                curveTo(43.53f, 172.64f, 34.0f, 139.23f, 34.0f, 103.78f)
                lineTo(34.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 53.06f, 35.0f)
                curveTo(67.25f, 40.46f, 95.86f, 49.7f, 128.0f, 49.7f)
                reflectiveCurveTo(188.75f, 40.46f, 202.94f, 35.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f)
                close()
                moveTo(210.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.87f, -1.66f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -1.85f, -0.21f)
                curveTo(192.31f, 52.0f, 162.1f, 61.7f, 128.0f, 61.7f)
                reflectiveCurveTo(63.69f, 52.0f, 48.72f, 46.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, 0.21f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 46.0f, 48.0f)
                verticalLineToRelative(55.76f)
                curveTo(46.0f, 171.17f, 82.79f, 226.0f, 128.0f, 226.0f)
                reflectiveCurveToRelative(82.0f, -54.83f, 82.0f, -122.22f)
                close()
            }
        }
        .build()
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
