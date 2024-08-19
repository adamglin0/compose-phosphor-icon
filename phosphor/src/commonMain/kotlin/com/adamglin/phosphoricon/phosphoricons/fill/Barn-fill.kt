package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Barn-fill`: ImageVector
    get() {
        if (`_barn-fill` != null) {
            return `_barn-fill`!!
        }
        `_barn-fill` = Builder(name = "Barn-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 192.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 130.57f)
                lineToRelative(1.49f, 2.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, -9.3f)
                lineToRelative(-40.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, -1.94f)
                lineTo(137.0f, 18.77f)
                lineToRelative(-0.1f, -0.07f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.76f, 0.0f)
                lineToRelative(-0.1f, 0.07f)
                lineTo(51.45f, 65.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 1.94f)
                lineToRelative(-40.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, 9.3f)
                lineTo(24.0f, 130.57f)
                lineTo(24.0f, 192.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(112.0f, 80.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                lineTo(112.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                close()
                moveTo(164.64f, 120.0f)
                lineTo(128.0f, 146.17f)
                lineTo(91.36f, 120.0f)
                close()
                moveTo(72.0f, 125.83f)
                lineTo(114.24f, 156.0f)
                lineTo(72.0f, 186.17f)
                close()
                moveTo(91.36f, 192.0f)
                lineTo(128.0f, 165.83f)
                lineTo(164.64f, 192.0f)
                close()
                moveTo(184.0f, 186.17f)
                lineTo(141.76f, 156.0f)
                lineTo(184.0f, 125.83f)
                close()
            }
        }
        .build()
        return `_barn-fill`!!
    }

private var `_barn-fill`: ImageVector? = null
