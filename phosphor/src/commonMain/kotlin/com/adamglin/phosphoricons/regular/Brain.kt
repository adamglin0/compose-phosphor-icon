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

public val RegularGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 124.0f)
                arcToRelative(56.11f, 56.11f, 0.0f, false, false, -32.0f, -50.61f)
                lineTo(216.0f, 72.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -88.0f, -26.49f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 40.0f, 72.0f)
                verticalLineToRelative(1.39f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, 101.2f)
                lineTo(40.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 88.0f, 26.49f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 216.0f, 176.0f)
                verticalLineToRelative(-1.41f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 248.0f, 124.0f)
                close()
                moveTo(88.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -31.81f, -28.56f)
                arcTo(55.87f, 55.87f, 0.0f, false, false, 64.0f, 180.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(64.0f, 164.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 50.67f, 86.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 78.73f)
                lineTo(56.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                verticalLineToRelative(68.26f)
                arcTo(47.8f, 47.8f, 0.0f, false, false, 88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
                moveTo(192.0f, 164.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(55.87f, 55.87f, 0.0f, false, false, 7.81f, -0.56f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, false, -32.0f, 12.26f)
                lineTo(136.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                verticalLineToRelative(6.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.33f, 7.54f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 192.0f, 164.0f)
                close()
                moveTo(208.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(160.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 112.0f)
                close()
                moveTo(60.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(4.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 84.0f)
                lineTo(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 60.0f, 120.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
