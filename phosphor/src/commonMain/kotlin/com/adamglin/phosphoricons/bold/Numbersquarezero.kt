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

public val BoldGroup.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) {
            return _numberSquareZero!!
        }
        _numberSquareZero = Builder(name = "NumberSquareZero", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 188.0f)
                curveToRelative(28.26f, 0.0f, 48.0f, -24.67f, 48.0f, -60.0f)
                reflectiveCurveToRelative(-19.74f, -60.0f, -48.0f, -60.0f)
                reflectiveCurveTo(80.0f, 92.67f, 80.0f, 128.0f)
                reflectiveCurveTo(99.74f, 188.0f, 128.0f, 188.0f)
                close()
                moveTo(128.0f, 92.0f)
                curveToRelative(23.33f, 0.0f, 24.0f, 32.32f, 24.0f, 36.0f)
                reflectiveCurveToRelative(-0.67f, 36.0f, -24.0f, 36.0f)
                reflectiveCurveToRelative(-24.0f, -32.32f, -24.0f, -36.0f)
                reflectiveCurveTo(104.67f, 92.0f, 128.0f, 92.0f)
                close()
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
            }
        }
        .build()
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
