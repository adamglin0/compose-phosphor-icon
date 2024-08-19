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

public val ThinGroup.`Cricket-thin`: ImageVector
    get() {
        if (`_cricket-thin` != null) {
            return `_cricket-thin`!!
        }
        `_cricket-thin` = Builder(name = "Cricket-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 84.2f)
                lineTo(187.8f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(63.52f, 138.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(87.0f, 179.31f)
                lineTo(37.17f, 229.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(92.69f, 185.0f)
                lineToRelative(23.51f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(240.49f, 101.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 84.2f)
                close()
                moveTo(127.49f, 202.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(98.34f, 179.31f)
                lineToRelative(32.49f, -32.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(92.69f, 173.66f)
                lineTo(69.17f, 150.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(105.66f, 108.0f)
                lineTo(164.0f, 108.0f)
                verticalLineToRelative(58.34f)
                close()
                moveTo(234.83f, 95.51f)
                lineTo(172.0f, 158.34f)
                lineTo(172.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(113.66f, 100.0f)
                lineToRelative(62.83f, -62.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(52.68f, 52.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 234.83f, 95.51f)
                close()
                moveTo(60.0f, 84.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 36.0f, 60.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 60.0f, 84.0f)
                close()
                moveTo(60.0f, 44.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 44.0f, 60.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 60.0f, 44.0f)
                close()
            }
        }
        .build()
        return `_cricket-thin`!!
    }

private var `_cricket-thin`: ImageVector? = null
