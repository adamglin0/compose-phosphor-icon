package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Webhooks-logo-duotone`: ImageVector
    get() {
        if (`_webhooks-logo-duotone` != null) {
            return `_webhooks-logo-duotone`!!
        }
        `_webhooks-logo-duotone` = Builder(name = "Webhooks-logo-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 104.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 104.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 192.0f, 128.0f)
                close()
                moveTo(64.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 64.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.16f, 176.0f)
                lineTo(111.32f, 176.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 25.6f, 139.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, 9.61f)
                arcTo(31.69f, 31.69f, 0.0f, false, false, 32.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(74.16f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 16.0f)
                close()
                moveTo(64.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.08f, -23.61f)
                lineToRelative(35.77f, -58.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.62f, -11.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 46.1f, -40.06f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 172.0f, 44.79f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -75.62f, 55.33f)
                lineTo(64.44f, 152.0f)
                curveToRelative(-0.15f, 0.0f, -0.29f, 0.0f, -0.44f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                close()
                moveTo(192.0f, 120.0f)
                arcToRelative(48.18f, 48.18f, 0.0f, false, false, -18.0f, 3.49f)
                lineTo(142.08f, 71.6f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 128.0f, 80.0f)
                lineToRelative(0.44f, 0.0f)
                lineToRelative(35.78f, 58.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, 2.61f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 192.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return `_webhooks-logo-duotone`!!
    }

private var `_webhooks-logo-duotone`: ImageVector? = null
