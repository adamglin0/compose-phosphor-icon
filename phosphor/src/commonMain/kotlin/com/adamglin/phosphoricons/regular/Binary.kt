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

public val RegularGroup.Binary: ImageVector
    get() {
        if (_binary != null) {
            return _binary!!
        }
        _binary = Builder(name = "Binary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 24.0f)
                curveTo(71.63f, 24.0f, 56.0f, 43.74f, 56.0f, 72.0f)
                reflectiveCurveToRelative(15.63f, 48.0f, 38.0f, 48.0f)
                reflectiveCurveToRelative(38.0f, -19.74f, 38.0f, -48.0f)
                reflectiveCurveTo(116.37f, 24.0f, 94.0f, 24.0f)
                close()
                moveTo(94.0f, 104.0f)
                curveToRelative(-17.37f, 0.0f, -22.0f, -20.11f, -22.0f, -32.0f)
                reflectiveCurveToRelative(4.63f, -32.0f, 22.0f, -32.0f)
                reflectiveCurveToRelative(22.0f, 20.11f, 22.0f, 32.0f)
                reflectiveCurveTo(111.37f, 104.0f, 94.0f, 104.0f)
                close()
                moveTo(166.0f, 136.0f)
                curveToRelative(-22.37f, 0.0f, -38.0f, 19.74f, -38.0f, 48.0f)
                reflectiveCurveToRelative(15.63f, 48.0f, 38.0f, 48.0f)
                reflectiveCurveToRelative(38.0f, -19.74f, 38.0f, -48.0f)
                reflectiveCurveTo(188.37f, 136.0f, 166.0f, 136.0f)
                close()
                moveTo(166.0f, 216.0f)
                curveToRelative(-17.37f, 0.0f, -22.0f, -20.11f, -22.0f, -32.0f)
                reflectiveCurveToRelative(4.63f, -32.0f, 22.0f, -32.0f)
                reflectiveCurveToRelative(22.0f, 20.11f, 22.0f, 32.0f)
                reflectiveCurveTo(183.37f, 216.0f, 166.0f, 216.0f)
                close()
                moveTo(145.0f, 49.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.11f, -10.88f)
                lineToRelative(24.0f, -13.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 32.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 45.6f)
                lineToRelative(-12.12f, 6.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 145.0f, 49.22f)
                close()
                moveTo(104.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(88.0f, 157.6f)
                lineToRelative(-12.12f, 6.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.76f, -14.0f)
                lineToRelative(24.0f, -13.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 144.0f)
                close()
            }
        }
        .build()
        return _binary!!
    }

private var _binary: ImageVector? = null
