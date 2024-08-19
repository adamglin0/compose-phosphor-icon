package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.06f, 72.67f)
                arcTo(111.24f, 111.24f, 0.0f, false, false, 128.0f, 40.0f)
                horizontalLineToRelative(-0.4f)
                curveTo(66.07f, 40.21f, 16.0f, 91.0f, 16.0f, 153.13f)
                verticalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(152.0f)
                arcTo(111.25f, 111.25f, 0.0f, false, false, 207.06f, 72.67f)
                close()
                moveTo(224.0f, 176.0f)
                horizontalLineTo(119.71f)
                lineToRelative(54.76f, -75.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.94f, -9.42f)
                lineTo(99.92f, 176.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(153.13f)
                curveToRelative(0.0f, -3.08f, 0.15f, -6.12f, 0.43f, -9.13f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(35.27f)
                curveToRelative(10.32f, -38.86f, 44.0f, -68.24f, 84.73f, -71.66f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(56.33f)
                arcTo(96.14f, 96.14f, 0.0f, false, true, 221.0f, 128.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(23.67f)
                curveToRelative(0.21f, 2.65f, 0.33f, 5.31f, 0.33f, 8.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
