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

public val FillGroup.`Ny-times-logo-fill`: ImageVector
    get() {
        if (`_ny-times-logo-fill` != null) {
            return `_ny-times-logo-fill`!!
        }
        `_ny-times-logo-fill` = Builder(name = "Ny-times-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 136.0f)
                close()
                moveTo(184.62f, 103.25f)
                lineTo(118.91f, 72.59f)
                arcTo(71.95f, 71.95f, 0.0f, false, false, 56.06f, 141.3f)
                lineToRelative(68.18f, -36.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 112.0f)
                lineTo(136.0f, 215.55f)
                arcToRelative(71.64f, 71.64f, 0.0f, false, false, 60.71f, -50.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 212.0f, 170.4f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 51.74f, 100.1f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 68.0f, 32.0f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, true, 3.38f, 0.75f)
                lineTo(189.63f, 87.93f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 188.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                arcTo(8.05f, 8.05f, 0.0f, false, true, 184.62f, 103.25f)
                close()
                moveTo(96.0f, 208.47f)
                lineTo(96.0f, 138.13f)
                lineTo(57.51f, 158.66f)
                arcTo(72.23f, 72.23f, 0.0f, false, false, 96.0f, 208.47f)
                close()
                moveTo(96.13f, 62.0f)
                lineTo(66.37f, 48.07f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -5.2f, 38.71f)
                curveToRelative(0.6f, -0.71f, 1.2f, -1.42f, 1.84f, -2.11f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 96.13f, 62.0f)
                close()
            }
        }
        .build()
        return `_ny-times-logo-fill`!!
    }

private var `_ny-times-logo-fill`: ImageVector? = null
