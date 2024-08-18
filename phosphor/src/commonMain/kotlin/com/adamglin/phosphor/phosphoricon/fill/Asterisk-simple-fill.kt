package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Asterisk-simple-fill`: ImageVector
    get() {
        if (`_asterisk-simple-fill` != null) {
            return `_asterisk-simple-fill`!!
        }
        `_asterisk-simple-fill` = Builder(name = "Asterisk-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(191.34f, 115.83f)
                lineTo(140.94f, 132.21f)
                lineTo(172.09f, 175.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.94f, 9.4f)
                lineTo(128.0f, 141.61f)
                lineTo(96.85f, 184.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.94f, -9.4f)
                lineToRelative(31.15f, -42.87f)
                lineToRelative(-50.4f, -16.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.94f, -15.22f)
                lineTo(120.0f, 117.0f)
                lineTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(53.0f)
                lineToRelative(50.4f, -16.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.94f, 15.22f)
                close()
            }
        }
        .build()
        return `_asterisk-simple-fill`!!
    }

private var `_asterisk-simple-fill`: ImageVector? = null
