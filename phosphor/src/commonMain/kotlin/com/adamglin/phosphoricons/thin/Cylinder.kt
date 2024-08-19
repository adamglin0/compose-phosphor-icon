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

public val ThinGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                curveTo(89.87f, 20.0f, 60.0f, 37.57f, 60.0f, 60.0f)
                lineTo(60.0f, 196.0f)
                curveToRelative(0.0f, 22.43f, 29.87f, 40.0f, 68.0f, 40.0f)
                reflectiveCurveToRelative(68.0f, -17.57f, 68.0f, -40.0f)
                lineTo(196.0f, 60.0f)
                curveTo(196.0f, 37.57f, 166.13f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 28.0f)
                curveToRelative(32.52f, 0.0f, 60.0f, 14.65f, 60.0f, 32.0f)
                reflectiveCurveToRelative(-27.48f, 32.0f, -60.0f, 32.0f)
                reflectiveCurveTo(68.0f, 77.35f, 68.0f, 60.0f)
                reflectiveCurveTo(95.48f, 28.0f, 128.0f, 28.0f)
                close()
                moveTo(188.0f, 196.0f)
                curveToRelative(0.0f, 17.35f, -27.48f, 32.0f, -60.0f, 32.0f)
                reflectiveCurveToRelative(-60.0f, -14.65f, -60.0f, -32.0f)
                lineTo(68.0f, 79.11f)
                curveTo(79.35f, 91.65f, 101.71f, 100.0f, 128.0f, 100.0f)
                reflectiveCurveToRelative(48.65f, -8.35f, 60.0f, -20.89f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
