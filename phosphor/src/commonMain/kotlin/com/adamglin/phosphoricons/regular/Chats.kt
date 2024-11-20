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

public val RegularGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 80.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 48.0f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 6.22f)
                lineTo(72.0f, 154.0f)
                verticalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(93.59f)
                lineTo(219.0f, 230.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, 1.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 80.0f)
                close()
                moveTo(66.55f, 137.78f)
                lineTo(40.0f, 159.25f)
                verticalLineTo(48.0f)
                horizontalLineTo(168.0f)
                verticalLineToRelative(88.0f)
                horizontalLineTo(71.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 66.55f, 137.78f)
                close()
                moveTo(216.0f, 207.25f)
                lineToRelative(-26.55f, -21.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -1.78f)
                horizontalLineTo(88.0f)
                verticalLineTo(152.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
