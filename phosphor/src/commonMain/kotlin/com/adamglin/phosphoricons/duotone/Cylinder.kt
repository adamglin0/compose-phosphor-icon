package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 60.0f)
                curveToRelative(0.0f, 19.88f, -28.65f, 36.0f, -64.0f, 36.0f)
                reflectiveCurveTo(64.0f, 79.88f, 64.0f, 60.0f)
                reflectiveCurveToRelative(28.65f, -36.0f, 64.0f, -36.0f)
                reflectiveCurveTo(192.0f, 40.12f, 192.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                curveTo(87.63f, 16.0f, 56.0f, 35.33f, 56.0f, 60.0f)
                lineTo(56.0f, 196.0f)
                curveToRelative(0.0f, 24.67f, 31.63f, 44.0f, 72.0f, 44.0f)
                reflectiveCurveToRelative(72.0f, -19.33f, 72.0f, -44.0f)
                lineTo(200.0f, 60.0f)
                curveTo(200.0f, 35.33f, 168.37f, 16.0f, 128.0f, 16.0f)
                close()
                moveTo(128.0f, 32.0f)
                curveToRelative(26.49f, 0.0f, 56.0f, 11.5f, 56.0f, 28.0f)
                reflectiveCurveToRelative(-29.51f, 28.0f, -56.0f, 28.0f)
                reflectiveCurveTo(72.0f, 76.5f, 72.0f, 60.0f)
                reflectiveCurveTo(101.51f, 32.0f, 128.0f, 32.0f)
                close()
                moveTo(128.0f, 224.0f)
                curveToRelative(-29.83f, 0.0f, -56.0f, -13.08f, -56.0f, -28.0f)
                lineTo(72.0f, 88.0f)
                curveToRelative(13.1f, 9.85f, 33.14f, 16.0f, 56.0f, 16.0f)
                reflectiveCurveToRelative(42.9f, -6.2f, 56.0f, -16.0f)
                lineTo(184.0f, 196.0f)
                curveTo(184.0f, 210.92f, 157.83f, 224.0f, 128.0f, 224.0f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
