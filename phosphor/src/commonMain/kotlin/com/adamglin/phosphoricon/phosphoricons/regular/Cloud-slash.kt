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

public val RegularGroup.`Cloud-slash`: ImageVector
    get() {
        if (`_cloud-slash` != null) {
            return `_cloud-slash`!!
        }
        `_cloud-slash` = Builder(name = "Cloud-slash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(81.32f, 88.55f)
                lineToRelative(-0.06f, 0.12f)
                arcTo(65.0f, 65.0f, 0.0f, false, false, 72.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(87.34f, 87.34f, 0.0f, false, false, 31.8f, -5.93f)
                lineToRelative(10.28f, 11.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.3f, 0.12f)
                arcTo(88.4f, 88.4f, 0.0f, false, false, 72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(72.25f, 72.25f, 0.0f, false, true, 5.06f, -26.54f)
                lineToRelative(87.0f, 95.7f)
                arcTo(71.66f, 71.66f, 0.0f, false, true, 160.0f, 200.0f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(87.89f, 87.89f, 0.0f, false, true, -22.35f, 58.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.71f, 176.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 117.37f, 70.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.48f, -12.89f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_cloud-slash`!!
    }

private var `_cloud-slash`: ImageVector? = null
