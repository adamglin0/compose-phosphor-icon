package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.NumberZero: ImageVector
    get() {
        if (_numberZero != null) {
            return _numberZero!!
        }
        _numberZero = Builder(name = "NumberZero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(157.68f, 88.39f)
                curveTo(164.34f, 98.52f, 168.0f, 112.59f, 168.0f, 128.0f)
                reflectiveCurveToRelative(-3.66f, 29.47f, -10.32f, 39.61f)
                curveTo(150.55f, 178.49f, 140.56f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-22.55f, -5.51f, -29.68f, -16.39f)
                curveTo(91.66f, 157.47f, 88.0f, 143.41f, 88.0f, 128.0f)
                reflectiveCurveToRelative(3.66f, -29.48f, 10.32f, -39.61f)
                curveTo(105.45f, 77.51f, 115.44f, 72.0f, 128.0f, 72.0f)
                reflectiveCurveTo(150.55f, 77.51f, 157.68f, 88.39f)
                close()
                moveTo(216.0f, 40.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(56.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                lineTo(200.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f)
                close()
                moveTo(184.0f, 128.0f)
                curveToRelative(0.0f, -18.49f, -4.6f, -35.68f, -12.94f, -48.39f)
                curveTo(160.92f, 64.16f, 146.0f, 56.0f, 128.0f, 56.0f)
                reflectiveCurveTo(95.08f, 64.16f, 84.94f, 79.61f)
                curveTo(76.6f, 92.32f, 72.0f, 109.51f, 72.0f, 128.0f)
                reflectiveCurveToRelative(4.6f, 35.68f, 12.94f, 48.39f)
                curveTo(95.08f, 191.84f, 110.0f, 200.0f, 128.0f, 200.0f)
                reflectiveCurveToRelative(32.92f, -8.16f, 43.06f, -23.61f)
                curveTo(179.4f, 163.68f, 184.0f, 146.49f, 184.0f, 128.0f)
                close()
            }
        }
        .build()
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
