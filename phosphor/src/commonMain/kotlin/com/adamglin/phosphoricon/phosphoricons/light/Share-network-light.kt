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

public val LightGroup.`Share-network-light`: ImageVector
    get() {
        if (`_share-network-light` != null) {
            return `_share-network-light`!!
        }
        `_share-network-light` = Builder(name = "Share-network-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 162.0f)
                arcToRelative(37.91f, 37.91f, 0.0f, false, false, -28.3f, 12.67f)
                lineTo(98.8f, 143.24f)
                arcToRelative(37.89f, 37.89f, 0.0f, false, false, 0.0f, -30.48f)
                lineToRelative(48.9f, -31.43f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -6.5f, -10.09f)
                lineTo(92.3f, 102.67f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 0.0f, 50.66f)
                lineToRelative(48.9f, 31.43f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 176.0f, 162.0f)
                close()
                moveTo(176.0f, 30.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 176.0f, 30.0f)
                close()
                moveTo(64.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 64.0f, 154.0f)
                close()
                moveTo(176.0f, 226.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 176.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_share-network-light`!!
    }

private var `_share-network-light`: ImageVector? = null
