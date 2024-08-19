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

public val RegularGroup.`Framer-logo`: ImageVector
    get() {
        if (`_framer-logo` != null) {
            return `_framer-logo`!!
        }
        `_framer-logo` = Builder(name = "Framer-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 104.0f)
                lineTo(208.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(56.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.31f, 14.0f)
                lineTo(107.0f, 96.0f)
                lineTo(56.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, 5.66f)
                lineToRelative(72.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 240.0f)
                lineTo(136.0f, 176.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.31f, -14.0f)
                lineTo(149.0f, 112.0f)
                horizontalLineToRelative(51.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 104.0f)
                close()
                moveTo(179.0f, 160.0f)
                lineTo(128.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(52.69f)
                lineToRelative(-56.0f, -56.0f)
                lineTo(64.0f, 112.0f)
                horizontalLineToRelative(61.0f)
                close()
                moveTo(192.0f, 96.0f)
                lineTo(131.0f, 96.0f)
                lineTo(77.0f, 48.0f)
                lineTo(192.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_framer-logo`!!
    }

private var `_framer-logo`: ImageVector? = null
