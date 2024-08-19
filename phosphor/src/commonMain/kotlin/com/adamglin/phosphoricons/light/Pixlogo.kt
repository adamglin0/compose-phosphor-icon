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

public val LightGroup.Pixlogo: ImageVector
    get() {
        if (_pixlogo != null) {
            return _pixlogo!!
        }
        _pixlogo = Builder(name = "Pixlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.91f, 118.14f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, -19.72f, 0.0f)
                lineToRelative(-96.0f, 96.05f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 0.0f, 19.72f)
                lineToRelative(96.05f, 96.0f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 19.72f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 0.0f, -19.72f)
                close()
                moveTo(126.62f, 30.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.76f, 0.0f)
                lineTo(188.81f, 90.0f)
                lineTo(160.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f)
                lineTo(128.0f, 119.52f)
                lineTo(100.24f, 91.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 90.0f)
                lineTo(67.19f, 90.0f)
                close()
                moveTo(30.0f, 128.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 0.57f, -1.38f)
                lineTo(55.19f, 102.0f)
                lineTo(93.51f, 102.0f)
                lineToRelative(26.0f, 26.0f)
                lineToRelative(-26.0f, 26.0f)
                lineTo(55.19f, 154.0f)
                lineTo(30.57f, 129.38f)
                arcTo(1.94f, 1.94f, 0.0f, false, true, 30.0f, 128.0f)
                close()
                moveTo(129.38f, 225.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.76f, 0.0f)
                lineTo(67.19f, 166.0f)
                lineTo(96.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineTo(128.0f, 136.48f)
                lineToRelative(27.76f, 27.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 166.0f)
                horizontalLineToRelative(28.81f)
                close()
                moveTo(225.43f, 129.38f)
                lineTo(200.81f, 154.0f)
                lineTo(162.49f, 154.0f)
                lineToRelative(-26.0f, -26.0f)
                lineToRelative(26.0f, -26.0f)
                horizontalLineToRelative(38.32f)
                lineToRelative(24.62f, 24.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.76f)
                close()
            }
        }
        .build()
        return _pixlogo!!
    }

private var _pixlogo: ImageVector? = null
