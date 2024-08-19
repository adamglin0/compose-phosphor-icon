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

public val LightGroup.Sock: ImageVector
    get() {
        if (_sock != null) {
            return _sock!!
        }
        _sock = Builder(name = "Sock", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 18.0f)
                lineTo(104.0f, 18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 90.0f, 32.0f)
                verticalLineToRelative(77.51f)
                lineTo(50.67f, 148.85f)
                arcToRelative(56.91f, 56.91f, 0.0f, true, false, 80.48f, 80.48f)
                lineToRelative(68.41f, -68.4f)
                arcTo(21.88f, 21.88f, 0.0f, false, false, 206.0f, 145.37f)
                lineTo(206.0f, 32.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 18.0f)
                close()
                moveTo(104.0f, 30.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(194.0f, 50.0f)
                lineTo(102.0f, 50.0f)
                lineTo(102.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 104.0f, 30.0f)
                close()
                moveTo(122.67f, 220.85f)
                arcToRelative(44.92f, 44.92f, 0.0f, false, true, -63.52f, -63.52f)
                lineToRelative(41.09f, -41.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 112.0f)
                lineTo(102.0f, 62.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.34f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 146.0f, 160.0f)
                arcToRelative(53.39f, 53.39f, 0.0f, false, false, 8.47f, 29.0f)
                close()
                moveTo(191.07f, 152.44f)
                lineTo(163.22f, 180.3f)
                arcTo(41.54f, 41.54f, 0.0f, false, true, 158.0f, 160.0f)
                arcToRelative(42.05f, 42.05f, 0.0f, false, true, 36.0f, -41.56f)
                verticalLineToRelative(26.93f)
                arcTo(9.93f, 9.93f, 0.0f, false, true, 191.07f, 152.44f)
                close()
            }
        }
        .build()
        return _sock!!
    }

private var _sock: ImageVector? = null
