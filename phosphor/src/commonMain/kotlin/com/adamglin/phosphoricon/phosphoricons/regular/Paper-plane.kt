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

public val RegularGroup.`Paper-plane`: ImageVector
    get() {
        if (`_paper-plane` != null) {
            return `_paper-plane`!!
        }
        `_paper-plane` = Builder(name = "Paper-plane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.9f, 200.1f)
                lineTo(141.85f, 32.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.89f, 0.0f)
                lineToRelative(-95.89f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.26f, 22.92f)
                lineTo(128.0f, 192.45f)
                lineToRelative(90.67f, 30.63f)
                arcTo(16.22f, 16.22f, 0.0f, false, false, 224.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.86f, -23.9f)
                close()
                moveTo(223.85f, 207.94f)
                lineTo(136.0f, 178.26f)
                lineTo(136.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(58.26f)
                lineTo(32.16f, 207.94f)
                lineTo(32.0f, 208.0f)
                lineTo(127.86f, 40.0f)
                lineTo(224.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_paper-plane`!!
    }

private var `_paper-plane`: ImageVector? = null
