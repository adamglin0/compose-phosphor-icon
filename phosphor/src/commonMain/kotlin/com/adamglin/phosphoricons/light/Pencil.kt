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

public val LightGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 74.78f)
                lineTo(181.21f, 30.09f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(38.1f, 153.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(92.69f, 222.0f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineTo(225.9f, 94.58f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                close()
                moveTo(48.49f, 160.0f)
                lineTo(136.0f, 72.48f)
                lineTo(155.51f, 92.0f)
                lineTo(68.0f, 179.51f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 174.48f)
                lineTo(81.51f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(96.0f, 207.51f)
                lineTo(76.49f, 188.0f)
                lineTo(164.0f, 100.48f)
                lineTo(183.51f, 120.0f)
                close()
                moveTo(217.41f, 86.1f)
                lineTo(192.0f, 111.51f)
                lineTo(144.49f, 64.0f)
                lineTo(169.9f, 38.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(44.68f, 44.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
