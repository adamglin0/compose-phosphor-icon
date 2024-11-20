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

public val RegularGroup.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) {
            return _userCirclePlus!!
        }
        _userCirclePlus = Builder(name = "UserCirclePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(208.0f, 64.0f)
                lineTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 64.0f)
                lineTo(176.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 56.0f)
                close()
                moveTo(230.56f, 110.68f)
                arcToRelative(103.92f, 103.92f, 0.0f, true, true, -85.24f, -85.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.64f, 15.78f)
                arcTo(88.07f, 88.07f, 0.0f, false, false, 40.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f)
                arcTo(79.66f, 79.66f, 0.0f, false, true, 98.3f, 157.66f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.4f, 0.0f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, true, 36.06f, 28.75f)
                arcTo(87.62f, 87.62f, 0.0f, false, false, 216.0f, 128.0f)
                arcToRelative(88.85f, 88.85f, 0.0f, false, false, -1.22f, -14.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.57f, 87.57f, 0.0f, false, false, 53.92f, -18.5f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -107.84f, 0.0f)
                arcTo(87.57f, 87.57f, 0.0f, false, false, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
