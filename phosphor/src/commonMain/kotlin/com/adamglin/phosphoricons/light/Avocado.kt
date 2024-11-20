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

public val LightGroup.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 114.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 114.0f)
                close()
                moveTo(128.0f, 194.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 194.0f)
                close()
                moveTo(209.1f, 131.32f)
                lineTo(179.3f, 47.11f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 77.08f, 46.0f)
                horizontalLineToRelative(0.0f)
                lineTo(47.56f, 129.52f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, false, 161.54f, 1.8f)
                close()
                moveTo(128.0f, 234.0f)
                arcTo(74.05f, 74.05f, 0.0f, false, true, 58.8f, 133.72f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.09f, 0.05f, -0.13f)
                lineTo(88.39f, 50.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 79.53f, 0.92f)
                reflectiveCurveToRelative(0.0f, 0.08f, 0.05f, 0.13f)
                lineToRelative(29.82f, 84.28f)
                arcTo(74.06f, 74.06f, 0.0f, false, true, 128.0f, 234.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
