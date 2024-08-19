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

public val ThinGroup.`Dice-two-thin`: ImageVector
    get() {
        if (`_dice-two-thin` != null) {
            return `_dice-two-thin`!!
        }
        `_dice-two-thin` = Builder(name = "Dice-two-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 36.0f, 64.0f)
                lineTo(36.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(220.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 192.0f, 36.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(44.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 44.0f)
                lineTo(192.0f, 44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(116.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 108.0f)
                close()
                moveTo(156.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 148.0f)
                close()
            }
        }
        .build()
        return `_dice-two-thin`!!
    }

private var `_dice-two-thin`: ImageVector? = null
