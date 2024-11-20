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

public val LightGroup.NotePencil: ImageVector
    get() {
        if (_notePencil != null) {
            return _notePencil!!
        }
        _notePencil = Builder(name = "NotePencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.24f, 59.76f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 90.0f, 128.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineToRelative(96.0f, -96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 228.24f, 59.76f)
                close()
                moveTo(125.51f, 154.0f)
                horizontalLineTo(102.0f)
                verticalLineTo(130.49f)
                lineToRelative(66.0f, -66.0f)
                lineTo(191.51f, 88.0f)
                close()
                moveTo(200.0f, 79.51f)
                lineTo(176.49f, 56.0f)
                lineTo(192.0f, 40.49f)
                lineTo(215.51f, 64.0f)
                close()
                moveTo(222.0f, 128.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                horizontalLineTo(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 34.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
