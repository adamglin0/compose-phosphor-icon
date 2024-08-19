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

public val RegularGroup.Chartline: ImageVector
    get() {
        if (_chartline != null) {
            return _chartline!!
        }
        _chartline = Builder(name = "Chartline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(94.37f)
                lineTo(90.73f, 98.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.07f, -0.38f)
                lineToRelative(58.81f, 44.11f)
                lineTo(218.73f, 90.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.54f, 12.0f)
                lineToRelative(-64.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.07f, 0.38f)
                lineTo(96.39f, 114.29f)
                lineTo(40.0f, 163.63f)
                verticalLineTo(200.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartline!!
    }

private var _chartline: ImageVector? = null
