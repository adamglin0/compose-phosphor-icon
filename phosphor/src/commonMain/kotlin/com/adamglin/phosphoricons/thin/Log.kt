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

public val ThinGroup.Log: ImageVector
    get() {
        if (_log != null) {
            return _log!!
        }
        _log = Builder(name = "Log", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 136.0f)
                close()
                moveTo(244.0f, 136.0f)
                curveToRelative(0.0f, 17.83f, -4.38f, 34.66f, -12.32f, 47.38f)
                curveTo(223.36f, 196.67f, 212.11f, 204.0f, 200.0f, 204.0f)
                lineTo(56.0f, 204.0f)
                curveToRelative(-12.11f, 0.0f, -23.36f, -7.33f, -31.68f, -20.62f)
                curveTo(16.38f, 170.66f, 12.0f, 153.83f, 12.0f, 136.0f)
                reflectiveCurveToRelative(4.38f, -34.66f, 12.32f, -47.38f)
                curveTo(32.64f, 75.33f, 43.89f, 68.0f, 56.0f, 68.0f)
                lineTo(94.34f, 68.0f)
                lineToRelative(38.83f, -38.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 28.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(137.66f, 36.0f)
                lineToRelative(-32.0f, 32.0f)
                lineTo(200.0f, 68.0f)
                curveToRelative(12.11f, 0.0f, 23.36f, 7.33f, 31.68f, 20.62f)
                curveTo(239.62f, 101.34f, 244.0f, 118.17f, 244.0f, 136.0f)
                close()
                moveTo(179.13f, 196.0f)
                arcToRelative(52.15f, 52.15f, 0.0f, false, true, -10.81f, -12.62f)
                arcTo(77.0f, 77.0f, 0.0f, false, true, 159.85f, 164.0f)
                lineTo(80.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(77.91f)
                arcTo(104.53f, 104.53f, 0.0f, false, true, 156.0f, 136.0f)
                curveToRelative(0.0f, -17.83f, 4.38f, -34.66f, 12.32f, -47.38f)
                arcTo(52.15f, 52.15f, 0.0f, false, true, 179.13f, 76.0f)
                lineTo(56.0f, 76.0f)
                curveToRelative(-15.64f, 0.0f, -29.0f, 16.72f, -33.94f, 40.0f)
                lineTo(104.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(20.72f, 124.0f)
                arcTo(99.83f, 99.83f, 0.0f, false, false, 20.0f, 136.0f)
                curveToRelative(0.0f, 33.08f, 16.15f, 60.0f, 36.0f, 60.0f)
                close()
                moveTo(236.0f, 136.0f)
                curveToRelative(0.0f, -33.08f, -16.15f, -60.0f, -36.0f, -60.0f)
                reflectiveCurveToRelative(-36.0f, 26.92f, -36.0f, 60.0f)
                reflectiveCurveToRelative(16.15f, 60.0f, 36.0f, 60.0f)
                reflectiveCurveTo(236.0f, 169.08f, 236.0f, 136.0f)
                close()
            }
        }
        .build()
        return _log!!
    }

private var _log: ImageVector? = null
