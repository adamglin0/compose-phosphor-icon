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

public val FillGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.47f, 197.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.61f, 10.33f)
                arcTo(125.91f, 125.91f, 0.0f, false, true, 136.0f, 215.68f)
                lineTo(136.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 215.68f)
                arcToRelative(125.91f, 125.91f, 0.0f, false, true, -34.86f, -8.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 5.72f, -14.94f)
                curveTo(104.0f, 197.56f, 116.15f, 200.0f, 128.0f, 200.0f)
                reflectiveCurveToRelative(24.0f, -2.44f, 37.14f, -7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 175.47f, 197.14f)
                close()
                moveTo(216.0f, 96.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 128.0f, 8.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 216.0f, 96.0f)
                close()
                moveTo(144.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 132.0f)
                close()
                moveTo(176.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 100.0f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
