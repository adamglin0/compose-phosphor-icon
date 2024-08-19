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

public val RegularGroup.Log: ImageVector
    get() {
        if (_log != null) {
            return _log!!
        }
        _log = Builder(name = "Log", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 136.0f)
                close()
                moveTo(248.0f, 136.0f)
                curveToRelative(0.0f, 40.37f, -21.08f, 72.0f, -48.0f, 72.0f)
                lineTo(56.0f, 208.0f)
                curveToRelative(-26.92f, 0.0f, -48.0f, -31.63f, -48.0f, -72.0f)
                reflectiveCurveTo(29.08f, 64.0f, 56.0f, 64.0f)
                lineTo(92.69f, 64.0f)
                lineToRelative(37.65f, -37.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(139.31f, 40.0f)
                lineToRelative(-24.0f, 24.0f)
                lineTo(200.0f, 64.0f)
                curveTo(226.92f, 64.0f, 248.0f, 95.63f, 248.0f, 136.0f)
                close()
                moveTo(56.0f, 192.0f)
                lineTo(169.51f, 192.0f)
                arcToRelative(73.46f, 73.46f, 0.0f, false, true, -12.67f, -24.0f)
                lineTo(80.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(73.16f)
                arcTo(110.63f, 110.63f, 0.0f, false, true, 152.0f, 136.0f)
                curveToRelative(0.0f, -22.86f, 6.76f, -42.9f, 17.51f, -56.0f)
                lineTo(56.0f, 80.0f)
                curveToRelative(-12.47f, 0.0f, -23.55f, 13.26f, -28.8f, 32.0f)
                lineTo(104.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(24.35f, 128.0f)
                quadToRelative(-0.34f, 3.93f, -0.35f, 8.0f)
                curveTo(24.0f, 166.36f, 38.65f, 192.0f, 56.0f, 192.0f)
                close()
                moveTo(232.0f, 136.0f)
                curveToRelative(0.0f, -30.36f, -14.65f, -56.0f, -32.0f, -56.0f)
                reflectiveCurveToRelative(-32.0f, 25.64f, -32.0f, 56.0f)
                reflectiveCurveToRelative(14.65f, 56.0f, 32.0f, 56.0f)
                reflectiveCurveTo(232.0f, 166.36f, 232.0f, 136.0f)
                close()
            }
        }
        .build()
        return _log!!
    }

private var _log: ImageVector? = null
