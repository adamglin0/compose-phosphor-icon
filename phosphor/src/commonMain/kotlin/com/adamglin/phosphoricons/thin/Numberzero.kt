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

public val ThinGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.87f, 65.35f)
                curveTo(167.65f, 46.15f, 149.71f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveTo(88.35f, 46.15f, 76.13f, 65.35f)
                curveTo(65.73f, 81.69f, 60.0f, 103.94f, 60.0f, 128.0f)
                reflectiveCurveToRelative(5.73f, 46.31f, 16.13f, 62.65f)
                curveTo(88.35f, 209.85f, 106.29f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(39.65f, -10.15f, 51.87f, -29.35f)
                curveTo(190.27f, 174.31f, 196.0f, 152.06f, 196.0f, 128.0f)
                reflectiveCurveTo(190.27f, 81.69f, 179.87f, 65.35f)
                close()
                moveTo(128.0f, 212.0f)
                curveToRelative(-41.45f, 0.0f, -60.0f, -42.19f, -60.0f, -84.0f)
                reflectiveCurveToRelative(18.55f, -84.0f, 60.0f, -84.0f)
                reflectiveCurveToRelative(60.0f, 42.19f, 60.0f, 84.0f)
                reflectiveCurveTo(169.45f, 212.0f, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
