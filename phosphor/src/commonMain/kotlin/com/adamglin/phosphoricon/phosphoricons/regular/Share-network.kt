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

public val RegularGroup.`Share-network`: ImageVector
    get() {
        if (`_share-network` != null) {
            return `_share-network`!!
        }
        `_share-network` = Builder(name = "Share-network", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 160.0f)
                arcToRelative(39.89f, 39.89f, 0.0f, false, false, -28.62f, 12.09f)
                lineToRelative(-46.1f, -29.63f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, 0.0f, -28.92f)
                lineToRelative(46.1f, -29.63f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -8.66f, -13.45f)
                lineToRelative(-46.1f, 29.63f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 55.82f)
                lineToRelative(46.1f, 29.63f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 176.0f, 160.0f)
                close()
                moveTo(176.0f, 32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 32.0f)
                close()
                moveTo(64.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 64.0f, 152.0f)
                close()
                moveTo(176.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_share-network`!!
    }

private var `_share-network`: ImageVector? = null
