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

public val LightGroup.`Bluetooth-light`: ImageVector
    get() {
        if (`_bluetooth-light` != null) {
            return `_bluetooth-light`!!
        }
        `_bluetooth-light` = Builder(name = "Bluetooth-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.6f, 171.2f)
                lineTo(138.0f, 128.0f)
                lineToRelative(57.6f, -43.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 122.0f, 32.0f)
                verticalLineToRelative(84.0f)
                lineTo(67.6f, 75.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.2f, 9.6f)
                lineTo(118.0f, 128.0f)
                lineTo(60.4f, 171.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.2f, 9.6f)
                lineTo(122.0f, 140.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                close()
                moveTo(134.0f, 44.0f)
                lineToRelative(48.0f, 36.0f)
                lineToRelative(-48.0f, 36.0f)
                close()
                moveTo(134.0f, 212.0f)
                lineTo(134.0f, 140.0f)
                lineToRelative(48.0f, 36.0f)
                close()
            }
        }
        .build()
        return `_bluetooth-light`!!
    }

private var `_bluetooth-light`: ImageVector? = null
