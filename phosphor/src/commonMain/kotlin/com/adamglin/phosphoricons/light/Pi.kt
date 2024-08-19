package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 172.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -68.0f, 0.0f)
                verticalLineTo(70.0f)
                horizontalLineTo(94.0f)
                verticalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(70.0f)
                horizontalLineTo(72.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -42.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, true, 72.0f, 58.0f)
                horizontalLineTo(224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(174.0f)
                verticalLineTo(172.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
