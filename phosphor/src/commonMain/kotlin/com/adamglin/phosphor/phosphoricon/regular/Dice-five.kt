package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Dice-five`: ImageVector
    get() {
        if (`_dice-five` != null) {
            return `_dice-five`!!
        }
        `_dice-five` = Builder(name = "Dice-five", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(224.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 192.0f, 32.0f)
                close()
                moveTo(208.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 48.0f)
                lineTo(192.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(104.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 92.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 92.0f)
                close()
                moveTo(176.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 92.0f)
                close()
                moveTo(104.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 164.0f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
                moveTo(176.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_dice-five`!!
    }

private var `_dice-five`: ImageVector? = null
