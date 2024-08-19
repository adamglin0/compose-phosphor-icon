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

public val ThinGroup.Notionlogo: ImageVector
    get() {
        if (_notionlogo != null) {
            return _notionlogo!!
        }
        _notionlogo = Builder(name = "Notionlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(192.43f)
                lineTo(107.5f, 46.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 44.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(204.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(68.0f)
                verticalLineTo(63.57f)
                lineToRelative(80.5f, 146.36f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 212.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(70.77f, 52.0f)
                horizontalLineToRelative(30.86f)
                lineToRelative(83.6f, 152.0f)
                horizontalLineTo(154.37f)
                close()
            }
        }
        .build()
        return _notionlogo!!
    }

private var _notionlogo: ImageVector? = null
