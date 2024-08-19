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

public val ThinGroup.`Check-fat-thin`: ImageVector
    get() {
        if (`_check-fat-thin` != null) {
            return `_check-fat-thin`!!
        }
        `_check-fat-thin` = Builder(name = "Check-fat-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.47f, 71.09f)
                lineToRelative(-24.0f, -23.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(104.0f, 141.83f)
                lineToRelative(-39.5f, -38.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(71.61f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(240.49f, 88.08f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.47f, 71.09f)
                close()
                moveTo(234.84f, 82.43f)
                lineTo(106.43f, 210.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.65f, 0.0f)
                lineToRelative(-71.61f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcTo(3.94f, 3.94f, 0.0f, false, true, 56.0f, 108.0f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, true, 2.89f, 1.21f)
                lineToRelative(42.35f, 41.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.59f, 0.0f)
                lineToRelative(98.37f, -97.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.68f, 0.0f)
                lineToRelative(24.0f, 23.58f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 234.84f, 82.43f)
                close()
            }
        }
        .build()
        return `_check-fat-thin`!!
    }

private var `_check-fat-thin`: ImageVector? = null
