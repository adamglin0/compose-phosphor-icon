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

public val ThinGroup.`Desk-thin`: ImageVector
    get() {
        if (`_desk-thin` != null) {
            return `_desk-thin`!!
        }
        `_desk-thin` = Builder(name = "Desk-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 68.0f)
                lineTo(8.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(20.0f, 76.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(28.0f, 140.0f)
                lineTo(228.0f, 140.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(236.0f, 76.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(28.0f, 76.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(56.0f)
                lineTo(28.0f, 132.0f)
                close()
                moveTo(228.0f, 132.0f)
                lineTo(132.0f, 132.0f)
                lineTo(132.0f, 76.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(92.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(88.0f, 100.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 104.0f)
                close()
                moveTo(164.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(168.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_desk-thin`!!
    }

private var `_desk-thin`: ImageVector? = null
