package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Google-play-logo-fill`: ImageVector
    get() {
        if (`_google-play-logo-fill` != null) {
            return `_google-play-logo-fill`!!
        }
        `_google-play-logo-fill` = Builder(name = "Google-play-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.82f, 114.18f)
                lineTo(72.0f, 18.16f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.12f, 0.0f)
                arcTo(15.68f, 15.68f, 0.0f, false, false, 48.0f, 31.87f)
                verticalLineTo(224.13f)
                arcToRelative(15.68f, 15.68f, 0.0f, false, false, 7.92f, 13.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.12f, 0.0f)
                lineToRelative(167.78f, -96.0f)
                arcToRelative(15.76f, 15.76f, 0.0f, false, false, 0.0f, -27.64f)
                close()
                moveTo(160.0f, 139.31f)
                lineToRelative(18.92f, 18.92f)
                lineToRelative(-88.5f, 50.66f)
                close()
                moveTo(90.4f, 47.1f)
                lineToRelative(88.53f, 50.67f)
                lineTo(160.0f, 116.69f)
                close()
                moveTo(193.31f, 150.0f)
                lineToRelative(-22.0f, -22.0f)
                lineToRelative(22.0f, -22.0f)
                lineToRelative(38.43f, 22.0f)
                close()
            }
        }
        .build()
        return `_google-play-logo-fill`!!
    }

private var `_google-play-logo-fill`: ImageVector? = null
