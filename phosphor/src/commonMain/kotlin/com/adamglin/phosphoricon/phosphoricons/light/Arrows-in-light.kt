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

public val LightGroup.`Arrows-in-light`: ImageVector
    get() {
        if (`_arrows-in-light` != null) {
            return `_arrows-in-light`!!
        }
        `_arrows-in-light` = Builder(name = "Arrows-in-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.0f, 104.0f)
                lineTo(146.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(158.0f, 89.51f)
                lineToRelative(45.76f, -45.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(166.48f, 98.0f)
                lineTo(192.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(152.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 146.0f, 104.0f)
                close()
                moveTo(104.0f, 146.0f)
                lineTo(64.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(89.52f, 158.0f)
                lineTo(43.76f, 203.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(98.0f, 166.48f)
                lineTo(98.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(110.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 146.0f)
                close()
                moveTo(166.48f, 158.0f)
                lineTo(192.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(152.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(158.0f, 166.48f)
                lineToRelative(45.76f, 45.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(104.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(98.0f, 89.51f)
                lineTo(52.24f, 43.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(89.52f, 98.0f)
                lineTo(64.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(110.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 58.0f)
                close()
            }
        }
        .build()
        return `_arrows-in-light`!!
    }

private var `_arrows-in-light`: ImageVector? = null
