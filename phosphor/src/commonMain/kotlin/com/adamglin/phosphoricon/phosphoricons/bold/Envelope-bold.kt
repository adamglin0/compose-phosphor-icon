package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Envelope-bold`: ImageVector
    get() {
        if (`_envelope-bold` != null) {
            return `_envelope-bold`!!
        }
        `_envelope-bold` = Builder(name = "Envelope-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(128.0f, 127.72f)
                lineTo(62.85f, 68.0f)
                horizontalLineToRelative(130.3f)
                close()
                moveTo(92.79f, 128.0f)
                lineTo(44.0f, 172.72f)
                lineTo(44.0f, 83.28f)
                close()
                moveTo(110.55f, 144.28f)
                lineTo(119.89f, 152.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.22f, 0.0f)
                lineToRelative(9.34f, -8.57f)
                lineTo(193.15f, 188.0f)
                lineTo(62.85f, 188.0f)
                close()
                moveTo(163.21f, 128.0f)
                lineTo(212.0f, 83.28f)
                verticalLineToRelative(89.44f)
                close()
            }
        }
        .build()
        return `_envelope-bold`!!
    }

private var `_envelope-bold`: ImageVector? = null
