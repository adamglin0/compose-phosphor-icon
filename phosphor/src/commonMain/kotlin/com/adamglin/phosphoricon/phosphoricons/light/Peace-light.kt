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

public val LightGroup.`Peace-light`: ImageVector
    get() {
        if (`_peace-light` != null) {
            return `_peace-light`!!
        }
        `_peace-light` = Builder(name = "Peace-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(89.44f, 89.44f, 0.0f, false, true, -13.0f, 46.58f)
                lineToRelative(-71.0f, -49.7f)
                lineTo(134.0f, 38.2f)
                arcTo(90.12f, 90.12f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(122.0f, 38.2f)
                verticalLineToRelative(86.68f)
                lineToRelative(-71.0f, 49.7f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(57.92f, 184.4f)
                lineTo(122.0f, 139.53f)
                lineTo(122.0f, 217.8f)
                arcTo(89.93f, 89.93f, 0.0f, false, true, 57.92f, 184.4f)
                close()
                moveTo(134.0f, 217.8f)
                lineTo(134.0f, 139.53f)
                lineToRelative(64.08f, 44.87f)
                arcTo(89.93f, 89.93f, 0.0f, false, true, 134.0f, 217.8f)
                close()
            }
        }
        .build()
        return `_peace-light`!!
    }

private var `_peace-light`: ImageVector? = null
