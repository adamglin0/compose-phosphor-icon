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

public val RegularGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 68.0f)
                close()
                moveTo(240.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.56f, 6.66f)
                lineTo(216.0f, 100.28f)
                lineTo(216.0f, 120.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 112.0f, 224.0f)
                lineTo(24.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.49f, -26.0f)
                lineToRelative(0.1f, -0.12f)
                lineTo(96.0f, 96.63f)
                lineTo(96.0f, 76.89f)
                curveTo(96.0f, 43.47f, 122.79f, 16.16f, 155.71f, 16.0f)
                lineTo(156.0f, 16.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 57.21f, 41.86f)
                lineToRelative(23.23f, 15.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 80.0f)
                close()
                moveTo(217.58f, 80.0f)
                lineTo(201.9f, 69.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.31f, -4.64f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 156.0f, 32.0f)
                horizontalLineToRelative(-0.22f)
                curveTo(131.64f, 32.12f, 112.0f, 52.25f, 112.0f, 76.89f)
                lineTo(112.0f, 99.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.85f, 5.13f)
                lineTo(24.0f, 208.0f)
                horizontalLineToRelative(26.9f)
                lineToRelative(70.94f, -85.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.29f, 10.24f)
                lineTo(71.75f, 208.0f)
                lineTo(112.0f, 208.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f)
                lineTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.56f, -6.66f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
