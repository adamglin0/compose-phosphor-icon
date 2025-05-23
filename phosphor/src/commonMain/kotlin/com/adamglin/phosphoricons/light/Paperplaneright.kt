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

public val LightGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.88f, 115.69f)
                lineToRelative(-168.0f, -95.88f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -20.0f, 16.87f)
                lineTo(73.66f, 128.0f)
                lineTo(42.81f, 219.33f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 238.0f)
                arcToRelative(14.15f, 14.15f, 0.0f, false, false, 6.93f, -1.83f)
                lineTo(230.84f, 140.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -24.41f)
                close()
                moveTo(224.93f, 129.69f)
                lineTo(57.0f, 225.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.86f, -2.42f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.0f, -0.1f)
                lineTo(84.3f, 134.0f)
                lineTo(144.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(84.3f, 122.0f)
                lineTo(54.17f, 32.8f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.0f, -0.1f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 0.6f, -2.2f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 57.0f, 30.25f)
                lineToRelative(168.0f, 95.89f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.0f, 1.74f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.93f, 129.66f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
