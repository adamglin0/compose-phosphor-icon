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

public val FillGroup.`Smiley-melting-fill`: ImageVector
    get() {
        if (`_smiley-melting-fill` != null) {
            return `_smiley-melting-fill`!!
        }
        `_smiley-melting-fill` = Builder(name = "Smiley-melting-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.6f, 176.0f)
                lineTo(220.24f, 176.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, -184.52f, 0.0f)
                lineTo(20.4f, 176.0f)
                arcTo(12.26f, 12.26f, 0.0f, false, false, 8.0f, 187.78f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 200.0f)
                lineTo(80.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(72.16f, 216.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.0f, 6.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 232.0f)
                lineTo(199.73f, 232.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 8.25f, -7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.53f)
                lineTo(144.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(7.79f)
                arcToRelative(8.28f, 8.28f, 0.0f, false, false, 8.15f, -7.05f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 184.0f)
                lineTo(136.0f, 184.0f)
                curveToRelative(-14.93f, 0.0f, -30.59f, -5.78f, -43.0f, -15.85f)
                curveToRelative(-13.55f, -11.0f, -21.0f, -25.27f, -21.0f, -40.15f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, true, 0.71f, -9.0f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, true, 8.85f, -7.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 9.27f)
                arcTo(41.33f, 41.33f, 0.0f, false, false, 88.0f, 128.0f)
                curveToRelative(0.0f, 22.16f, 26.26f, 40.0f, 48.0f, 40.0f)
                horizontalLineToRelative(15.44f)
                curveToRelative(13.5f, 0.0f, 24.86f, 11.05f, 24.55f, 24.55f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -0.23f, 2.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.62f)
                lineTo(236.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.22f)
                arcTo(12.26f, 12.26f, 0.0f, false, false, 235.6f, 176.0f)
                close()
                moveTo(127.9f, 93.56f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 114.44f, 80.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 127.9f, 93.56f)
                close()
                moveTo(175.9f, 141.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.46f, -13.46f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 175.9f, 141.56f)
                close()
            }
        }
        .build()
        return `_smiley-melting-fill`!!
    }

private var `_smiley-melting-fill`: ImageVector? = null
