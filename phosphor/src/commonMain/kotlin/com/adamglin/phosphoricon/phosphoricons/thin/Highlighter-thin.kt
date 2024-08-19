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

public val ThinGroup.`Highlighter-thin`: ImageVector
    get() {
        if (`_highlighter-thin` != null) {
            return `_highlighter-thin`!!
        }
        `_highlighter-thin` = Builder(name = "Highlighter-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.83f, 109.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-50.34f, 50.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(104.49f, 74.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(50.34f, -50.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(98.83f, 63.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 98.37f, 80.0f)
                lineTo(74.83f, 103.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(82.34f, 128.0f)
                lineTo(21.17f, 189.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.57f, 6.62f)
                lineToRelative(72.0f, 24.0f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 96.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineTo(136.0f, 181.66f)
                lineToRelative(7.51f, 7.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(184.0f, 165.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.47f, -0.46f)
                lineToRelative(50.34f, -50.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 250.83f, 109.17f)
                close()
                moveTo(94.92f, 211.42f)
                lineTo(31.4f, 190.25f)
                lineTo(88.0f, 133.66f)
                lineTo(130.34f, 176.0f)
                close()
                moveTo(154.83f, 183.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(80.49f, 114.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(104.0f, 85.66f)
                lineTo(178.34f, 160.0f)
                close()
            }
        }
        .build()
        return `_highlighter-thin`!!
    }

private var `_highlighter-thin`: ImageVector? = null
