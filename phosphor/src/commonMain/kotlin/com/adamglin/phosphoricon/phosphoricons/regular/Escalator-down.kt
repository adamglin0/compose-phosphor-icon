package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Escalator-down`: ImageVector
    get() {
        if (`_escalator-down` != null) {
            return `_escalator-down`!!
        }
        `_escalator-down` = Builder(name = "Escalator-down", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.34f, 85.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(192.0f, 84.69f)
                lineTo(192.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 84.69f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                close()
                moveTo(240.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(168.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.88f, -2.57f)
                lineTo(68.5f, 112.0f)
                lineTo(32.0f, 112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 16.0f, 96.0f)
                lineTo(16.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 40.0f)
                lineTo(88.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.88f, 2.57f)
                lineTo(187.5f, 144.0f)
                lineTo(224.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 160.0f)
                close()
                moveTo(224.0f, 160.0f)
                lineTo(184.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.88f, -2.57f)
                lineTo(84.5f, 56.0f)
                lineTo(32.0f, 56.0f)
                lineTo(32.0f, 96.0f)
                lineTo(72.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.88f, 2.57f)
                lineTo(171.5f, 200.0f)
                lineTo(224.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_escalator-down`!!
    }

private var `_escalator-down`: ImageVector? = null
