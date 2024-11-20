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

public val BoldGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.88f, 69.83f)
                arcTo(115.19f, 115.19f, 0.0f, false, false, 128.0f, 36.0f)
                horizontalLineToRelative(-0.41f)
                curveTo(63.85f, 36.22f, 12.0f, 88.76f, 12.0f, 153.13f)
                verticalLineTo(176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(152.0f)
                arcTo(115.25f, 115.25f, 0.0f, false, false, 209.88f, 69.83f)
                close()
                moveTo(220.0f, 172.0f)
                horizontalLineTo(127.32f)
                lineToRelative(46.44f, -65.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 154.24f, 93.0f)
                lineTo(97.82f, 172.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(153.13f)
                curveToRelative(0.0f, -1.72f, 0.0f, -3.43f, 0.14f, -5.13f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(40.62f)
                curveToRelative(10.91f, -33.39f, 40.0f, -58.52f, 75.38f, -63.21f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(60.8f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 215.66f, 124.0f)
                horizontalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(19.9f)
                curveToRelative(0.06f, 1.33f, 0.1f, 2.66f, 0.1f, 4.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
