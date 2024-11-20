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

public val LightGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.56f, 64.28f)
                curveTo(169.0f, 44.47f, 150.43f, 34.0f, 128.0f, 34.0f)
                reflectiveCurveTo(87.05f, 44.47f, 74.44f, 64.28f)
                curveTo(63.84f, 80.94f, 58.0f, 103.57f, 58.0f, 128.0f)
                reflectiveCurveToRelative(5.84f, 47.06f, 16.44f, 63.72f)
                curveTo(87.05f, 211.53f, 105.57f, 222.0f, 128.0f, 222.0f)
                reflectiveCurveToRelative(40.95f, -10.47f, 53.56f, -30.28f)
                curveTo(192.16f, 175.06f, 198.0f, 152.43f, 198.0f, 128.0f)
                reflectiveCurveTo(192.16f, 80.94f, 181.56f, 64.28f)
                close()
                moveTo(128.0f, 210.0f)
                curveToRelative(-40.07f, 0.0f, -58.0f, -41.18f, -58.0f, -82.0f)
                reflectiveCurveToRelative(17.93f, -82.0f, 58.0f, -82.0f)
                reflectiveCurveToRelative(58.0f, 41.18f, 58.0f, 82.0f)
                reflectiveCurveTo(168.07f, 210.0f, 128.0f, 210.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
