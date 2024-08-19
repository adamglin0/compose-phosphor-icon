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

public val LightGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.35f, 89.15f)
                lineTo(136.41f, 20.82f)
                lineToRelative(-0.13f, -0.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -16.56f, 0.0f)
                lineToRelative(-0.13f, 0.1f)
                lineTo(31.65f, 89.15f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -5.0f, 15.45f)
                lineToRelative(32.0f, 107.56f)
                curveToRelative(0.0f, 0.05f, 0.0f, 0.09f, 0.0f, 0.13f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 222.0f)
                horizontalLineTo(184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.33f, -9.71f)
                reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.13f)
                lineToRelative(32.0f, -107.56f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.35f, 89.15f)
                close()
                moveTo(217.9f, 101.0f)
                reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.12f)
                lineToRelative(-32.0f, 107.54f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 184.0f, 210.0f)
                horizontalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.89f, -1.34f)
                lineToRelative(-32.0f, -107.54f)
                reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.72f, -2.23f)
                lineToRelative(0.13f, -0.1f)
                lineToRelative(87.91f, -68.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.28f, 0.0f)
                lineToRelative(87.91f, 68.3f)
                lineToRelative(0.13f, 0.1f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.9f, 101.0f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
