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

public val LightGroup.`Webhooks-logo-light`: ImageVector
    get() {
        if (`_webhooks-logo-light` != null) {
            return `_webhooks-logo-light`!!
        }
        `_webhooks-logo-light` = Builder(name = "Webhooks-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.37f, 174.0f)
                lineTo(109.6f, 174.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, -82.4f, -33.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, 7.21f)
                arcTo(33.68f, 33.68f, 0.0f, false, false, 30.0f, 168.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(75.37f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 0.0f, 12.0f)
                close()
                moveTo(64.0f, 182.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.73f, -21.62f)
                lineToRelative(36.42f, -59.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -8.25f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 49.0f, -42.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, -4.79f)
                arcTo(46.0f, 46.0f, 0.0f, true, false, 99.0f, 99.7f)
                lineTo(65.52f, 154.08f)
                curveToRelative(-0.5f, -0.05f, -1.0f, -0.08f, -1.52f, -0.08f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f)
                close()
                moveTo(192.0f, 122.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -18.8f, 4.0f)
                lineTo(139.73f, 71.61f)
                arcTo(14.0f, 14.0f, 0.0f, true, false, 128.0f, 78.0f)
                arcToRelative(12.79f, 12.79f, 0.0f, false, false, 1.52f, -0.09f)
                lineToRelative(36.4f, 59.17f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, false, 3.73f, 2.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.53f, -0.73f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 192.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                close()
            }
        }
        .build()
        return `_webhooks-logo-light`!!
    }

private var `_webhooks-logo-light`: ImageVector? = null
