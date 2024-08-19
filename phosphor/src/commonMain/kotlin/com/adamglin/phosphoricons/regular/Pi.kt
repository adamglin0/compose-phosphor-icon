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

public val RegularGroup.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 172.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 72.0f, 56.0f)
                horizontalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 40.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
