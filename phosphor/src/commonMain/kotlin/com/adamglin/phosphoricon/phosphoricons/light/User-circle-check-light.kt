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

public val LightGroup.`User-circle-check-light`: ImageVector
    get() {
        if (`_user-circle-check-light` != null) {
            return `_user-circle-check-light`!!
        }
        `_user-circle-check-light` = Builder(name = "User-circle-check-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.68f, 106.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.92f, 6.91f)
                arcTo(91.66f, 91.66f, 0.0f, false, true, 218.0f, 128.0f)
                arcToRelative(89.65f, 89.65f, 0.0f, false, true, -24.49f, 61.64f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, -31.38f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -51.0f, 0.0f)
                arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, 31.38f)
                arcTo(89.95f, 89.95f, 0.0f, false, true, 128.0f, 38.0f)
                arcToRelative(91.57f, 91.57f, 0.0f, false, true, 15.0f, 1.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 2.0f, -11.83f)
                arcToRelative(101.9f, 101.9f, 0.0f, true, false, 83.6f, 83.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 221.68f, 106.08f)
                close()
                moveTo(94.0f, 120.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 94.0f, 120.0f)
                close()
                moveTo(71.44f, 198.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 113.12f, 0.0f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, -113.12f, 0.0f)
                close()
                moveTo(236.24f, 44.24f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(200.0f, 63.51f)
                lineToRelative(27.76f, -27.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return `_user-circle-check-light`!!
    }

private var `_user-circle-check-light`: ImageVector? = null
