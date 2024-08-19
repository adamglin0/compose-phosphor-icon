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

public val RegularGroup.`Whatsapp-logo`: ImageVector
    get() {
        if (`_whatsapp-logo` != null) {
            return `_whatsapp-logo`!!
        }
        `_whatsapp-logo` = Builder(name = "Whatsapp-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.58f, 144.84f)
                lineToRelative(-32.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 0.5f)
                lineToRelative(-14.69f, 9.8f)
                arcToRelative(40.55f, 40.55f, 0.0f, false, true, -16.0f, -16.0f)
                lineToRelative(9.8f, -14.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.5f, -8.0f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 187.58f, 144.84f)
                close()
                moveTo(152.0f, 176.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 99.29f, 80.46f)
                lineToRelative(11.48f, 23.0f)
                lineTo(101.0f, 118.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.73f, 7.51f)
                arcToRelative(56.47f, 56.47f, 0.0f, false, false, 30.15f, 30.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 138.0f, 155.0f)
                lineToRelative(14.61f, -9.74f)
                lineToRelative(23.0f, 11.48f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 176.0f)
                close()
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 36.18f, 176.88f)
                lineTo(24.83f, 210.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.24f, 20.24f)
                lineToRelative(34.05f, -11.35f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.87f, 87.87f, 0.0f, false, true, -44.06f, -11.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.54f, -0.67f)
                lineTo(40.0f, 216.0f)
                lineTo(52.47f, 178.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.66f, -6.54f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_whatsapp-logo`!!
    }

private var `_whatsapp-logo`: ImageVector? = null
