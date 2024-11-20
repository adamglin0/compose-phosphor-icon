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

public val ThinGroup.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) {
            return _numberSquareZero!!
        }
        _numberSquareZero = Builder(name = "NumberSquareZero", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                curveToRelative(-12.82f, 0.0f, -23.41f, 5.81f, -30.62f, 16.81f)
                curveTo(91.33f, 102.0f, 88.0f, 114.52f, 88.0f, 128.0f)
                reflectiveCurveToRelative(3.33f, 26.0f, 9.38f, 35.2f)
                curveToRelative(7.21f, 11.0f, 17.8f, 16.8f, 30.62f, 16.8f)
                reflectiveCurveToRelative(23.41f, -5.81f, 30.62f, -16.8f)
                curveToRelative(6.0f, -9.22f, 9.38f, -21.72f, 9.38f, -35.2f)
                reflectiveCurveToRelative(-3.33f, -26.0f, -9.38f, -35.19f)
                curveTo(151.41f, 81.81f, 140.82f, 76.0f, 128.0f, 76.0f)
                close()
                moveTo(128.0f, 172.0f)
                curveToRelative(-22.11f, 0.0f, -32.0f, -22.1f, -32.0f, -44.0f)
                reflectiveCurveToRelative(9.89f, -44.0f, 32.0f, -44.0f)
                reflectiveCurveToRelative(32.0f, 22.1f, 32.0f, 44.0f)
                reflectiveCurveTo(150.11f, 172.0f, 128.0f, 172.0f)
                close()
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
