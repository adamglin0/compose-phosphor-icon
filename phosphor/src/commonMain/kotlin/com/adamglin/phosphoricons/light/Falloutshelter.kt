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

public val LightGroup.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) {
            return _falloutShelter!!
        }
        _falloutShelter = Builder(name = "FalloutShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(197.29f, 125.17f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 122.0f)
                lineTo(139.21f, 122.0f)
                lineTo(165.0f, 83.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 74.0f)
                lineTo(96.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 9.33f)
                lineTo(116.79f, 122.0f)
                lineTo(64.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 9.33f)
                lineToRelative(32.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.0f, 0.0f)
                lineToRelative(27.0f, -40.51f)
                lineToRelative(27.0f, 40.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.0f, 0.0f)
                lineToRelative(32.0f, -48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 197.29f, 125.17f)
                close()
                moveTo(148.79f, 86.0f)
                lineTo(128.0f, 117.18f)
                lineTo(107.21f, 86.0f)
                close()
                moveTo(96.0f, 165.18f)
                lineTo(75.21f, 134.0f)
                horizontalLineToRelative(41.58f)
                close()
                moveTo(160.0f, 165.18f)
                lineTo(139.21f, 134.0f)
                horizontalLineToRelative(41.58f)
                close()
            }
        }
        .build()
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
