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

public val FillGroup.`High-heel-fill`: ImageVector
    get() {
        if (`_high-heel-fill` != null) {
            return `_high-heel-fill`!!
        }
        `_high-heel-fill` = Builder(name = "High-heel-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 144.0f)
                arcToRelative(95.28f, 95.28f, 0.0f, false, true, 37.53f, 7.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.47f, 3.7f)
                lineTo(72.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(231.0f, 156.19f)
                lineTo(180.0f, 144.71f)
                lineTo(69.66f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.56f, 0.26f)
                curveTo(36.11f, 58.64f, 24.0f, 89.0f, 24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                arcToRelative(111.2f, 111.2f, 0.0f, false, true, 63.34f, 19.7f)
                arcToRelative(112.45f, 112.45f, 0.0f, false, true, 40.55f, 50.39f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 150.72f, 208.0f)
                lineTo(240.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-4.73f)
                arcTo(31.72f, 31.72f, 0.0f, false, false, 231.0f, 156.19f)
                close()
            }
        }
        .build()
        return `_high-heel-fill`!!
    }

private var `_high-heel-fill`: ImageVector? = null
