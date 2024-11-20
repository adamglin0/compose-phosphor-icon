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

public val ThinGroup.Sock: ImageVector
    get() {
        if (_sock != null) {
            return _sock!!
        }
        _sock = Builder(name = "Sock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 20.0f)
                lineTo(104.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 32.0f)
                verticalLineToRelative(78.34f)
                lineTo(52.08f, 150.26f)
                arcToRelative(54.91f, 54.91f, 0.0f, false, false, 77.66f, 77.66f)
                lineToRelative(68.4f, -68.41f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 204.0f, 145.37f)
                lineTo(204.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 20.0f)
                close()
                moveTo(104.0f, 28.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(196.0f, 52.0f)
                lineTo(100.0f, 52.0f)
                lineTo(100.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 28.0f)
                close()
                moveTo(124.08f, 222.26f)
                arcToRelative(46.91f, 46.91f, 0.0f, true, true, -66.34f, -66.34f)
                lineToRelative(41.09f, -41.09f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 112.0f)
                lineTo(100.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(48.17f)
                arcTo(52.05f, 52.05f, 0.0f, false, false, 148.0f, 160.0f)
                arcToRelative(51.44f, 51.44f, 0.0f, false, false, 9.0f, 29.3f)
                close()
                moveTo(192.48f, 153.86f)
                lineTo(162.82f, 183.53f)
                arcTo(43.5f, 43.5f, 0.0f, false, true, 156.0f, 160.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, true, 40.0f, -43.81f)
                verticalLineToRelative(29.18f)
                arcTo(11.92f, 11.92f, 0.0f, false, true, 192.48f, 153.86f)
                close()
            }
        }
        .build()
        return _sock!!
    }

private var _sock: ImageVector? = null
