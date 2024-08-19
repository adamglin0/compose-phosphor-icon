package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Chartdonut: ImageVector
    get() {
        if (_chartdonut != null) {
            return _chartdonut!!
        }
        _chartdonut = Builder(name = "Chartdonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(116.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -24.26f, 14.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 99.35f, 97.6f)
                lineToRelative(-48.5f, -28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 34.46f, 74.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f)
                close()
                moveTo(50.0f, 96.81f)
                lineToRelative(28.2f, 16.28f)
                arcTo(52.08f, 52.08f, 0.0f, false, false, 76.0f, 128.0f)
                curveToRelative(0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 1.5f)
                lineToRelative(-31.43f, 8.42f)
                arcTo(83.21f, 83.21f, 0.0f, false, true, 44.0f, 128.0f)
                arcTo(84.35f, 84.35f, 0.0f, false, true, 50.0f, 96.81f)
                close()
                moveTo(50.83f, 161.11f)
                lineTo(82.26f, 152.68f)
                arcTo(52.2f, 52.2f, 0.0f, false, false, 116.0f, 178.59f)
                verticalLineToRelative(32.54f)
                arcTo(84.26f, 84.26f, 0.0f, false, true, 50.81f, 161.11f)
                close()
                moveTo(140.02f, 211.11f)
                lineTo(140.02f, 178.59f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 140.0f, 77.4f)
                lineTo(140.0f, 44.85f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 0.0f, 166.28f)
                close()
            }
        }
        .build()
        return _chartdonut!!
    }

private var _chartdonut: ImageVector? = null
