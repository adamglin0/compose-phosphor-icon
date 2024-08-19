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

public val RegularGroup.`Cloud-fog`: ImageVector
    get() {
        if (`_cloud-fog` != null) {
            return `_cloud-fog`!!
        }
        `_cloud-fog` = Builder(name = "Cloud-fog", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 208.0f)
                lineTo(72.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(184.0f, 192.0f)
                lineTo(160.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(160.0f, 224.0f)
                lineTo(104.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.0f, 100.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f)
                lineTo(76.0f, 176.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 72.0f)
                arcToRelative(53.26f, 53.26f, 0.0f, false, true, 8.92f, 0.76f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 232.0f, 100.0f)
                close()
                moveTo(216.0f, 100.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, false, 96.0f, 96.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, -0.92f)
                quadToRelative(0.21f, -3.66f, 0.77f, -7.23f)
                arcTo(38.11f, 38.11f, 0.0f, false, false, 76.0f, 88.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                horizontalLineToRelative(80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 216.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_cloud-fog`!!
    }

private var `_cloud-fog`: ImageVector? = null
