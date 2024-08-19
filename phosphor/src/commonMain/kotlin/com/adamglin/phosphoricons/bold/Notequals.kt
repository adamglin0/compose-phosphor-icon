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

public val BoldGroup.Notequals: ImageVector
    get() {
        if (_notequals != null) {
            return _notequals!!
        }
        _notequals = Builder(name = "Notequals", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(104.22f)
                lineTo(56.88f, 224.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.76f, -16.14f)
                lineTo(71.78f, 172.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(93.6f)
                lineTo(130.0f, 108.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(151.78f)
                lineToRelative(47.34f, -52.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.76f, 16.14f)
                lineTo(184.22f, 84.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(162.4f)
                lineTo(126.0f, 148.0f)
                horizontalLineToRelative(90.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 160.0f)
                close()
            }
        }
        .build()
        return _notequals!!
    }

private var _notequals: ImageVector? = null
