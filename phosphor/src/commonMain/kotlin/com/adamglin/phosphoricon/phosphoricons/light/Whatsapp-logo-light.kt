package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Whatsapp-logo-light`: ImageVector
    get() {
        if (`_whatsapp-logo-light` != null) {
            return `_whatsapp-logo-light`!!
        }
        `_whatsapp-logo-light` = Builder(name = "Whatsapp-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.68f, 146.63f)
                lineToRelative(-32.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 0.38f)
                lineTo(133.0f, 141.46f)
                arcTo(42.49f, 42.49f, 0.0f, false, true, 114.54f, 123.0f)
                lineTo(125.0f, 107.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.38f, -6.0f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 66.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 86.0f, 86.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 186.68f, 146.63f)
                close()
                moveTo(152.0f, 178.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 22.42f, -25.75f)
                lineToRelative(12.66f, 25.32f)
                lineToRelative(-10.39f, 15.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.54f, 5.63f)
                arcToRelative(54.43f, 54.43f, 0.0f, false, false, 29.07f, 29.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.63f, -0.54f)
                lineToRelative(15.58f, -10.39f)
                lineToRelative(25.32f, 12.66f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 152.0f, 178.0f)
                close()
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 38.35f, 176.69f)
                lineTo(26.73f, 211.56f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.71f, 17.71f)
                lineToRelative(34.87f, -11.62f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.06f, -12.08f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, -3.0f, -0.81f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -1.9f, 0.31f)
                lineTo(40.65f, 217.88f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.53f, -2.53f)
                lineTo(50.58f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.91f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_whatsapp-logo-light`!!
    }

private var `_whatsapp-logo-light`: ImageVector? = null
