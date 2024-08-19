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

public val FillGroup.Gauge: ImageVector
    get() {
        if (_gauge != null) {
            return _gauge!!
        }
        _gauge = Builder(name = "Gauge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 152.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(115.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, -6.35f)
                lineTo(174.27f, 101.0f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, -1.37f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.37f, 1.61f)
                lineToRelative(-72.0f, 99.06f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 86.25f, 192.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(153.13f)
                curveToRelative(0.0f, -1.79f, 0.0f, -3.57f, 0.13f, -5.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.8f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 47.73f, 128.0f)
                horizontalLineTo(23.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, -5.0f)
                curveToRelative(12.0f, -43.84f, 49.66f, -77.13f, 95.52f, -82.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.43f, 4.0f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 136.0f, 71.73f)
                verticalLineTo(44.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.43f, -4.0f)
                arcTo(112.18f, 112.18f, 0.0f, false, true, 236.23f, 123.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 5.0f)
                horizontalLineTo(208.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.53f)
                horizontalLineToRelative(27.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.86f)
                curveTo(240.0f, 149.23f, 240.0f, 150.61f, 240.0f, 152.0f)
                close()
            }
        }
        .build()
        return _gauge!!
    }

private var _gauge: ImageVector? = null
