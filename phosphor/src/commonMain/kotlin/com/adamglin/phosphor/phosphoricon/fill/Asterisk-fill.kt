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

public val FillGroup.`Asterisk-fill`: ImageVector
    get() {
        if (`_asterisk-fill` != null) {
            return `_asterisk-fill`!!
        }
        `_asterisk-fill` = Builder(name = "Asterisk-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(187.43f, 153.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, 14.93f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.0f, -1.07f)
                lineTo(136.0f, 141.86f)
                lineTo(136.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 141.86f)
                lineTo(76.57f, 166.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 65.65f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.92f, -10.93f)
                lineTo(112.0f, 128.0f)
                lineTo(68.57f, 102.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -13.86f)
                lineTo(120.0f, 114.14f)
                lineTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(50.14f)
                lineToRelative(43.43f, -25.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 13.86f)
                lineTo(144.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_asterisk-fill`!!
    }

private var `_asterisk-fill`: ImageVector? = null
