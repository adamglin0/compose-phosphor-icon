package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Pencil-line-light`: ImageVector
    get() {
        if (`_pencil-line-light` != null) {
            return `_pencil-line-light`!!
        }
        `_pencil-line-light` = Builder(name = "Pencil-line-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.91f, 74.79f)
                lineTo(181.22f, 30.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(38.1f, 153.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(110.49f)
                lineTo(225.91f, 94.59f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 225.91f, 74.79f)
                close()
                moveTo(76.49f, 188.0f)
                lineTo(164.0f, 100.48f)
                lineTo(183.52f, 120.0f)
                lineTo(96.0f, 207.51f)
                close()
                moveTo(68.0f, 179.52f)
                lineTo(48.49f, 160.0f)
                lineTo(136.0f, 72.49f)
                lineTo(155.52f, 92.0f)
                close()
                moveTo(46.0f, 208.0f)
                verticalLineTo(174.48f)
                lineTo(81.52f, 210.0f)
                horizontalLineTo(48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(217.42f, 86.1f)
                lineTo(192.0f, 111.52f)
                lineTo(144.49f, 64.0f)
                lineTo(169.9f, 38.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(44.69f, 44.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.42f, 86.1f)
                close()
            }
        }
        .build()
        return `_pencil-line-light`!!
    }

private var `_pencil-line-light`: ImageVector? = null
