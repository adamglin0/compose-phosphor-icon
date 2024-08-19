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

public val LightGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.65f, 74.08f)
                arcTo(109.26f, 109.26f, 0.0f, false, false, 128.0f, 42.0f)
                horizontalLineToRelative(-0.39f)
                curveTo(67.17f, 42.21f, 18.0f, 92.06f, 18.0f, 153.13f)
                verticalLineTo(176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(152.0f)
                arcTo(109.3f, 109.3f, 0.0f, false, false, 205.65f, 74.08f)
                close()
                moveTo(226.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(115.78f)
                lineToRelative(57.07f, -78.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.7f, -7.06f)
                lineTo(100.94f, 178.0f)
                horizontalLineTo(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(153.13f)
                arcTo(102.36f, 102.36f, 0.0f, false, true, 30.62f, 142.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(32.71f)
                curveTo(42.6f, 88.4f, 78.53f, 56.86f, 122.0f, 54.19f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(54.19f)
                arcTo(98.05f, 98.05f, 0.0f, false, true, 223.53f, 130.0f)
                horizontalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(25.5f)
                curveToRelative(0.33f, 3.3f, 0.5f, 6.64f, 0.5f, 10.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
