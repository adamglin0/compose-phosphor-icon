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

public val ThinGroup.`Escalator-down-thin`: ImageVector
    get() {
        if (`_escalator-down-thin` != null) {
            return `_escalator-down-thin`!!
        }
        `_escalator-down-thin` = Builder(name = "Escalator-down-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.17f, 82.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(196.0f, 94.34f)
                lineTo(196.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(204.0f, 94.34f)
                lineToRelative(17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                close()
                moveTo(236.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(168.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.94f, -1.29f)
                lineTo(70.25f, 108.0f)
                lineTo(32.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 96.0f)
                lineTo(20.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 44.0f)
                lineTo(88.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.94f, 1.29f)
                lineTo(185.75f, 148.0f)
                lineTo(224.0f, 148.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 160.0f)
                close()
                moveTo(228.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(184.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.94f, -1.29f)
                lineTo(86.25f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(72.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.94f, 1.29f)
                lineTo(169.75f, 204.0f)
                lineTo(224.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return `_escalator-down-thin`!!
    }

private var `_escalator-down-thin`: ImageVector? = null
