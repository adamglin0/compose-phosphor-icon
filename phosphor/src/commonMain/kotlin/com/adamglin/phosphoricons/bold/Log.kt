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

public val BoldGroup.Log: ImageVector
    get() {
        if (_log != null) {
            return _log!!
        }
        _log = Builder(name = "Log", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 136.0f)
                close()
                moveTo(252.0f, 136.0f)
                curveToRelative(0.0f, 42.62f, -22.84f, 76.0f, -52.0f, 76.0f)
                lineTo(56.0f, 212.0f)
                curveToRelative(-29.16f, 0.0f, -52.0f, -33.38f, -52.0f, -76.0f)
                reflectiveCurveTo(26.84f, 60.0f, 56.0f, 60.0f)
                lineTo(91.0f, 60.0f)
                lineToRelative(36.48f, -36.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 20.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(141.0f, 44.0f)
                lineTo(125.0f, 60.0f)
                horizontalLineToRelative(75.0f)
                curveTo(229.16f, 60.0f, 252.0f, 93.38f, 252.0f, 136.0f)
                close()
                moveTo(56.0f, 188.0f)
                lineTo(161.77f, 188.0f)
                arcToRelative(83.3f, 83.3f, 0.0f, false, true, -9.09f, -20.0f)
                lineTo(80.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(68.27f)
                curveToRelative(-0.18f, -2.63f, -0.27f, -5.29f, -0.27f, -8.0f)
                curveToRelative(0.0f, -20.3f, 5.19f, -38.5f, 13.77f, -52.0f)
                lineTo(56.0f, 84.0f)
                curveToRelative(-7.85f, 0.0f, -16.23f, 7.51f, -21.76f, 20.0f)
                lineTo(104.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(28.35f, 128.0f)
                curveToRelative(-0.23f, 2.59f, -0.35f, 5.25f, -0.35f, 8.0f)
                curveTo(28.0f, 166.64f, 42.76f, 188.0f, 56.0f, 188.0f)
                close()
                moveTo(228.0f, 136.0f)
                curveToRelative(0.0f, -30.64f, -14.76f, -52.0f, -28.0f, -52.0f)
                reflectiveCurveToRelative(-28.0f, 21.36f, -28.0f, 52.0f)
                reflectiveCurveToRelative(14.76f, 52.0f, 28.0f, 52.0f)
                reflectiveCurveTo(228.0f, 166.64f, 228.0f, 136.0f)
                close()
            }
        }
        .build()
        return _log!!
    }

private var _log: ImageVector? = null
