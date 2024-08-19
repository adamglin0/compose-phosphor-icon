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

public val LightGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 18.0f)
                curveTo(88.75f, 18.0f, 58.0f, 36.45f, 58.0f, 60.0f)
                lineTo(58.0f, 196.0f)
                curveToRelative(0.0f, 23.55f, 30.75f, 42.0f, 70.0f, 42.0f)
                reflectiveCurveToRelative(70.0f, -18.45f, 70.0f, -42.0f)
                lineTo(198.0f, 60.0f)
                curveTo(198.0f, 36.45f, 167.25f, 18.0f, 128.0f, 18.0f)
                close()
                moveTo(128.0f, 30.0f)
                curveToRelative(31.44f, 0.0f, 58.0f, 13.74f, 58.0f, 30.0f)
                reflectiveCurveToRelative(-26.56f, 30.0f, -58.0f, 30.0f)
                reflectiveCurveTo(70.0f, 76.26f, 70.0f, 60.0f)
                reflectiveCurveTo(96.56f, 30.0f, 128.0f, 30.0f)
                close()
                moveTo(128.0f, 226.0f)
                curveToRelative(-31.44f, 0.0f, -58.0f, -13.74f, -58.0f, -30.0f)
                lineTo(70.0f, 83.81f)
                curveTo(82.48f, 94.87f, 103.59f, 102.0f, 128.0f, 102.0f)
                reflectiveCurveToRelative(45.52f, -7.13f, 58.0f, -18.19f)
                lineTo(186.0f, 196.0f)
                curveTo(186.0f, 212.26f, 159.44f, 226.0f, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
