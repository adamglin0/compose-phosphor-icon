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

public val BoldGroup.Sneaker: ImageVector
    get() {
        if (_sneaker != null) {
            return _sneaker!!
        }
        _sneaker = Builder(name = "Sneaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.8f, 162.93f)
                lineToRelative(0.0f, -0.31f)
                arcTo(43.94f, 43.94f, 0.0f, false, false, 226.0f, 125.36f)
                lineToRelative(-56.62f, -20.2f)
                lineToRelative(-0.24f, -0.09f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -11.92f, -10.78f)
                lineTo(134.06f, 40.0f)
                lineToRelative(-0.06f, -0.16f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 108.89f, 29.2f)
                lineTo(33.17f, 56.73f)
                arcTo(20.07f, 20.07f, 0.0f, false, false, 20.0f, 75.53f)
                verticalLineTo(192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(167.06f)
                curveTo(256.0f, 165.67f, 255.93f, 164.3f, 255.8f, 162.93f)
                close()
                moveTo(113.53f, 53.05f)
                lineToRelative(6.0f, 14.0f)
                lineTo(103.9f, 72.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 8.2f, 22.55f)
                lineTo(129.0f, 89.14f)
                lineToRelative(4.54f, 10.63f)
                lineToRelative(-13.6f, 5.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 124.0f, 128.0f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, false, 4.1f, -0.73f)
                lineToRelative(19.57f, -7.11f)
                arcToRelative(43.86f, 43.86f, 0.0f, false, false, 13.8f, 7.64f)
                lineTo(218.09f, 148.0f)
                lineToRelative(0.23f, 0.08f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, true, 6.84f, 3.91f)
                horizontalLineTo(44.0f)
                verticalLineTo(78.33f)
                close()
                moveTo(44.0f, 188.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(232.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
