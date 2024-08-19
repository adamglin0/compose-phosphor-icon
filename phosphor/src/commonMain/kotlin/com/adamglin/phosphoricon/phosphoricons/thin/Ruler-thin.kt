package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Ruler-thin`: ImageVector
    get() {
        if (`_ruler-thin` != null) {
            return `_ruler-thin`!!
        }
        `_ruler-thin` = Builder(name = "Ruler-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 76.2f)
                lineTo(179.8f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(23.51f, 162.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(76.2f, 232.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(232.49f, 93.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 76.2f)
                close()
                moveTo(226.83f, 87.51f)
                lineTo(87.51f, 226.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, 0.0f)
                lineTo(29.17f, 174.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineTo(64.0f, 133.66f)
                lineToRelative(29.17f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(69.65f, 128.0f)
                lineTo(96.0f, 101.66f)
                lineToRelative(29.17f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(101.65f, 96.0f)
                lineTo(128.0f, 69.66f)
                lineToRelative(29.17f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                lineTo(133.66f, 64.0f)
                lineToRelative(34.83f, -34.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.65f, 0.0f)
                lineToRelative(52.69f, 52.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.83f, 87.51f)
                close()
            }
        }
        .build()
        return `_ruler-thin`!!
    }

private var `_ruler-thin`: ImageVector? = null
