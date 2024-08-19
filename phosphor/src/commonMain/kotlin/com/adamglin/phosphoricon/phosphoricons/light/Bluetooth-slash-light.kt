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

public val LightGroup.`Bluetooth-slash-light`: ImageVector
    get() {
        if (`_bluetooth-slash-light` != null) {
            return `_bluetooth-slash-light`!!
        }
        `_bluetooth-slash-light` = Builder(name = "Bluetooth-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.44f, 212.0f)
                lineTo(60.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 51.56f, 44.0f)
                lineToRelative(72.32f, 79.55f)
                lineTo(60.4f, 171.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.2f, 9.6f)
                lineTo(122.0f, 140.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f)
                lineToRelative(52.28f, -39.21f)
                lineTo(211.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(134.0f, 212.0f)
                verticalLineTo(140.0f)
                lineToRelative(15.09f, 11.31f)
                lineToRelative(26.68f, 29.36f)
                close()
                moveTo(122.0f, 71.63f)
                verticalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, -4.8f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 9.6f)
                lineTo(162.07f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.2f, -9.6f)
                lineTo(182.0f, 80.0f)
                lineTo(134.0f, 44.0f)
                verticalLineTo(71.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_bluetooth-slash-light`!!
    }

private var `_bluetooth-slash-light`: ImageVector? = null
