package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`High-heel`: ImageVector
    get() {
        if (`_high-heel` != null) {
            return `_high-heel`!!
        }
        `_high-heel` = Builder(name = "High-heel", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.0f, 156.19f)
                lineTo(180.0f, 144.7f)
                lineTo(69.66f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.56f, 0.26f)
                curveTo(36.11f, 58.64f, 24.0f, 89.0f, 24.0f, 120.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(72.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(88.0f, 143.06f)
                curveToRelative(2.49f, 1.45f, 4.94f, 3.0f, 7.34f, 4.64f)
                arcToRelative(112.45f, 112.45f, 0.0f, false, true, 40.55f, 50.39f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 150.72f, 208.0f)
                lineTo(240.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-4.73f)
                arcTo(31.72f, 31.72f, 0.0f, false, false, 231.0f, 156.19f)
                close()
                moveTo(72.0f, 192.0f)
                lineTo(40.0f, 192.0f)
                lineTo(40.0f, 128.29f)
                arcToRelative(110.88f, 110.88f, 0.0f, false, true, 32.0f, 7.12f)
                close()
                moveTo(240.0f, 192.0f)
                lineTo(150.68f, 192.0f)
                arcToRelative(128.36f, 128.36f, 0.0f, false, false, -46.27f, -57.46f)
                arcToRelative(126.9f, 126.9f, 0.0f, false, false, -64.12f, -22.26f)
                arcTo(110.67f, 110.67f, 0.0f, false, true, 64.46f, 51.78f)
                lineTo(170.34f, 157.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.9f, 2.14f)
                lineToRelative(53.24f, 12.0f)
                arcTo(15.81f, 15.81f, 0.0f, false, true, 240.0f, 187.31f)
                close()
            }
        }
        .build()
        return `_high-heel`!!
    }

private var `_high-heel`: ImageVector? = null
