package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                arcToRelative(39.3f, 39.3f, 0.0f, false, false, -6.27f, 0.5f)
                lineTo(175.49f, 37.19f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 32.0f)
                lineTo(136.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(26.46f)
                lineToRelative(32.3f, 86.13f)
                arcToRelative(40.13f, 40.13f, 0.0f, false, false, -18.0f, 25.87f)
                lineTo(136.54f, 160.0f)
                lineToRelative(-25.0f, -66.81f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f)
                lineTo(24.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(13.39f)
                arcTo(56.12f, 56.12f, 0.0f, false, false, 0.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(8.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 78.4f, 0.0f)
                horizontalLineToRelative(81.6f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 216.0f, 128.0f)
                close()
                moveTo(42.67f, 130.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 122.73f)
                lineTo(48.0f, 104.0f)
                lineTo(98.46f, 104.0f)
                lineToRelative(21.0f, 56.0f)
                lineTo(16.81f, 160.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, true, 42.67f, 130.27f)
                close()
                moveTo(56.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -22.62f, -16.0f)
                lineTo(78.62f, 176.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 192.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -15.43f, -42.36f)
                lineToRelative(7.94f, 21.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, -5.62f)
                lineTo(215.55f, 144.0f)
                lineTo(216.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
