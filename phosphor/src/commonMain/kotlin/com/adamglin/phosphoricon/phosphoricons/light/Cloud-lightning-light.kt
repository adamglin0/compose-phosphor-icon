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

public val LightGroup.`Cloud-lightning-light`: ImageVector
    get() {
        if (`_cloud-lightning-light` != null) {
            return `_cloud-lightning-light`!!
        }
        `_cloud-lightning-light` = Builder(name = "Cloud-lightning-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 18.0f)
                arcTo(74.21f, 74.21f, 0.0f, false, false, 86.11f, 67.3f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, -1.83f, -0.62f)
                arcTo(50.83f, 50.83f, 0.0f, false, false, 76.0f, 66.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, 100.0f)
                horizontalLineToRelative(41.4f)
                lineTo(98.85f, 196.91f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 206.0f)
                horizontalLineToRelative(29.4f)
                lineToRelative(-18.55f, 30.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.3f, 6.18f)
                lineToRelative(24.0f, -40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 194.0f)
                lineTo(114.6f, 194.0f)
                lineToRelative(16.8f, -28.0f)
                lineTo(156.0f, 166.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f)
                close()
                moveTo(156.0f, 154.0f)
                lineTo(76.0f, 154.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 6.31f, -75.48f)
                arcToRelative(6.82f, 6.82f, 0.0f, false, false, 0.79f, 0.08f)
                arcTo(72.86f, 72.86f, 0.0f, false, false, 82.0f, 87.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.7f)
                arcTo(62.06f, 62.06f, 0.0f, true, true, 156.0f, 154.0f)
                close()
            }
        }
        .build()
        return `_cloud-lightning-light`!!
    }

private var `_cloud-lightning-light`: ImageVector? = null
