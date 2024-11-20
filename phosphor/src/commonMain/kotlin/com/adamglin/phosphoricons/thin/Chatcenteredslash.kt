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

public val ThinGroup.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) {
            return _chatCenteredSlash!!
        }
        _chatCenteredSlash = Builder(name = "ChatCenteredSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(46.23f, 44.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(62.75f)
                lineTo(117.58f, 222.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.84f, 0.0f)
                lineTo(153.25f, 196.0f)
                horizontalLineToRelative(31.16f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(150.93f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.47f, 2.0f)
                lineToRelative(-16.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.94f, 0.0f)
                lineToRelative(-16.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.47f, -2.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(53.5f)
                lineTo(177.14f, 188.0f)
                close()
                moveTo(228.0f, 56.0f)
                verticalLineTo(186.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(98.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
            }
        }
        .build()
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
