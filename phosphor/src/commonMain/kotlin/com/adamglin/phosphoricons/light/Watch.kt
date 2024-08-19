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

public val LightGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 128.0f)
                arcToRelative(77.92f, 77.92f, 0.0f, false, false, -32.53f, -63.31f)
                lineTo(167.1f, 29.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 153.32f, 18.0f)
                lineTo(102.68f, 18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.9f, 29.5f)
                lineTo(82.53f, 64.69f)
                arcToRelative(77.87f, 77.87f, 0.0f, false, false, 0.0f, 126.62f)
                lineTo(88.9f, 226.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 102.68f, 238.0f)
                horizontalLineToRelative(50.64f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.78f, -11.5f)
                lineToRelative(6.37f, -35.19f)
                arcTo(77.92f, 77.92f, 0.0f, false, false, 206.0f, 128.0f)
                close()
                moveTo(100.71f, 31.64f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.64f)
                horizontalLineToRelative(50.64f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.64f)
                lineToRelative(4.56f, 25.19f)
                arcToRelative(77.68f, 77.68f, 0.0f, false, false, -63.7f, 0.0f)
                close()
                moveTo(155.29f, 224.36f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.64f)
                lineTo(102.68f, 226.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.64f)
                lineToRelative(-4.56f, -25.19f)
                arcToRelative(77.68f, 77.68f, 0.0f, false, false, 63.7f, 0.0f)
                close()
                moveTo(128.0f, 194.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, -66.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, true, 128.0f, 194.0f)
                close()
                moveTo(174.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(128.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(122.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(34.0f)
                horizontalLineToRelative(34.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 128.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
