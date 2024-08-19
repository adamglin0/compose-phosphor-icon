package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Videocamera: ImageVector
    get() {
        if (_videocamera != null) {
            return _videocamera!!
        }
        _videocamera = Builder(name = "Videocamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.83f, 74.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.16f, 0.3f)
                lineTo(206.0f, 100.79f)
                lineTo(206.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(32.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 72.0f)
                lineTo(18.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(192.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(206.0f, 155.21f)
                lineTo(244.67f, 181.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.33f, -5.0f)
                lineTo(254.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 250.83f, 74.71f)
                close()
                moveTo(194.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(32.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(192.0f, 70.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(242.0f, 164.79f)
                lineTo(206.0f, 140.79f)
                lineTo(206.0f, 115.21f)
                lineToRelative(36.0f, -24.0f)
                close()
            }
        }
        .build()
        return _videocamera!!
    }

private var _videocamera: ImageVector? = null
