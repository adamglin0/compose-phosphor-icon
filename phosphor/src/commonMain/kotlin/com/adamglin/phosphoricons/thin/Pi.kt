package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 172.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(72.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 72.0f, 60.0f)
                horizontalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(172.0f)
                verticalLineTo(172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
