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

public val LightGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.91f, 74.79f)
                lineTo(181.22f, 22.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(22.09f, 161.41f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineTo(74.78f, 233.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(233.91f, 94.59f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 233.91f, 74.79f)
                close()
                moveTo(225.42f, 86.1f)
                lineTo(86.1f, 225.41f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(30.58f, 172.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineTo(64.0f, 136.48f)
                lineToRelative(27.76f, 27.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f)
                lineTo(72.48f, 128.0f)
                lineTo(96.0f, 104.48f)
                lineToRelative(27.76f, 27.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(104.48f, 96.0f)
                lineTo(128.0f, 72.49f)
                lineToRelative(27.76f, 27.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(136.49f, 64.0f)
                lineTo(169.9f, 30.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(52.69f, 52.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.42f, 86.1f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
