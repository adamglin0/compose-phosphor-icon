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

public val RegularGroup.`Asterisk-simple`: ImageVector
    get() {
        if (`_asterisk-simple` != null) {
            return `_asterisk-simple`!!
        }
        `_asterisk-simple` = Builder(name = "Asterisk-simple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 103.43f)
                lineToRelative(-70.13f, 28.0f)
                lineToRelative(49.47f, 63.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.63f, 9.82f)
                lineTo(128.0f, 141.0f)
                lineTo(78.32f, 204.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.63f, -9.82f)
                lineToRelative(49.47f, -63.61f)
                lineTo(45.0f, 103.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 51.0f, 88.57f)
                lineToRelative(69.0f, 27.61f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(76.18f)
                lineToRelative(69.0f, -27.61f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 211.0f, 103.43f)
                close()
            }
        }
        .build()
        return `_asterisk-simple`!!
    }

private var `_asterisk-simple`: ImageVector? = null
