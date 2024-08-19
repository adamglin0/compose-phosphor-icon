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

public val ThinGroup.Userfocus: ImageVector
    get() {
        if (_userfocus != null) {
            return _userfocus!!
        }
        _userfocus = Builder(name = "Userfocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 40.0f)
                lineTo(220.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 44.0f)
                lineTo(180.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 40.0f)
                close()
                moveTo(216.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
                moveTo(76.0f, 212.0f)
                lineTo(44.0f, 212.0f)
                lineTo(44.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(76.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(40.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(44.0f, 44.0f)
                lineTo(76.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 80.0f)
                close()
                moveTo(176.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -1.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -89.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.4f, -4.8f)
                arcToRelative(63.65f, 63.65f, 0.0f, false, true, 32.5f, -22.85f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 37.4f, 0.0f)
                arcToRelative(63.65f, 63.65f, 0.0f, false, true, 32.5f, 22.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.0f, 172.0f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 140.0f)
                close()
            }
        }
        .build()
        return _userfocus!!
    }

private var _userfocus: ImageVector? = null
