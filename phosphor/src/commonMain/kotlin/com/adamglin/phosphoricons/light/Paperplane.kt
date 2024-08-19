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

public val LightGroup.Paperplane: ImageVector
    get() {
        if (_paperplane != null) {
            return _paperplane!!
        }
        _paperplane = Builder(name = "Paperplane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.17f, 201.09f)
                lineTo(140.1f, 33.16f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.41f, 0.0f)
                lineToRelative(-95.88f, 168.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.87f, 20.05f)
                lineTo(128.0f, 190.34f)
                lineToRelative(91.33f, 30.85f)
                arcTo(14.31f, 14.31f, 0.0f, false, false, 224.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.13f, -20.91f)
                close()
                moveTo(225.51f, 209.27f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.2f, 0.6f)
                lineToRelative(-0.1f, 0.0f)
                lineTo(134.0f, 179.7f)
                lineTo(134.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(59.7f)
                lineTo(32.8f, 209.83f)
                lineToRelative(-0.1f, 0.0f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.2f, -0.6f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, -0.24f, -2.22f)
                lineTo(126.14f, 39.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.74f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.78f, 1.07f)
                lineTo(225.73f, 207.0f)
                arcTo(1.86f, 1.86f, 0.0f, false, true, 225.51f, 209.27f)
                close()
            }
        }
        .build()
        return _paperplane!!
    }

private var _paperplane: ImageVector? = null
