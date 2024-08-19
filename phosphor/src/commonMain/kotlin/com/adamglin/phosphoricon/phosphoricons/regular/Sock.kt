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

public val RegularGroup.Sock: ImageVector
    get() {
        if (_sock != null) {
            return _sock!!
        }
        _sock = Builder(name = "Sock", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 16.0f)
                lineTo(104.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 32.0f)
                verticalLineToRelative(76.69f)
                lineTo(49.25f, 147.43f)
                arcToRelative(58.92f, 58.92f, 0.0f, false, false, 83.32f, 83.32f)
                lineTo(201.0f, 162.34f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, false, 7.0f, -17.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 16.0f)
                close()
                moveTo(192.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                lineTo(192.0f, 48.0f)
                lineTo(104.0f, 48.0f)
                lineTo(104.0f, 32.0f)
                close()
                moveTo(121.25f, 219.43f)
                arcToRelative(42.91f, 42.91f, 0.0f, true, true, -60.68f, -60.68f)
                lineToRelative(41.09f, -41.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 112.0f)
                lineTo(104.0f, 64.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(40.58f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 144.0f, 160.0f)
                arcToRelative(55.4f, 55.4f, 0.0f, false, false, 7.93f, 28.76f)
                close()
                moveTo(189.66f, 151.0f)
                lineToRelative(-25.91f, 25.91f)
                arcTo(39.6f, 39.6f, 0.0f, false, true, 160.0f, 160.0f)
                arcToRelative(40.05f, 40.05f, 0.0f, false, true, 32.0f, -39.19f)
                verticalLineToRelative(24.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 151.0f)
                close()
            }
        }
        .build()
        return _sock!!
    }

private var _sock: ImageVector? = null
