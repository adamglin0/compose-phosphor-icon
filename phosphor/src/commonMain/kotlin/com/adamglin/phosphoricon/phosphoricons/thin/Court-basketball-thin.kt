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

public val ThinGroup.`Court-basketball-thin`: ImageVector
    get() {
        if (`_court-basketball-thin` != null) {
            return `_court-basketball-thin`!!
        }
        `_court-basketball-thin` = Builder(name = "Court-basketball-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(228.0f, 164.0f)
                lineTo(216.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(28.0f, 92.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                lineTo(28.0f, 164.0f)
                close()
                moveTo(28.0f, 192.0f)
                lineTo(28.0f, 172.0f)
                lineTo(40.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                lineTo(28.0f, 84.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(124.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 192.0f)
                close()
                moveTo(224.0f, 196.0f)
                lineTo(132.0f, 196.0f)
                lineTo(132.0f, 60.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(228.0f, 84.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, 88.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 224.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_court-basketball-thin`!!
    }

private var `_court-basketball-thin`: ImageVector? = null
