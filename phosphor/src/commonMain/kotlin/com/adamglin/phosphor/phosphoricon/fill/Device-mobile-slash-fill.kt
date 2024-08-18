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

public val FillGroup.`Device-mobile-slash-fill`: ImageVector
    get() {
        if (`_device-mobile-slash-fill` != null) {
            return `_device-mobile-slash-fill`!!
        }
        `_device-mobile-slash-fill` = Builder(name = "Device-mobile-slash-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineToRelative(-2.26f, -2.48f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 240.0f)
                lineTo(80.0f, 240.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(56.0f, 60.69f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(186.08f, 156.21f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 150.83f)
                lineTo(200.0f, 40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(76.7f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.92f, 13.38f)
                close()
            }
        }
        .build()
        return `_device-mobile-slash-fill`!!
    }

private var `_device-mobile-slash-fill`: ImageVector? = null
