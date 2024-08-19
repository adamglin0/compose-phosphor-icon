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

public val LightGroup.`Cloud-arrow-down-light`: ImageVector
    get() {
        if (`_cloud-arrow-down-light` != null) {
            return `_cloud-arrow-down-light`!!
        }
        `_cloud-arrow-down-light` = Builder(name = "Cloud-arrow-down-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(85.27f, 85.27f, 0.0f, false, true, -17.2f, 51.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                arcTo(74.0f, 74.0f, 0.0f, true, false, 86.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(85.54f, 85.54f, 0.0f, false, true, 3.91f, -25.64f)
                arcTo(50.68f, 50.68f, 0.0f, false, false, 72.0f, 102.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f)
                lineTo(96.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(72.0f, 214.0f)
                arcTo(62.0f, 62.0f, 0.0f, true, true, 82.43f, 90.88f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(179.76f, 171.76f)
                lineTo(158.0f, 193.51f)
                lineTo(158.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(65.51f)
                lineToRelative(-21.76f, -21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                close()
            }
        }
        .build()
        return `_cloud-arrow-down-light`!!
    }

private var `_cloud-arrow-down-light`: ImageVector? = null
