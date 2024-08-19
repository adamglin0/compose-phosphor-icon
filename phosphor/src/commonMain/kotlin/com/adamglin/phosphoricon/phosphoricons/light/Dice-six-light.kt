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

public val LightGroup.`Dice-six-light`: ImageVector
    get() {
        if (`_dice-six-light` != null) {
            return `_dice-six-light`!!
        }
        `_dice-six-light` = Builder(name = "Dice-six-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 34.0f)
                lineTo(64.0f, 34.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 34.0f, 64.0f)
                lineTo(34.0f, 192.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, 30.0f)
                lineTo(192.0f, 222.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, -30.0f)
                lineTo(222.0f, 64.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 192.0f, 34.0f)
                close()
                moveTo(210.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, 18.0f)
                lineTo(64.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(46.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 64.0f, 46.0f)
                lineTo(192.0f, 46.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                close()
                moveTo(102.0f, 84.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 92.0f, 74.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 84.0f)
                close()
                moveTo(174.0f, 84.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 84.0f)
                close()
                moveTo(102.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 128.0f)
                close()
                moveTo(174.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 128.0f)
                close()
                moveTo(102.0f, 172.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 172.0f)
                close()
                moveTo(174.0f, 172.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_dice-six-light`!!
    }

private var `_dice-six-light`: ImageVector? = null
