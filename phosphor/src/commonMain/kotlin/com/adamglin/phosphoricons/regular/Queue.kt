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

public val RegularGroup.Queue: ImageVector
    get() {
        if (_queue != null) {
            return _queue!!
        }
        _queue = Builder(name = "Queue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(216.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 64.0f)
                close()
                moveTo(136.0f, 120.0f)
                lineTo(40.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(136.0f, 184.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.76f, 6.78f)
                lineToRelative(-64.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 200.0f)
                lineTo(168.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.24f, -6.78f)
                lineToRelative(64.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 160.0f)
                close()
                moveTo(224.91f, 160.0f)
                lineTo(184.0f, 134.43f)
                verticalLineToRelative(51.14f)
                close()
            }
        }
        .build()
        return _queue!!
    }

private var _queue: ImageVector? = null
