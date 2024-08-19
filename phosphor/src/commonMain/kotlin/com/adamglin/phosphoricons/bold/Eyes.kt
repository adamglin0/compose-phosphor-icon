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

public val BoldGroup.Eyes: ImageVector
    get() {
        if (_eyes != null) {
            return _eyes!!
        }
        _eyes = Builder(name = "Eyes", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.48f, 60.0f)
                curveTo(209.21f, 39.37f, 193.42f, 28.0f, 176.0f, 28.0f)
                reflectiveCurveToRelative(-33.21f, 11.37f, -44.48f, 32.0f)
                curveToRelative(-1.24f, 2.28f, -2.42f, 4.65f, -3.52f, 7.11f)
                curveToRelative(-1.1f, -2.46f, -2.28f, -4.83f, -3.52f, -7.11f)
                curveTo(113.21f, 39.37f, 97.42f, 28.0f, 80.0f, 28.0f)
                reflectiveCurveTo(46.79f, 39.37f, 35.52f, 60.0f)
                curveTo(25.51f, 78.38f, 20.0f, 102.52f, 20.0f, 128.0f)
                reflectiveCurveToRelative(5.51f, 49.62f, 15.52f, 68.0f)
                curveTo(46.79f, 216.62f, 62.58f, 228.0f, 80.0f, 228.0f)
                reflectiveCurveToRelative(33.21f, -11.38f, 44.48f, -32.0f)
                curveToRelative(1.24f, -2.28f, 2.42f, -4.65f, 3.52f, -7.11f)
                curveToRelative(1.1f, 2.46f, 2.28f, 4.83f, 3.52f, 7.11f)
                curveToRelative(11.27f, 20.65f, 27.06f, 32.0f, 44.48f, 32.0f)
                reflectiveCurveToRelative(33.21f, -11.38f, 44.48f, -32.0f)
                curveToRelative(10.0f, -18.35f, 15.52f, -42.49f, 15.52f, -68.0f)
                reflectiveCurveTo(230.49f, 78.38f, 220.48f, 60.0f)
                close()
                moveTo(152.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 116.0f)
                close()
                moveTo(56.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 116.0f)
                close()
                moveTo(80.0f, 204.0f)
                curveToRelative(-12.08f, 0.0f, -25.13f, -15.72f, -31.7f, -40.84f)
                arcTo(35.55f, 35.55f, 0.0f, false, false, 56.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                arcToRelative(35.55f, 35.55f, 0.0f, false, false, -7.7f, 0.84f)
                curveTo(54.87f, 67.72f, 67.92f, 52.0f, 80.0f, 52.0f)
                curveToRelative(17.0f, 0.0f, 36.0f, 31.21f, 36.0f, 76.0f)
                reflectiveCurveTo(97.0f, 204.0f, 80.0f, 204.0f)
                close()
                moveTo(176.0f, 204.0f)
                curveToRelative(-12.08f, 0.0f, -25.13f, -15.72f, -31.7f, -40.84f)
                arcToRelative(35.55f, 35.55f, 0.0f, false, false, 7.7f, 0.84f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                arcToRelative(35.55f, 35.55f, 0.0f, false, false, -7.7f, 0.84f)
                curveTo(150.87f, 67.72f, 163.92f, 52.0f, 176.0f, 52.0f)
                curveToRelative(17.0f, 0.0f, 36.0f, 31.21f, 36.0f, 76.0f)
                reflectiveCurveTo(193.0f, 204.0f, 176.0f, 204.0f)
                close()
            }
        }
        .build()
        return _eyes!!
    }

private var _eyes: ImageVector? = null
