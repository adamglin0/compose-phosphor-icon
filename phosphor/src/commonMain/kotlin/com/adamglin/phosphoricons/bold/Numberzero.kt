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

public val BoldGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.62f, 61.05f)
                curveToRelative(-13.76f, -21.62f, -34.0f, -33.0f, -58.62f, -33.0f)
                reflectiveCurveTo(83.14f, 39.43f, 69.38f, 61.05f)
                curveTo(58.17f, 78.66f, 52.0f, 102.44f, 52.0f, 128.0f)
                reflectiveCurveToRelative(6.17f, 49.33f, 17.38f, 66.94f)
                curveTo(83.14f, 216.57f, 103.41f, 228.0f, 128.0f, 228.0f)
                reflectiveCurveToRelative(44.86f, -11.43f, 58.62f, -33.06f)
                curveTo(197.83f, 177.33f, 204.0f, 153.56f, 204.0f, 128.0f)
                reflectiveCurveTo(197.83f, 78.66f, 186.62f, 61.05f)
                close()
                moveTo(166.37f, 182.05f)
                curveTo(157.11f, 196.62f, 144.2f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveToRelative(-29.11f, -7.38f, -38.37f, -21.94f)
                curveTo(80.84f, 168.25f, 76.0f, 149.05f, 76.0f, 128.0f)
                reflectiveCurveToRelative(4.84f, -40.25f, 13.63f, -54.06f)
                curveTo(98.89f, 59.38f, 111.8f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveToRelative(29.11f, 7.38f, 38.37f, 21.94f)
                curveTo(175.16f, 87.75f, 180.0f, 107.0f, 180.0f, 128.0f)
                reflectiveCurveTo(175.16f, 168.25f, 166.37f, 182.06f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
