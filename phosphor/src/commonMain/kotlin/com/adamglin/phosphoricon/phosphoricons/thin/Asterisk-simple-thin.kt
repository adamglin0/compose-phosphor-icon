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

public val ThinGroup.`Asterisk-simple-thin`: ImageVector
    get() {
        if (`_asterisk-simple-thin` != null) {
            return `_asterisk-simple-thin`!!
        }
        `_asterisk-simple-thin` = Builder(name = "Asterisk-simple-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.48f, 99.71f)
                lineToRelative(-75.06f, 30.0f)
                lineToRelative(52.74f, 67.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.71f, 5.62f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 184.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, -1.54f)
                lineTo(128.0f, 134.52f)
                lineTo(75.16f, 202.46f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.45f, -0.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.71f, -5.62f)
                lineToRelative(52.74f, -67.8f)
                lineToRelative(-75.06f, -30.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.0f, -7.42f)
                lineTo(124.0f, 122.09f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(82.09f)
                lineToRelative(74.51f, -29.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.0f, 7.42f)
                close()
            }
        }
        .build()
        return `_asterisk-simple-thin`!!
    }

private var `_asterisk-simple-thin`: ImageVector? = null
