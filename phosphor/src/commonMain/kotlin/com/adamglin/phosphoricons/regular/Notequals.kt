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

public val RegularGroup.Notequals: ImageVector
    get() {
        if (_notequals != null) {
            return _notequals!!
        }
        _notequals = Builder(name = "Notequals", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(102.45f)
                lineTo(53.92f, 221.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.84f, -10.76f)
                lineTo(80.82f, 168.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(95.37f)
                lineTo(139.0f, 104.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(153.55f)
                lineToRelative(48.53f, -53.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.84f, 10.76f)
                lineTo(175.18f, 88.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(160.63f)
                lineTo(117.0f, 152.0f)
                horizontalLineToRelative(99.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 160.0f)
                close()
            }
        }
        .build()
        return _notequals!!
    }

private var _notequals: ImageVector? = null
