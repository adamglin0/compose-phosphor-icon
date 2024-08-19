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

public val ThinGroup.`Suitcase-thin`: ImageVector
    get() {
        if (`_suitcase-thin` != null) {
            return `_suitcase-thin`!!
        }
        `_suitcase-thin` = Builder(name = "Suitcase-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 60.0f)
                lineTo(172.0f, 60.0f)
                lineTo(172.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(104.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 48.0f)
                lineTo(84.0f, 60.0f)
                lineTo(40.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 72.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 60.0f)
                close()
                moveTo(84.0f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(84.0f, 68.0f)
                close()
                moveTo(164.0f, 204.0f)
                lineTo(92.0f, 204.0f)
                lineTo(92.0f, 68.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(164.0f, 60.0f)
                lineTo(92.0f, 60.0f)
                lineTo(92.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(172.0f, 204.0f)
                lineTo(172.0f, 68.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_suitcase-thin`!!
    }

private var `_suitcase-thin`: ImageVector? = null
