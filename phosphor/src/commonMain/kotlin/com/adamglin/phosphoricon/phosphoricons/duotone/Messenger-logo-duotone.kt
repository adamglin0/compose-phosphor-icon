package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Messenger-logo-duotone`: ImageVector
    get() {
        if (`_messenger-logo-duotone` != null) {
            return `_messenger-logo-duotone`!!
        }
        `_messenger-logo-duotone` = Builder(name = "Messenger-logo-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 79.93f, 211.11f)
                horizontalLineToRelative(0.0f)
                lineTo(42.54f, 223.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.12f, -10.12f)
                lineToRelative(12.47f, -37.39f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.66f, 106.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineTo(112.0f, 123.31f)
                lineTo(85.66f, 149.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineTo(144.0f, 132.69f)
                lineToRelative(26.34f, -26.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 181.66f, 106.34f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 79.12f, 219.82f)
                lineTo(45.07f, 231.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -20.24f, -20.24f)
                lineToRelative(11.35f, -34.05f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 51.81f, 172.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.66f, 6.54f)
                lineTo(40.0f, 216.0f)
                lineTo(77.4f, 203.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.54f, 0.67f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_messenger-logo-duotone`!!
    }

private var `_messenger-logo-duotone`: ImageVector? = null
