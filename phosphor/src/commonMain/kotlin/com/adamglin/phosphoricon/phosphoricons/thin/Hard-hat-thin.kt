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

public val ThinGroup.`Hard-hat-thin`: ImageVector
    get() {
        if (`_hard-hat-thin` != null) {
            return `_hard-hat-thin`!!
        }
        `_hard-hat-thin` = Builder(name = "Hard-hat-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 156.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(220.0f, 136.0f)
                arcToRelative(92.35f, 92.35f, 0.0f, false, false, -64.0f, -87.65f)
                lineTo(156.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(112.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(8.35f)
                arcTo(92.35f, 92.35f, 0.0f, false, false, 36.0f, 136.0f)
                verticalLineToRelative(20.0f)
                lineTo(32.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 156.0f)
                close()
                moveTo(212.0f, 136.0f)
                verticalLineToRelative(20.0f)
                lineTo(156.0f, 156.0f)
                lineTo(156.0f, 56.8f)
                arcTo(84.33f, 84.33f, 0.0f, false, true, 212.0f, 136.0f)
                close()
                moveTo(112.0f, 36.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(148.0f, 156.0f)
                lineTo(108.0f, 156.0f)
                lineTo(108.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 36.0f)
                close()
                moveTo(44.0f, 136.0f)
                arcToRelative(84.33f, 84.33f, 0.0f, false, true, 56.0f, -79.2f)
                lineTo(100.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                close()
                moveTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_hard-hat-thin`!!
    }

private var `_hard-hat-thin`: ImageVector? = null
